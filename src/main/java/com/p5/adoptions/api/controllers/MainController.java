package com.p5.adoptions.api.controllers;

import com.p5.adoptions.service.AnimalShelterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MainController {


    @GetMapping("/hello")
    public ResponseEntity<String> greet(@RequestParam(name = "name" , required = false) String name){

        String owner = name == null ? "world" : name;

        return ResponseEntity.ok("HELLO "+ owner +"FROM Animal Shelter");
    }

    @GetMapping("/owner")
    public String greetOwner(){
        return "HELLO FROM OWNER";
    }

}
