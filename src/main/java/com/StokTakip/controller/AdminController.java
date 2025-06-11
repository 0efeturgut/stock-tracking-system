package com.StokTakip.controller;

import com.StokTakip.model.User;
import com.StokTakip.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/users/{username}/roles")
    public ResponseEntity<?> updateUserRoles(@PathVariable String username, @RequestBody Set<String> roles) {
        return userService.updateUserRoles(username, roles);
    }
}
