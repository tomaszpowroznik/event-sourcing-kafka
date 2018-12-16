package com.powroznik.tomasz.eventsourcing.kafka;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
public class EventSourcingApp {

    public static void main(String[] args) {
        System.out.println("Hey");
        SpringApplication.run(EventSourcingApp.class, args);
    }
}
