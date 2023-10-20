package ibcs.primax.assignment.EmployeeSalarySystem.service;

import ibcs.primax.assignment.EmployeeSalarySystem.model.Salary;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface SalaryService {
    ResponseEntity<Salary> create(Salary salary);
    ResponseEntity<Salary> update(Salary updatedSalary);
    ResponseEntity<Salary> delete(Salary salary);
    ResponseEntity<Salary> getDetail(Salary salary);
    ResponseEntity<List<Salary>> getAll();
}
