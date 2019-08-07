package com.ladybug.sis.Service;

import com.ladybug.sis.Model.User;
import com.ladybug.sis.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    public UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long userID){
        return userRepository.findById(userID).orElse(null);
    }

    public User addOrUpdateUser(User user){
        return userRepository.save(user);
    }

    public void deleteUser(Long userID){
        userRepository.deleteById(userID);
    }

}

