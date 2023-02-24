package fr.portfolio.helloapirest.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import fr.portfolio.helloapirest.model.Employees;
import fr.portfolio.helloapirest.service.EmployeesService;

@RestController
public class EmployeesController 
{
	@Autowired
	private EmployeesService employeesservice;
	
    /**
    * Read - Get all employees
    * @return - An Iterable object of Employee full filled
    */
    @GetMapping("/employees")
    public Iterable<Employees> getEmployees() 
    {
        return employeesservice.getEmployees();
    }
    
    @GetMapping("/getEmployee/{id}")
    public Optional<Employees> getEmployee(@PathVariable("id") final long id) 
    {
    	return employeesservice.getEmployee(id);
    }
    
}


