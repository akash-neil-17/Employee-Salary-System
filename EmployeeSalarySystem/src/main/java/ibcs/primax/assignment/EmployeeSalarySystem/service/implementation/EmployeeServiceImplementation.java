package ibcs.primax.assignment.EmployeeSalarySystem.service.implementation;

import ibcs.primax.assignment.EmployeeSalarySystem.entity.EmployeeEntity;
import ibcs.primax.assignment.EmployeeSalarySystem.model.Employee;
import ibcs.primax.assignment.EmployeeSalarySystem.repository.EmployeeRepository;
import ibcs.primax.assignment.EmployeeSalarySystem.repository.UserRepository;
import ibcs.primax.assignment.EmployeeSalarySystem.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImplementation implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final UserRepository userRepository;
    private final Employee employee;
    @Override
    public ResponseEntity<Employee> create(Employee employee) {
        return null;
    }

    @Override
    public ResponseEntity<Employee> update(Employee employee) {
        return null;
    }

    @Override
    public ResponseEntity<Employee> getEmployee(Employee employee) {
        return null;
    }

    @Override
    public ResponseEntity<Employee> delete(Employee employee) {
        return null;
    }

    @Override
    public ResponseEntity<List<EmployeeEntity>> getAll() {
        return null;
    }
}
