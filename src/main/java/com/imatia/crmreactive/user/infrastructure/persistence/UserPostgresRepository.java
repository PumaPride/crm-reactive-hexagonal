package com.imatia.crmreactive.user.infrastructure.persistence;

import com.imatia.crmreactive.user.domain.User;
import com.imatia.crmreactive.user.domain.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class UserPostgresRepository implements UserRepository {

    private final UserBaseRepository repository;

    public UserPostgresRepository(@Autowired UserBaseRepository userReactiveRepository) {
        this.repository = userReactiveRepository;
    }

    @Override
    public Flux<User> findAll() {
        return repository.findAll();
    }

    @Override
    public Flux<User> findAllByAge(Integer age) {
        return repository.findAllByAge(age);
    }

    @Override
    public Mono<User> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Mono<User> save(User user) {
        return repository.save(user);
    }
}
