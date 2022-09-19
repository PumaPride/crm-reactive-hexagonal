package com.imatia.crmreactive.department.application;

import com.imatia.crmreactive.department.domain.Department;
import com.imatia.crmreactive.department.domain.persistence.DepartmentRepository;
import com.imatia.crmreactive.user.domain.User;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Mono<Department> findByUserId(Integer userId) {
        return departmentRepository.findByUserId(userId);
    }

}
