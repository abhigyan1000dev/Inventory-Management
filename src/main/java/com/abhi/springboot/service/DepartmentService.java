package com.abhi.springboot.service;

import com.abhi.springboot.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchAllDepartmentsList();
}

