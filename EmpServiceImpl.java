package com.example.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.Employee;
import com.example.Repository.EmpRepository;
import com.example.Service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {

    private final EmpRepository empRepository;

    @Autowired  
    public EmpServiceImpl(EmpRepository empRepository) {
        this.empRepository = empRepository;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return empRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return empRepository.findById(id).orElse(null);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return empRepository.findAll();
    }

    @Override
    public Employee updateEmployee(Long id, Employee employeeDetails) {
        Optional<Employee> optionalEmployee = empRepository.findById(id);
        if (optionalEmployee.isPresent()) {
            Employee employee = optionalEmployee.get();
            employee.setName(employeeDetails.getName());
            employee.setEmail(employeeDetails.getEmail());
            employee.setDepartment(employeeDetails.getDepartment());
            return empRepository.save(employee);
        } else {
            return null; // Handle not found scenario properly
        }
    }

    @Override
    public void deleteEmployee(Long id) {
        empRepository.deleteById(id);
    }
}
