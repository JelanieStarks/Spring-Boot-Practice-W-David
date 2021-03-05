package com.example.demo.controllers;

import com.example.demo.entities.Thing;
import com.example.demo.storage.ThingStorage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ThingController {

    private ThingStorage thingStorage;

    public ThingController(ThingStorage thingStorage) {
        this.thingStorage = thingStorage;
    }

    @RequestMapping("/things")
    public String displayThings(Model model){
        model.addAttribute("things",thingStorage.getAllThings());
        return "thingsview";
    }
    @PostMapping("/addThing")
    public String addThing(@RequestParam(value = "ThingName") String name, @RequestParam(value = "ThingNumber") int number){
       // System.out.println(body);
        Thing thing = new Thing(name,number);
        thingStorage.saveThing(thing);
        return "redirect:/things";

    }
}
