package fr.portfolio.helloapirest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.portfolio.helloapirest.model.Employees;

@Repository
public interface EmployeesRepository extends CrudRepository<Employees, Long>
{

}
