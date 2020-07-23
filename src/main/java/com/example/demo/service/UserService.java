package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserService {
    @Autowired
    UserRepository repository;

    public List<User> getAll (){
        return repository.findAll();
    }

    public  User findById(long id){
        return repository.findById(id).get();
    }

    public  User create (User user){
        return repository.save(user);
    }
    public  User update (User user, long id){
        User userUpdated = repository.findById(id).get();
        userUpdated.setFirstname(user.getFirstname());
        userUpdated.setLastname(user.getLastname());
        userUpdated.setPassword(user.getPassword());
        return repository.save(userUpdated);
    }

    public void delete (long id){
        repository.deleteById(id);
    }
}
