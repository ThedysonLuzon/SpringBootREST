package com.spring.rest.service;

import com.spring.rest.model.BloodStock;
import com.spring.rest.model.Seeker;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class BloodStockService {

    Map<Integer, BloodStock> bloodstock = new HashMap<>();

    public void addBloodStock(BloodStock stock) throws Exception {
        if(bloodstock.containsKey(stock.getBloodstockId())) {
            throw new Exception("This BloodStock Id already exists");
        }
        else {
            bloodstock.put(stock.getBloodstockId(), stock);
        }
    }
    public Iterable<BloodStock> getBloodStocks(){
        return bloodstock.values();
    }

    public BloodStock getBloodStock(int bloodstockId) throws Exception {

        if(bloodstock.containsKey(bloodstockId)) {
            return bloodstock.get(bloodstockId);
        }
        else {
            throw new Exception("BloodStock Id not found");
        }
    }

    public void updateBloodStock(BloodStock stock) throws Exception {
        if(bloodstock.containsKey(stock.getBloodstockId())) {
            bloodstock.put(stock.getBloodstockId(), stock);
        }
        else {
            throw new Exception("BloodStock Id not found");
        }
    }

    public void deleteBloodStock(int bloodstockId) throws Exception {
        if(bloodstock.containsKey(bloodstockId)) {
            bloodstock.remove(bloodstockId);
        }
        else {
            throw new Exception("BloodStock Id not found");
        }
    }

}
