package com.training.userapplication.service;


import com.training.userapplication.dao.UserRepository;
import com.training.userapplication.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getallUser() {

        return userRepository.findAll();
    }

    public User getUserById(long id) {

        return userRepository.findById(id).orElse(null);
    }

    public User getUserByfirstName(String firstName) {
        return userRepository.findByFirstName(firstName);
    }

//    public User modifyUser(User user) {
////        User existinguser = userRepository.findById(user.getId()).orElse(null);
////        existinguser.setFirstName(user.getFirstName());
////        existinguser.setLastName(user.getLastName());
////        existinguser.setEmail(user.getEmail());
//        return userRepository.save(existinguser);
//    }
public Optional<User> modifyUser(User newuser, long id) {
    return userRepository.findById(id).map(user -> {
        user.setFirstName(newuser.getFirstName());
        user.setLastName(newuser.getLastName());
        user.setEmail(newuser.getEmail());
        return userRepository.save(user);
    });
    //return userRepository.save(user);
}

    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }
}
