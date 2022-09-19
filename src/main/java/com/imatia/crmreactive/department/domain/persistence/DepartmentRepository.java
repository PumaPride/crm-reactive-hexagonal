package com.imatia.crmreactive.department.domain.persistence;

import com.imatia.crmreactive.department.domain.Department;
import reactor.core.publisher.Mono;

public interface DepartmentRepository {

    Mono<Department> findByUserId(Integer userId);

}

