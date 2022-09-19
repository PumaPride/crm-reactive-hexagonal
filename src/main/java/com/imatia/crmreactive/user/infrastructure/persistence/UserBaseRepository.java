package com.imatia.crmreactive.user.infrastructure.persistence;

import com.imatia.crmreactive.user.domain.User;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface UserBaseRepository extends ReactiveCrudRepository<User, Integer> {

    @Query("SELECT * FROM users WHERE age >= $1")
    Flux<User> findAllByAge(Integer age);

}
