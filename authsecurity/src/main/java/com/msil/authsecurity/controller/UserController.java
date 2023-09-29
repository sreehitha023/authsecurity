package com.msil.authsecurity.controller;

import com.msil.authsecurity.entity.User;
import com.msil.authsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserRepository userRepository;
    @GetMapping("/welcome")
    public String welcome()
    {
        return "Welcome.....!!!";
    }
    @GetMapping("/user")
    public String message(){
        return "Hi!!I'm User";
    }

    @GetMapping
    public String messages(){
        return "Hi!!I'm Admin";
    }

    @PostMapping
    public User save(User user){
        return userRepository.save(user);
    }
}
