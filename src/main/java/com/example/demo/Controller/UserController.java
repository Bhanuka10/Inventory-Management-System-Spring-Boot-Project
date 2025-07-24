package com.example.demo.Controller;

import com.example.demo.dto.Userdto;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/user")
@CrossOrigin

public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/getuser")
    public String GetUser(){
        return "Hello World";
    }
    @PostMapping("/postuser")
    public Userdto PostUser(@RequestBody Userdto userdto){
        return userService.SaveUser(userdto);
    }
    @PutMapping
    public String PutUser(){
        return "User Updated";
    }
    @DeleteMapping
    public String DeleteUser(){
        return "User Deleted";
    }
}
