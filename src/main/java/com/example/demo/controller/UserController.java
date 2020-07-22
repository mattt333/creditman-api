package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/users")

public class UserController {
    @Autowired
    UserService service;

    @GetMapping
    public List<User> getAll(){
        return service.getAll();
    }

    @GetMapping(value = "/{id}")
    public  User getById(@PathVariable long id){
        return service.findById(id);
    }

    @PostMapping
    public  User create (@RequestBody User user){
        return service.create(user);
    }

    @PutMapping(value = "/{id}")
    public  User update (@PathVariable Long id, @RequestBody User user) {
        return service.update(user, id);
    }

    @DeleteMapping (value = "/{id}")
    public void delete (@PathVariable long id){
        service.delete(id);
    }
}
