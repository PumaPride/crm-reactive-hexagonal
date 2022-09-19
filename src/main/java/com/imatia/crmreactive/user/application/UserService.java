package com.imatia.crmreactive.user.application;

import com.imatia.crmreactive.user.domain.User;
import com.imatia.crmreactive.user.domain.persistence.UserRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Flux<User> findAll() {
        return userRepository.findAll();
    }

    public Flux<User> findAllByAge(Integer age) {
        return userRepository.findAllByAge(age);
    }

    public Mono<User> findById(Integer id) {
        return userRepository.findById(id);
    }

    public Mono<User> create(User user) {
        return userRepository.save(user);
    }

}
