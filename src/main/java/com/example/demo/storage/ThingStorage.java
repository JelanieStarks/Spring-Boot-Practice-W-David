package com.example.demo.storage;

import com.example.demo.entities.Thing;
import com.example.demo.repository.ThingRepo;
import org.springframework.stereotype.Service;



@Service
public class ThingStorage {
    private ThingRepo thingRepo;
    public ThingStorage(ThingRepo thingRepo){
        this.thingRepo = thingRepo;
    }
    public Iterable<Thing> getAllThings(){
        return thingRepo.findAll();
    }
    public void saveThing(Thing thing){
        thingRepo.save(thing);
    }
}
