package com.shapoval.traveler.service.implementation;

import com.shapoval.traveler.entity.Role;
import com.shapoval.traveler.entity.User;
import com.shapoval.traveler.model.RoleModel;
import com.shapoval.traveler.model.UserModel;
import com.shapoval.traveler.repository.RoleRepository;
import com.shapoval.traveler.repository.UserRepository;
import com.shapoval.traveler.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;



@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserModel loginUser(String password, String email) {
        UserModel userModel = new UserModel(userRepository.findByEmailAndAndPassword(email, password));
        if (userModel != null) {
            if (passwordEncoder.matches(password, userModel.getPassword())) {
                return userModel;
            }
        }
        return null;
    }

    @Override
    public UserModel addUser(UserModel user) {
        Role role = roleRepository.findAllByRoleName("ROLE_TRAVELLER");
        user.setRole(new RoleModel(role));
        user.setPassword(passwordEncoder.encode(user.getPassword()));
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

    @Override
    public User findUserByLogin(String login) {
        return userRepository.findByEmail(login);
    }
}
