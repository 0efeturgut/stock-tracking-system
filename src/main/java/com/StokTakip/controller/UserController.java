package com.StokTakip.controller;

import com.StokTakip.model.User;
import com.StokTakip.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PutMapping("/{username}/roles")
    public ResponseEntity<?> updateUserRoles(@PathVariable String username, @RequestBody Set<String> roles) {
        return userService.updateUserRoles(username, roles);
    }
}
