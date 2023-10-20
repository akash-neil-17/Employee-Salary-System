package ibcs.primax.assignment.EmployeeSalarySystem.service;

import ibcs.primax.assignment.EmployeeSalarySystem.model.Employee;
import org.springframework.http.ResponseEntity;

public interface AdminService {
    ResponseEntity<Object> assignGrade(Employee employee);
}
