package com.employee.demo.controller;

import com.employee.demo.model.Employee;
import com.employee.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@Controller
@RestController
public class EmployeeController {
    @Autowired

    private EmployeeService employeeService;

    @GetMapping("/employee")
    public  List<Employee> getallemps()
    {
        return employeeService.getallemps();

    }
    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable("id") int id){
        Employee employeeData =  employeeService.getEmployeeById(id);

        return employeeData;
    }

    @PostMapping("/employee")
    public void createemployee(@RequestBody Employee e ) {
        employeeService.createemployee(e);

    }

//    @PutMapping("/employee/{id}")
//    public ResponseEntity<Employee>  updateEmployee(@PathVariable("id") int id, @RequestBody Employee employee){
//        Optional<Employee> employeeData = Optional.ofNullable(employeeService.getEmployeeById(id));
//
//        if(employeeData.isPresent()){
//            Employee employeeValue = employeeData.get();
//            employeeValue.setEmail(employee.getEmail());
//            employeeValue.setName(employee.getName());
//            return new ResponseEntity<>(employeeService.updateEmployee(employee), HttpStatus.OK);
//        }
//        else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }


//    @GetMapping("/employees")
//    public ResponseEntity<List<Employee>> getAllEmployee() {
//        try {
//            List<Employee> products = new ArrayList<>();
//
//            employeeService.getAllEmployees().forEach(products::add);
//            return new ResponseEntity<>(products, HttpStatus.OK);
//        } catch (Exception e) {
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }

//    @GetMapping("/products/{id}")
//    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long id) {
//        Optional<Employee> employeeData = employeeService.getEmployeeById((int) id);
//
//        if (employeeData.isPresent()) {
//            return new ResponseEntity<>(employeeData.get(), HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }

}



