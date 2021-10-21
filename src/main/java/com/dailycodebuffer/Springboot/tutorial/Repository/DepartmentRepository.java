package com.dailycodebuffer.Springboot.tutorial.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dailycodebuffer.Springboot.tutorial.Entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{

	public Department findByDepartmentName(String departmentName);
	
}
