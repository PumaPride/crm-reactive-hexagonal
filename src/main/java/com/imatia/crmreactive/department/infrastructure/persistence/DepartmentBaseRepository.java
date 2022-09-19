package com.imatia.crmreactive.department.infrastructure.persistence;

import com.imatia.crmreactive.department.domain.Department;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface DepartmentBaseRepository extends ReactiveCrudRepository<Department, Integer> {

    Mono<Department> findByUserId(Integer userId);

}
