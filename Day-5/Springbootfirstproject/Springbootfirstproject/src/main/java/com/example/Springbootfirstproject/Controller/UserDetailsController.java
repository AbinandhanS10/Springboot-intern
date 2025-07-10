package com.example.Springbootfirstproject.Controller;

import com.example.Springbootfirstproject.Models.UserDetails;
import com.example.Springbootfirstproject.Services.Userdetailsservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/User")
public class UserDetailsController {

    @Autowired
    private Userdetailsservice uds;
    @GetMapping
    public List<UserDetails> getUserDetails() {
        return uds.getAllUser();
    }

    @GetMapping("{id}")
    public UserDetails getUserDetails(@PathVariable int id) {
        return uds.findById(id);
    }
    @PostMapping()
    public String addUser(@RequestBody UserDetails userDetails) {
        if(uds.AddUser(userDetails))
        {
            return "Success";
        }
        return "Fail";
    }
    @DeleteMapping()
    public String deleteUser(@RequestBody UserDetails userDetails) {
        {
            if(uds.delete(userDetails))
            {
                return "Success";
            }
            return "Fail";
        }
    }
    @PutMapping("{id}")
    public String updateUser(@PathVariable int id, @RequestBody UserDetails userDetails) {
        if(uds.update(id,userDetails))
        {
            return "Success";
        }
        return "Fail";
    }



}
