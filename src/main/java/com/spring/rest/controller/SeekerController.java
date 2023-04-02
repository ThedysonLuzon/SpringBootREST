// Thedyson Luzon - 301127562 - April 1, 2023

package com.spring.rest.controller;

import com.spring.rest.model.Seeker;
import com.spring.rest.service.SeekerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class SeekerController {
    @Autowired
    SeekerService seekerService;

    @ResponseBody
    @RequestMapping("")
    public String home()
    {
        return "Create an Blood Bank Information System Web service";
    }

    @RequestMapping(value = "/seeker/{seekId}", method = RequestMethod.GET)
    Seeker getSeeker(@PathVariable("seekId") int seekId) throws Exception {
        return seekerService.getSeeker(seekId);
    }

    @RequestMapping(value = "/seekers", method = RequestMethod.GET)
    Iterable<Seeker> getSeekers() {
        return seekerService.getSeekers();
    }

    @RequestMapping(value = "/seeker", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    void addSeeker(@RequestBody Seeker seek) throws Exception {
        seekerService.addSeeker(seek);
    }

    @RequestMapping(value = "/seeker/{seekId}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    void updateSeeker(@PathVariable("seekId") int seekId, @RequestBody Seeker seek) throws Exception {
        seek.setSeekId(seekId);
        seekerService.updateSeeker(seek);
    }

    @RequestMapping(value = "/seeker/{seekId}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    void deleteSeeker(@PathVariable("seekId") int seekId) throws Exception {
        seekerService.deleteSeeker(seekId);
    }
}
