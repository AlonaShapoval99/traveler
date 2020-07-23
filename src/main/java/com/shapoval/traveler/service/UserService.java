package com.shapoval.traveler.service;

import com.shapoval.traveler.model.UserModel;

public interface UserService  {
    UserModel loginUser(String password, String email);

    UserModel addUser(UserModel user);

    UserModel updateUser(UserModel user);

    void deleteUser(long id);
}
