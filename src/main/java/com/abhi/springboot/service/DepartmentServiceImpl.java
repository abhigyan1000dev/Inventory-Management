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

    /**
     * @param departmentId
     */
    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    /**
     * @param departmentId
     * @param department
     * @return Department
     */
    @Override
    public Department updateDepartmentById(Long departmentId, Department department) {
        Department departmentFromDB =  departmentRepository.findById(departmentId).get();

        //Now I have the department Object with the corresponding ID;
        if(departmentFromDB.getDepartmentName()!= null) departmentFromDB.setDepartmentName(department.getDepartmentName());
        if(departmentFromDB.getDepartmentAddress()!= null) departmentFromDB.setDepartmentAddress(department.getDepartmentAddress());
        if(departmentFromDB.getDepartmentCode()!= null) departmentFromDB.setDepartmentCode(department.getDepartmentCode());
        return departmentRepository.save(departmentFromDB);
    }

    /**
     * @param departmentName
     * @return Department with respective Name
     */
    @Override
    public Department fetchDepartmentbyName(String departmentName) {
        return departmentRepository.findByDepartmentName(departmentName);
    }

}
