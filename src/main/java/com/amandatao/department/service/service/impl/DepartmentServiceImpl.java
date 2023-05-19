package com.amandatao.department.service.service.impl;

import com.amandatao.department.service.entity.Department;
import com.amandatao.department.service.repository.DepartmentRepository;
import com.amandatao.department.service.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public List<Department> getAllDepartment() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }

    @Override
    public Department saveDepartment(Department newDepartment) {
        return departmentRepository.save(newDepartment);
    }
}
