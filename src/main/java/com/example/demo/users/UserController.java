//package com.example.demo.users;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.GetMapping;
//import java.util.List;
//
//@RestController
//@RequestMapping(path = "/api/v1/user")
//public class UserController {
//    private final UserService userService;
//
//    @Autowired
//    public UserController(UserService userService){
//        this.userService = userService;
//    }
//    @GetMapping
//    public List<MyUser> getUsers(){
//        return userService.getUsers();
//    }
//    public void addUser(@RequestBody MyUser user){
//        userService.addUser(user);
//    }
//}
