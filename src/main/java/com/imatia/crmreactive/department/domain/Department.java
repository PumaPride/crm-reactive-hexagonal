package com.imatia.crmreactive.department.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("departments")
public class Department {
    @Id
    private Integer id;
    private String name;
    @Column("user_id")
    private Integer userId;
    private String loc;

}
