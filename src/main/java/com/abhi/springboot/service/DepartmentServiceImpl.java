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

    /**
     *
     * @param department
     * @return Department Object after saving.
     */
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    /**
     * @return a List of Department Object.
     */
    @Override
    public List<Department> fetchAllDepartmentsList() {
        return departmentRepository.findAll();
    }

    /**
     * @param departmentId
     * @return Department Object with the respective Id.
     */
    @Override
    public Department fetchDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }
}
