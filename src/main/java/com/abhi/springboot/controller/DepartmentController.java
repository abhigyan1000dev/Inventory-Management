package com.abhi.springboot.controller;

import com.abhi.springboot.entity.Department;
import com.abhi.springboot.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department)
    {
       return departmentService.saveDepartment(department);
    }

    @GetMapping("/fetchDepartments")
    public List<Department> fetchAllDepartment()
    {
        return departmentService.fetchAllDepartmentsList();
    }
}
