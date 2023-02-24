package fr.portfolio.helloapirest.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.portfolio.helloapirest.model.Employees;
import fr.portfolio.helloapirest.repository.EmployeesRepository;
import lombok.Data;

@Data
@Service
public class EmployeesService 
{
	@Autowired
	private EmployeesRepository employeesRepository;

    public Optional<Employees> getEmployee(final Long id) 
    {
        return employeesRepository.findById(id);
    }

    public Iterable<Employees> getEmployees() 
    {
        return employeesRepository.findAll();
    }

    public void deleteEmployee(final Long id) 
    {
        employeesRepository.deleteById(id);
    }

    public Employees saveEmployee(Employees employee) 
    {
        Employees savedEmployee = employeesRepository.save(employee);
        return savedEmployee;
    }
}
