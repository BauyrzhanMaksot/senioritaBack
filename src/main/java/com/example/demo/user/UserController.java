package com.example.demo.user;

import com.example.demo.user.User;
import com.example.demo.user.UserDto;
import com.example.demo.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Bauka on 27-Sep-18
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserConfirmationService userConfirmationService;

    @PostMapping("/bake/register")
    public HttpStatus register(@RequestBody UserDto userDto) {
        userService.register(userDto);
        return HttpStatus.OK;
    }

    @GetMapping("/bake/{token}")
    public String confirm(@PathVariable String token) {
        userConfirmationService.confirm(token);
       return "<html><style>body {background-color:#ff4d4d; text-align:center} div {background-color: lightgrey;width: 300px;border: 10px solid black;padding: 25px;margin: 25px;} </style><body><div><h1>Your account has been enabled</h1><p>Now you can login</p></div></body></html>";
    }

    @GetMapping("/getUser")
    public User getUser(){
        return userService.getUser();
    }

    @PostMapping("/updateUser")
    public HttpStatus updateUser(@RequestBody User user) {
        userService.updateUser(user);
        return HttpStatus.OK;
    }
}
