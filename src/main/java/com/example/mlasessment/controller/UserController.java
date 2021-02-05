package com.example.mlasessment.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.mlasessment.model.Users;
import com.example.mlasessment.services.UserServices;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    UserServices userServices;

    @GetMapping("/feature")
    public Map<String, Boolean> getEnable(@RequestParam(required = false) String featureName, String email) {
        Map<String, Boolean> retval = new HashMap<>();
        retval.put("canAccess", userServices.getEnable(featureName, email).getEnable());
        return retval;
    }

    @PostMapping("/feature")
    private ResponseEntity<?> saveUser(@RequestBody Users user) {

        if (!userServices.saveOrUpdate(user)){
            System.out.print(HttpStatus.NOT_MODIFIED);
            return new ResponseEntity<>(null, HttpStatus.NOT_MODIFIED);
        }
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
