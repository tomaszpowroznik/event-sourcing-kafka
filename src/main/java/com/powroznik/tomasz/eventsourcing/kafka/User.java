package com.powroznik.tomasz.eventsourcing.kafka;

import java.util.UUID;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class User {

    @RequestMapping(value = "user/{userId}", method = RequestMethod.PUT)
    public void addUser(@PathVariable(value = "userId") UUID userId) {
        System.out.println("Heey, user added " + userId);
    }

}
