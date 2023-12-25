package com.example.demoRestApi.controller;

import com.example.demoRestApi.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmploayeeApiService {
private List<Employee> employeeList= new ArrayList<Employee>();

@GetMapping("hello")
    public String getSayHello(){
        return "Hello World - Employee Details Example";
    }
@GetMapping("myorg/employees")
public List<Employee> getAllEmployee(){
    return this.employeeList;
}
@GetMapping("myorg/{employeeId}")
public Employee getEmployee(@PathVariable int employeeId){
    return employeeList.stream().filter(employee -> employee.getId()==employeeId).findFirst().orElse(null);
}
@PostMapping("myorg/addEmployee")
    public String addEmployee(@RequestBody Employee employee){
    this.employeeList.add(employee);
    return "Employee was added suffesfully";
}

}
