package com.dailycodebuffer.Springboot.tutorial.Service;

import java.util.List;

import com.dailycodebuffer.Springboot.tutorial.Entity.Department;
import com.dailycodebuffer.Springboot.tutorial.error.DepartmentNotFoundException;

public interface DepartmentService {

	public Department saveDepartment(Department department);

	public List<Department> fetchDepartmentList();

	public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

	public void deleteDepartmentById(Long departmentId);

	public Department updateDepartment(Long departmentId, Department department);


	public Department fetchDepartmentByName(String departmentName);
	
}
