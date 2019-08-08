package com.ladybug.sis.Controller;

import com.ladybug.sis.Model.User;
import com.ladybug.sis.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@Controller
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

    @GetMapping("/add")
    public String showAddUserPage(ModelMap model){
        model.addAttribute("user", new User());
        return "users/user";
    }

    @PostMapping("/add")
    public String addUser(@Valid User user, BindingResult result){
        if (result.hasErrors()){
            return "user";
        }
        userService.addOrUpdateUser(user);
        return "redirect:/users";
    }

    @GetMapping("/update")
    public String showUpdateUserPage(@RequestParam(value = "id") Long userID, ModelMap model){
        model.addAttribute("user", userService.findById(userID));
        return "users/user";
    }

    @PostMapping("/update")
    public String updateUser(@Valid User user, BindingResult result){
        if (result.hasErrors()){
            return "user";
        }
        userService.addOrUpdateUser(user);
        return "redirect:/users";
    }

    @GetMapping("/delete")
    public String deleteUser(@RequestParam(value = "id") Long userID){
        userService.deleteUser(userID);
        return "redirect:/users";
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
