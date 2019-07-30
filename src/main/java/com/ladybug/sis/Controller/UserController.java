package com.ladybug.sis.Controller;

import com.ladybug.sis.Model.User;
import com.ladybug.sis.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/")
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable(value = "id") Long userID){
        return userService.findById(userID);
    }

    @PostMapping("/new")
    public User addUser(@Valid @RequestBody User user){
        return userService.addUser(user);
    }

}
