package com.abhi.springboot.controller;

import com.abhi.springboot.entity.Department;
import com.abhi.springboot.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    // Saving Data of Department.
    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    // Find All.
    @GetMapping("/fetchDepartments")
    public List<Department> fetchAllDepartment() {
        return departmentService.fetchAllDepartmentsList();
    }

    //  Find Department by Id.
    @GetMapping("/fetchDepartment/{departmentId}")
    public Department fetchDepartmentById(@PathVariable("departmentId") Long departmentId) {
        return departmentService.fetchDepartmentById(departmentId);
    }

    //Deleting by Id.
    @DeleteMapping("/deleteDepartment/{departmentId}")
    public String deleteDepartmentbyId(@PathVariable("departmentId") Long departmentId)
    {
        departmentService.deleteDepartmentById(departmentId);
        return "Department with ID number " + departmentId + "has been deleted successfully.";
    }

    // Update the Data by ID.
    @PutMapping("/departments/{departmentId}")
    public Department updateDepartment(@PathVariable("departmentId") Long departmentId, @RequestBody Department department)
    {
        return departmentService.updateDepartmentById(departmentId,department);
    }
}
