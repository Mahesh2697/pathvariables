package com.demo.pathvariables.controller;

import com.demo.pathvariables.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

//    @PostMapping("/add-employee/{id}/{name}")
//    public void add(@PathVariable String id,
//                    @PathVariable String name) {
//        employeeService.add(id, name);
//    }
//@PathVariables
//    {id}/{name}

//    @PostMapping ("/add-employee")
//    public void add(@RequestParam String id,
//                    @RequestParam String name) {
//        employeeService.add(id, name);
//    }
//@RequestParam
//?id=2&name=sam


    @PostMapping ("/add-employee")
    public void add(@RequestHeader String id,
                    @RequestHeader String name) {
        employeeService.add(id, name);
    }
//@RequestHeaders
//Headers application/json example: id=1, name= jon.

    @GetMapping("/get-all-employees")
    public Map<String, String> getAll() {
        return employeeService.getAll();
    }

    @GetMapping("/get-employee/{id}")
    public String getEmployee(@PathVariable String id) {
        return employeeService.get(id);
    }

    @DeleteMapping("/delete-employee/{id}")
    public String deleteEmployee(@PathVariable String id) {
        return employeeService.delete(id);
    }

}
