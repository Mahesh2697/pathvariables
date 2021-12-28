package com.demo.pathvariables.service;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeService {

    private Map<String, String> employees = new HashMap<>();

    public void add(String id, String name) {
        employees.put(id, name);
    }

    public Map<String, String> getAll() {
        return employees;
    }

    public String get(String id) {
        return employees.get(id);
    }

    public String delete(String id) {
        return employees.remove(id);
    }

}