package ibcs.primax.assignment.EmployeeSalarySystem.service;

import ibcs.primax.assignment.EmployeeSalarySystem.entity.EmployeeEntity;
import ibcs.primax.assignment.EmployeeSalarySystem.model.Employee;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EmployeeService {
    ResponseEntity<Employee> create(Employee employee);
    ResponseEntity<Employee> update(Employee employee);
    ResponseEntity<Employee> getEmployee(Employee employee);
    ResponseEntity<Employee> delete(Employee employee);
    ResponseEntity<List<EmployeeEntity>> getAll();
}
