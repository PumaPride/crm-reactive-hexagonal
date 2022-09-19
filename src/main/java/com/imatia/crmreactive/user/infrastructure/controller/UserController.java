package com.imatia.crmreactive.user.infrastructure.controller;

import com.imatia.crmreactive.user.application.UserService;
import com.imatia.crmreactive.user.domain.User;
import com.imatia.crmreactive.user.domain.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(@Autowired UserRepository userRepository) {
        userService = new UserService(userRepository);
    }

    @GetMapping
    public Flux<User> getAllUsers() {
        return userService.findAll();
    }

    @GetMapping("/{userId}")
    public Mono<User> getUserById(@PathVariable("userId") Integer userId) {
        return userService.findById(userId);
    }

    @GetMapping("/age/{userAge}")
    public Flux<User> getAllByAge(@PathVariable("userAge") Integer userAge) {
        return userService.findAllByAge(userAge);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<User> createUser(@RequestBody User user) {
        return userService.create(user);
    }

}
