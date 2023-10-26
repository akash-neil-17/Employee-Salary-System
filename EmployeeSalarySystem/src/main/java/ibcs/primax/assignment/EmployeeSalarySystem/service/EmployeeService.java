package ibcs.primax.assignment.EmployeeSalarySystem.service;

import ibcs.primax.assignment.EmployeeSalarySystem.entity.EmployeeEntity;
import ibcs.primax.assignment.EmployeeSalarySystem.model.Employee;
import ibcs.primax.assignment.EmployeeSalarySystem.model.UserResponseModel;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

public interface EmployeeService {
    ResponseEntity<String> update(UserResponseModel userResponseModel);
    ResponseEntity<UserResponseModel> getEmployee(UserDetails userDetails);
    ResponseEntity<Employee> delete(Employee employee);
    ResponseEntity<List<EmployeeEntity>> getAll();
}
