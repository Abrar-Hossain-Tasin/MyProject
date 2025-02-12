package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Model.Employee;
@Repository
public interface EmpRepository extends JpaRepository<Employee, Long>{

}
