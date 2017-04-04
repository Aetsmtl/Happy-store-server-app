package com.happystore.service;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.happystore.beans.Utilisateur;

@RestController
public class UserController {

	 //private static final String template = "Hello, %s!";
	 private final AtomicLong counter = new AtomicLong();

	 @RequestMapping("/user")
	 public Utilisateur user(@RequestParam(value="name", defaultValue="Empty") String name) {
	    return new Utilisateur((int)counter.incrementAndGet(),
	                        String.format(name));
	 }
	    
}
