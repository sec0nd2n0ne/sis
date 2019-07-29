package com.ladybug.sis.Controller;

import com.ladybug.sis.Model.User;
import com.ladybug.sis.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/user")
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("/user/{id}")
    public User findById(@PathVariable(value = "id") Long userID){
        return userService.findById(userID);
    }

    @PostMapping("/user")
    public User addUser(@Valid @RequestBody User user){
        return userService.addUser(user);
    }
}
