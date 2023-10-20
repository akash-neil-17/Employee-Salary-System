package ibcs.primax.assignment.EmployeeSalarySystem.service.implementation;

import ibcs.primax.assignment.EmployeeSalarySystem.model.Salary;
import ibcs.primax.assignment.EmployeeSalarySystem.service.SalaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SalaryServiceImplementation implements SalaryService {
    @Override
    public ResponseEntity<Salary> create(Salary salary) {
        return null;
    }

    @Override
    public ResponseEntity<Salary> update(Salary updatedSalary) {
        return null;
    }

    @Override
    public ResponseEntity<Salary> delete(Salary salary) {
        return null;
    }

    @Override
    public ResponseEntity<Salary> getDetail(Salary salary) {
        return null;
    }

    @Override
    public ResponseEntity<List<Salary>> getAll() {
        return null;
    }
}
