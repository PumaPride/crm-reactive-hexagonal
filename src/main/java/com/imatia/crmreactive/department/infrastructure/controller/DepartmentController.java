package com.imatia.crmreactive.department.infrastructure.controller;

import com.imatia.crmreactive.department.application.DepartmentService;
import com.imatia.crmreactive.department.domain.Department;
import com.imatia.crmreactive.department.domain.persistence.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(@Autowired DepartmentRepository departmentRepository) {
        departmentService = new DepartmentService(departmentRepository);
    }

    @GetMapping("/department/{userId}")
    public Mono<Department> getDepartmentByUserId(@PathVariable("userId") Integer userId) {
        return departmentService.findByUserId(userId);
    }

}
