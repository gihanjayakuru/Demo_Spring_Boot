package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {

    @GetMapping("/getUser")
    public String getUser(){
        return "Simple";
    }
    @PostMapping("/saveUser")
    public String saveUser(){
        return "user Saved";
    }
    @PutMapping("/updateUser")
    public String updateUser(){
        return "user update";
    }
    @DeleteMapping("/deleteUser")
    public String deleteUser(){
        return "user deleted";
    }
}
