package com.ladybug.sis.Controller;

import com.ladybug.sis.Model.User;
import com.ladybug.sis.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping()
    public ModelAndView findAll(){
        ModelAndView modelAndView = new ModelAndView("users/list-users");
        modelAndView.addObject("users", userService.findAll());
        return modelAndView;

    }

    @GetMapping("/{id}")
    public ModelAndView findById(@PathVariable(value = "id") Long userID){
        ModelAndView modelAndView = new ModelAndView("users/user");
        modelAndView.addObject("user", userService.findById(userID));
        return modelAndView;
    }

//    @PostMapping("/")
//    public ResponseEntity<User> addUser(@RequestBody User user) throws URISyntaxException {
//        User addedUser = userService.addOrUpdateUser(user);
//
//        if (addedUser == null){
//            return ResponseEntity.notFound().build();
//        }
//
//        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
//                    .path("/{id}")
//                    .buildAndExpand(addedUser.getUserID())
//                    .toUri();
//
//        return ResponseEntity.created(uri)
//                .body(addedUser);
//    }

//    @PutMapping("/{id}")
//    public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable(value = "id") long userID){
//        User userToUpdate = userService.findById(userID);
//
//        if (userToUpdate == null){
//            return ResponseEntity.notFound().build();
//        }
//
//        user.setUserID(userID);
//        User updatedUser = userService.addOrUpdateUser(user);
//
//        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
//                .path("/{id}")
//                .buildAndExpand(updatedUser.getUserID())
//                .toUri();
//
//        return ResponseEntity.created(uri)
//                .body(updatedUser);
//
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Object> deleteUser(@PathVariable(value = "id") long userID){
//        userService.deleteUser(userID);
//
//        return ResponseEntity.noContent().build();
//
//    }

}
