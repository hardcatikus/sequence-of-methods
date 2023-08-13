package com.solution.service;

import com.solution.Person;
import org.springframework.stereotype.Component;

@Component
public class EmailSender {

    public void sendEmail(Person person){
        System.out.println("The email has been sent to " + person.getName() + ".");
    }

}
