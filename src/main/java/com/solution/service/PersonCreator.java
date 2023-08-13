package com.solution.service;

import com.solution.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonCreator {

    public Person createPerson(String name){
        return new Person(name);
    }

}
