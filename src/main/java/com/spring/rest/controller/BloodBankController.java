// Thedyson Luzon - 301127562 - April 1, 2023
package com.spring.rest.controller;

import com.spring.rest.model.BloodBank;
import com.spring.rest.service.BloodBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class BloodBankController {
    @Autowired
    BloodBankService bloodBankService;



    @RequestMapping(value = "/bloodbank/{bloodbankId}", method = RequestMethod.GET)
    BloodBank getBloodBank(@PathVariable("bloodbankId") int bloodbankId) throws Exception {
        return bloodBankService.getBloodbank(bloodbankId);
    }

    @RequestMapping(value = "/bloodbanks", method = RequestMethod.GET)
    Iterable<BloodBank> getBloodBanks() {
        return bloodBankService.getBloodBanks();
    }

    @RequestMapping(value = "/bloodbank", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    void addBloodBank(@RequestBody BloodBank bank) throws Exception {
        bloodBankService.addBloodBank(bank);
    }

    @RequestMapping(value = "/bloodbank/{bloodbankId}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    void updateBloodBank(@PathVariable("bloodbankId") int bloodbankId, @RequestBody BloodBank bank) throws Exception {
        bank.setBloodBankId(bloodbankId);
        bloodBankService.updateBloodBank(bank);
    }

    @RequestMapping(value = "/bloodbank/{bloodblankId}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    void deleteBloodBank(@PathVariable("bloodbankId") int bloodbankId) throws Exception {
        bloodBankService.deleteBloodBank(bloodbankId);
    }
}