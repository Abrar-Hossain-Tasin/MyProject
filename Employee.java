package com.example.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Long id;
	    
	    @Column(name="name")
	    private String name;
	    
	    @Column(name="email")
	    private String email;
	    
	    @Column(name="department")
	    private String department;

		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Employee(Long id, String name, String email, String department) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.department = department;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}
	    
	    
	    
}
