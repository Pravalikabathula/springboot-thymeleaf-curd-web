package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;

@Service
public interface DepartmentService {

	Department saveDepartment(Department department);

	List<Department> fetchDepartmentList();

	Department updateDepartment(Department department, Long departmentId);

	void deleteDepartmentById(Long departmentId);

}
