// Thedyson Luzon - 301127562 - April 1, 2023

package com.spring.rest.service;

import com.spring.rest.model.BloodBank;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class BloodBankService {

    Map<Integer, BloodBank> bloodbank = new HashMap<>();

    public void addBloodBank(BloodBank bank) throws Exception {
        if(bloodbank.containsKey(bank.getBloodBankId())) {
            throw new Exception("This BloodBank Id already exists");
        }
        else {
            bloodbank.put(bank.getBloodBankId(), bank);
        }
    }
    public Iterable<BloodBank> getBloodBanks(){
        return bloodbank.values();
    }

    public BloodBank getBloodbank(int bloodbankId) throws Exception {

        if(bloodbank.containsKey(bloodbankId)) {
            return bloodbank.get(bloodbankId);
        }
        else {
            throw new Exception("BloodBank Id not found");
        }
    }

    public void updateBloodBank(BloodBank bank) throws Exception {
        if(bloodbank.containsKey(bank.getBloodBankId())) {
            bloodbank.put(bank.getBloodBankId(), bank);
        }
        else {
            throw new Exception("BloodBank Id not found");
        }
    }

    public void deleteBloodBank(int bloodbankId) throws Exception {
        if(bloodbank.containsKey(bloodbankId)) {
            bloodbank.remove(bloodbankId);
        }
        else {
            throw new Exception("BloodBank Id not found");
        }
    }

}
