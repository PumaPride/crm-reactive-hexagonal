package com.imatia.crmreactive.department.infrastructure.persistence;

import com.imatia.crmreactive.department.domain.Department;
import com.imatia.crmreactive.department.domain.persistence.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public class DepartmentPostgresRepository implements DepartmentRepository {

    private final DepartmentBaseRepository repository;

    public DepartmentPostgresRepository(@Autowired DepartmentBaseRepository repository) {
        this.repository = repository;
    }

    @Override
    public Mono<Department> findByUserId(Integer userId) {
        return repository.findByUserId(userId);
    }

}
