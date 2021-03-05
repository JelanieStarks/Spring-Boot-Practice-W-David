package com.example.demo;

import com.example.demo.entities.Thing;
import com.example.demo.repository.ThingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner {

    @Autowired
    ThingRepo thingRepo;

    @Override
    public void run(String... args) throws Exception{
        Thing thing1 = new Thing("dodad",2);
        Thing thing2 = new Thing("bledted",3);
        Thing thing3 = new Thing("dodadd",4);
        Thing thing4 = new Thing("bledtedd",5);
        thingRepo.save(thing1);
        thingRepo.save(thing2);
        thingRepo.save(thing3);
        thingRepo.save(thing4);
    }
}
