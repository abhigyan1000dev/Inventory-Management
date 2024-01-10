package com.abhi.springboot.service;

import com.abhi.springboot.entity.Department;
import com.abhi.springboot.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    /**
     * @return List<Department>
     */
    @Override
    public List<Department> fetchAllDepartmentsList() {
        return departmentRepository.findAll();
    }
}
