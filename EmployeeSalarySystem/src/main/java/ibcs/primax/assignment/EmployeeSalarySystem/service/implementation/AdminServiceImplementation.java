package ibcs.primax.assignment.EmployeeSalarySystem.service.implementation;

import ibcs.primax.assignment.EmployeeSalarySystem.model.Employee;
import ibcs.primax.assignment.EmployeeSalarySystem.repository.AdminRepository;
import ibcs.primax.assignment.EmployeeSalarySystem.repository.EmployeeRepository;
import ibcs.primax.assignment.EmployeeSalarySystem.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminServiceImplementation implements AdminService {
    private final AdminRepository adminRepository;
    private final EmployeeRepository employeeRepository;

    @Override
    public ResponseEntity<Object> assignGrade(Employee employee) {
        return null;
    }
}
