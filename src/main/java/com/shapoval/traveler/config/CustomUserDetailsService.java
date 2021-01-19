package com.shapoval.traveler.config;

import com.shapoval.traveler.entity.User;
import com.shapoval.traveler.service.implementation.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserServiceImpl userService;

    @Override
    public CustomUserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = userService.findUserByLogin(userName);

        return CustomUserDetails.convertFromUserEntityToCustomUserDetails(user);
    }
}
