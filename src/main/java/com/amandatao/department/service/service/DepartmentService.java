package com.amandatao.department.service.service;

import com.amandatao.department.service.entity.Department;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentService {
    List<Department> getAllDepartment();
    Department getDepartmentById(Long departmentId);
    Department saveDepartment(Department newDepartment);
}
