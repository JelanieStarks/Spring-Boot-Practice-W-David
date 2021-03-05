package com.example.demo.repository;

import com.example.demo.entities.Thing;
import org.springframework.data.repository.CrudRepository;

public interface ThingRepo extends CrudRepository<Thing,Long> {

}
