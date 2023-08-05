package com.employee.demo.service;

import com.employee.demo.model.Employee;
import com.employee.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee>  getallemps() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Integer id) {
        return employeeRepository.findById(id).orElse(null);
    }

    //    public List<Employee> getAllEmployees(){
//        List<Employee> employees = new ArrayList<Employee>();
//        employeeRepository.findAll().forEach(employees::add);
//
//        return employees;
//    }
    public Employee createemployee(Employee employee) {
        return employeeRepository.save(employee);

    }

//    public Employee updateemployee(Integer id,Employee employee){
//        Employee existingemployee = employeeRepository.findById(id).orElse(null);
//
//        if (existingemployee != null ){
//            existingemployee.setName(updateemployee.getName());
//        }
//    }

//    public Employee updateEmployee(Employee employee) {
//        return employeeRepository.save(new Employee(employee.getId(), employee.getEmail(), employee.getName()));
//
//    }

//    public EmployeeService(EmployeeRepository employeeRepository) {
//        this.employeeRepository = employeeRepository;
//    }

//    public List<Employee> getAllEmployees() {
//        return employeeRepository.findAll();
//    }



//    public Iterable<Employee> findAll() {
//        return null;
//    }



//
//    public EmployeeService(EmployeeRepository employeeRepository) {
//        this.employeeRepository = employeeRepository;
//    }
////    public List<Employee> getAllEmployees() {
////        return employeeRepository.findAll();
////    }
////
//
//    public Optional<Employee> getEmployeeById(int id) {
//        return employeeRepository.findById(id);
//    }
//
//    public Employee addEmployee(Employee employee) {
//        // You can add additional business logic here before saving the employee
//        return employeeRepository.save(employee);
//    }
}
