package com.msil.authsecurity.service;

import com.msil.authsecurity.entity.NewUserDetails;
import com.msil.authsecurity.entity.User;
import com.msil.authsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class NewUserDetailsService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if(user ==null) {
            throw new UsernameNotFoundException("User Not Found");
        }
        return new NewUserDetails(user);
    }
}
