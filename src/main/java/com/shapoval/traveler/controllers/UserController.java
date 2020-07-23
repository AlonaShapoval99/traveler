package com.shapoval.traveler.controllers;

import com.shapoval.traveler.model.UserModel;
import com.shapoval.traveler.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;


    @CrossOrigin
    @GetMapping("/loginUser")
    public UserModel loginUser(@RequestParam String email,
                               @RequestParam String password) {
        return userService.loginUser(email, password);
    }

    @CrossOrigin
    @PostMapping("/add")
    public UserModel addUser(@RequestBody UserModel workerValue) {
        return userService.addUser(workerValue);
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

}
