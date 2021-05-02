package com.example.Practice23.repository;

import com.example.Practice23.models.User;
import com.example.Practice23.models.UserDetailsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface AccountRepository extends JpaRepository<UserDetailsModel, Long> {
    UserDetails findByUsername(String username);
}
