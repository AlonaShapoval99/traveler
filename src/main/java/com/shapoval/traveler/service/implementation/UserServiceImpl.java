package com.shapoval.traveler.service.implementation;

import com.shapoval.traveler.entity.User;
import com.shapoval.traveler.model.UserModel;
import com.shapoval.traveler.repository.UserRepository;
import com.shapoval.traveler.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserModel loginUser(String password, String email) {
        return new UserModel(userRepository.findByEmailAndAndPassword(email, password));
    }

    @Override
    public UserModel addUser(UserModel user) {
        return new UserModel(userRepository.save(new User(user)));
    }

    @Override
    public UserModel updateUser(UserModel user) {
        return new UserModel(userRepository.save(new User(user)));
    }

    @Override
    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }
}
