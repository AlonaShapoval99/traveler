package com.shapoval.traveler.controllers;

import com.shapoval.traveler.config.jwt.JwtProvider;
import com.shapoval.traveler.entity.User;
import com.shapoval.traveler.model.UserModel;
import com.shapoval.traveler.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @Autowired
    private JwtProvider jwtProvider;


    @CrossOrigin
    @PostMapping("/authUser")
    public AuthResponse authUser(@RequestParam String email,
                                 @RequestParam String password) {
        if (StringUtils.isNoneBlank(email) &&
                StringUtils.isNoneBlank(password)) {
            User user = new User(userService.loginUser(email, password));
            String token = jwtProvider.generateToken(user.getEmail());
            return new AuthResponse(token);
        }
        return null;
    }

    @CrossOrigin
    @PostMapping("/register")
    public String registerUser(@RequestBody UserModel workerValue) {
        if (StringUtils.isNoneBlank(workerValue.getEmail()) &&
                StringUtils.isNoneBlank(workerValue.getPassword())) {
            userService.addUser(workerValue);
            return "OK";
        }
        return "ERROR";
    }

    @CrossOrigin
    @GetMapping("/delete")
    public void deleteUser(@RequestParam Long id) {
        userService.deleteUser(id);
    }


    @CrossOrigin
    @PostMapping("/update")
    public UserModel updateUser(@RequestBody UserModel workerValue) {
        return userService.updateUser(workerValue);
    }

    @GetMapping("/admin/get")
    public String getAdmin() {
        return "Hi admin";
    }

    @GetMapping("/user/get")
    public String getUser() {
        return "Hi user";
    }
}
