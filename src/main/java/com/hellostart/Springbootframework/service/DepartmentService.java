package com.hellostart.Springbootframework.service;

import com.hellostart.Springbootframework.entity.Department;
import com.hellostart.Springbootframework.error.DepartmentNotFoundExemption;

import java.util.List;

public interface DepartmentService {
   public Department saveDepartment(Department department);

   public List<Department> fetchDepartmentList();

  public Department fetchDepartmentbyId(Long departmentId) throws DepartmentNotFoundExemption;

  public void deleteDepartmentById(Long departmentId);

    public Department updateDepartment(long departmentId, Department department);

   public Department fetchDepartmentByNameIgnoreCase(String departmentName);
}
