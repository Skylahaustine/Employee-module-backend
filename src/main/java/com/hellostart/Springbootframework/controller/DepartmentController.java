package com.hellostart.Springbootframework.controller;

import com.hellostart.Springbootframework.entity.Department;
import com.hellostart.Springbootframework.error.DepartmentNotFoundExemption;
import com.hellostart.Springbootframework.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){
        return departmentService.saveDepartment(department);


    }
    @GetMapping("/departments")
    public List<Department>fetchDepartmentList(){
        return departmentService.fetchDepartmentList();


    }
    @GetMapping("/departments/{id}")
    public Department fetchDepartmentbyId(@PathVariable("id") Long departmentId) throws DepartmentNotFoundExemption {
        return departmentService.fetchDepartmentbyId(departmentId);


    }
    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartmentById(departmentId);
                return "Department Deleted!!!";

    }
    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") long departmentId,
                            @RequestBody Department department){
        return departmentService.updateDepartment(departmentId, department);

    }
    @GetMapping("/departments/name/{name}")
    public Department fetchDataByName(@PathVariable("name") String departmentName){
        return departmentService.fetchDepartmentByNameIgnoreCase(departmentName);
    }
}
