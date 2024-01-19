package com.abhi.springboot.service;

import com.abhi.springboot.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchAllDepartmentsList();

    public Department fetchDepartmentById(Long departmentId);

    public void deleteDepartmentById(Long departmentId);
    public Department updateDepartmentById(Long departmentId, Department department);
    public Department fetchDepartmentbyName(String departmentName);
}

