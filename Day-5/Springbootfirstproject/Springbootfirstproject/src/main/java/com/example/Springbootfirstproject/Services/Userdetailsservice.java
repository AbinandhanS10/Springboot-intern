package com.example.Springbootfirstproject.Services;

import com.example.Springbootfirstproject.Models.UserDetails;
import com.example.Springbootfirstproject.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Userdetailsservice {

    @Autowired
    private UserRepo userRepo;
    public List<UserDetails> getAllUser() {
        return userRepo.findAll();
    }

    public UserDetails findById(int id) {
        UserDetails userDetails = userRepo.findById(id).orElseThrow(() -> new RuntimeException("Not found"));
        return userDetails;
    }

    public boolean AddUser(UserDetails userDetails) {
        userRepo.save(userDetails);
        return true;
    }

    public boolean delete(UserDetails userDetails) {
        userRepo.delete(userDetails);
        return true;
    }

    public boolean update(int id, UserDetails userDetails) {
        userRepo.save(userDetails);
        return true;
    }


}
