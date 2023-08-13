package com.solution.aspect;

import com.solution.Person;
import com.solution.service.EmailSender;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SequenceAspect {

    @AfterReturning(pointcut = "execution(* com.solution.service.PersonCreator.createPerson(..))", returning = "result")
    public void executeAfterPersonCreation(Person result){
        EmailSender emailSender = new EmailSender();
        emailSender.sendEmail(result);
    }

}
