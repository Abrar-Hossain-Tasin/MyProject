package com.example.Service;

import java.util.List;

import com.example.Model.Employee;

public interface EmpService {


	public Employee createEmployee(Employee employee);

	public List<Employee> getAllEmployees();

	public Employee getEmployeeById(Long id);

	public Employee updateEmployee(Long id, Employee employeeDetails);

	public void deleteEmployee(Long id);

}
