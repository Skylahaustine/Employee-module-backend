package com.hellostart.Springbootframework.service;

import com.hellostart.Springbootframework.entity.Department;
import com.hellostart.Springbootframework.error.DepartmentNotFoundExemption;
import com.hellostart.Springbootframework.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService{
  @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

  @Override
  public List<Department> fetchDepartmentList() {
    return departmentRepository.findAll();
  }

  @Override
  public Department fetchDepartmentbyId(Long departmentId) throws DepartmentNotFoundExemption {
    Optional<Department> department = departmentRepository.findById(departmentId);
    if (!department.isPresent()) {
      throw new DepartmentNotFoundExemption("Department Not Available");

    }
    return department.get();
  }

  @Override
  public void deleteDepartmentById(Long departmentId) {
    departmentRepository.deleteById(departmentId);
  }

  @Override
  public Department updateDepartment(long departmentId, Department department) {
    Department depDb =departmentRepository.findById(departmentId).get();
    if(Objects.nonNull(department.getDepartmentName ()) &&
            !"".equalsIgnoreCase(department.getDepartmentName ())) {
      depDb.setDepartmentName(department.getDepartmentName());
    }
    if(Objects.nonNull(department.getDepartmentCode()) &&
            !"".equalsIgnoreCase(department.getDepartmentCode())) {
      depDb.setDepartmentCode(department.getDepartmentCode());
    }
    if(Objects.nonNull(department.getDepartmentAddress()) &&
            !"".equalsIgnoreCase(department.getDepartmentAddress())) {
      depDb.setDepartmentAddress(department.getDepartmentAddress());
    }
    return  departmentRepository.save(depDb);
  }



  @Override
  public Department fetchDepartmentByNameIgnoreCase(String departmentName) {
    return departmentRepository.findByDepartmentNameIgnoreCase(departmentName);
  }
}
