package com.itmuch.cloud.controller;
import com.itmuch.cloud.entity.User;
import com.itmuch.cloud.repository.UserReposittory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserReposittory userReposittory;

    @GetMapping("/simple/{id}")
    public User findById(@PathVariable Long id){
         return  this.userReposittory.findOne(id);
    }

}
