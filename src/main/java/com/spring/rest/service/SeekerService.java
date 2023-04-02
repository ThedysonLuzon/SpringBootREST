package com.spring.rest.service;

import com.spring.rest.model.Seeker;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class SeekerService {

    Map<Integer, Seeker> seeker = new HashMap<>();

    public void addSeeker(Seeker seek) throws Exception {
        if(seeker.containsKey(seek.getSeekId())) {
            throw new Exception("This employee Id already exists");
        }
        else {
            seeker.put(seek.getSeekId(), seek);
        }
    }
    public Iterable<Seeker> getSeekers(){
        return seeker.values();
    }

    public Seeker getSeeker(int seekId) throws Exception {

        if(seeker.containsKey(seekId)) {
            return seeker.get(seekId);
        }
        else {
            throw new Exception("Seeker Id not found");
        }
    }

    public void updateSeeker(Seeker seek) throws Exception {
        if(seeker.containsKey(seek.getSeekId())) {
            seeker.put(seek.getSeekId(), seek);
        }
        else {
            throw new Exception("Seeker Id not found");
        }
    }

    public void deleteSeeker(int seekId) throws Exception {
        if(seeker.containsKey(seekId)) {
            seeker.remove(seekId);
        }
        else {
            throw new Exception("Seeker Id not found");
        }
    }


}
