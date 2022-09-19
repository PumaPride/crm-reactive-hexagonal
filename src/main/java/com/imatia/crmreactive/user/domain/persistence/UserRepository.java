package com.imatia.crmreactive.user.domain.persistence;

import com.imatia.crmreactive.user.domain.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserRepository {

    Flux<User> findAll();
    Flux<User> findAllByAge(Integer age);
    Mono<User> findById(Integer id);
    Mono<User> save(User user);

}
