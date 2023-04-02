// Thedyson Luzon - 301127562 - April 1, 2023

package com.spring.rest.controller;

import com.spring.rest.model.BloodStock;
import com.spring.rest.model.Seeker;
import com.spring.rest.service.BloodStockService;
import com.spring.rest.service.SeekerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class BloodStockController {
    @Autowired
    BloodStockService bloodStockService;

    @RequestMapping(value = "/bloodstock/{bloodstockId}", method = RequestMethod.GET)
    BloodStock getBloodStock(@PathVariable("bloodstockId") int bloodstockId) throws Exception {
        return bloodStockService.getBloodStock(bloodstockId);
    }

    @RequestMapping(value = "/bloodstocks", method = RequestMethod.GET)
    Iterable<BloodStock> getSeekers() {
        return bloodStockService.getBloodStocks();
    }

    @RequestMapping(value = "/bloodstock", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    void addBloodStock(@RequestBody BloodStock stock) throws Exception {
        bloodStockService.addBloodStock(stock);
    }

    @RequestMapping(value = "/bloodstock/{bloodstockId}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    void updateBloodStock(@PathVariable("bloodstockId") int bloodstockId, @RequestBody BloodStock stock) throws Exception {
        stock.setBloodstockId(bloodstockId);
        bloodStockService.updateBloodStock(stock);
    }

    @RequestMapping(value = "/bloodstock/{bloodstockId}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    void deleteBloodStock(@PathVariable("bloodstockId") int bloodstockId) throws Exception {
        bloodStockService.deleteBloodStock(bloodstockId);
    }
}
