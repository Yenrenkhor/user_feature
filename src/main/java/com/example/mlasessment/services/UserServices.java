package com.example.mlasessment.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.mlasessment.model.Users;
import com.example.mlasessment.repository.UserRepository;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServices {
    @Autowired
    UserRepository userRepository;

    public List<Users> getAllUser() {
        List<Users> users = new ArrayList<Users>();
        for (Users users1 : userRepository.findAll()) {
            users.add(users1);
        }
        return users;
    }

    public Users getEnable(String featureName, String email){
        return userRepository.findByFeatureNameAndEmail(featureName, email);
    }

    public boolean saveOrUpdate(@Validated @RequestBody Users user) {
        if (!userRepository.existsByFeatureNameAndEmail(user.getFeatureName(), user.getEmail())) {
            userRepository.save(user);
            return true;
        }
        else {
            return false;
        }
    }


}
