package com.example.Practice23.service;

import com.example.Practice23.models.UserDetailsModel;
import com.example.Practice23.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    AccountRepository repository;
    @Autowired
    PasswordEncoder passwordEncoder;

    public void save(UserDetailsModel userDetailsModel) {
        userDetailsModel.setRole("user");
        userDetailsModel.setPassword(passwordEncoder.encode(userDetailsModel.getPassword()));
        repository.save(userDetailsModel);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repository.findByUsername(username);
    }
}
