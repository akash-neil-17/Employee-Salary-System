package ibcs.primax.assignment.EmployeeSalarySystem.service.implementation;

import ibcs.primax.assignment.EmployeeSalarySystem.entity.SalaryEntity;
import ibcs.primax.assignment.EmployeeSalarySystem.model.Salary;
import ibcs.primax.assignment.EmployeeSalarySystem.repository.EmployeeRepository;
import ibcs.primax.assignment.EmployeeSalarySystem.repository.SalaryRepository;
import ibcs.primax.assignment.EmployeeSalarySystem.repository.UserRepository;
import ibcs.primax.assignment.EmployeeSalarySystem.service.SalaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SalaryServiceImplementation implements SalaryService {
    private final SalaryRepository salaryRepository;
    @Override
    public ResponseEntity<Salary> create(Salary salary) {
        Integer amount;
        Integer houseRent;
        Integer medicalAllowance;
        Optional<SalaryEntity> salaryEntity = salaryRepository.findByGrade(salary.getGrade());
        if (salaryEntity.isPresent()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        else{
            amount = salary.getBasicAmount();
            houseRent = (int) (amount * 20 * Math.pow(10, -2));
            medicalAllowance = (int) (amount * 15 * Math.pow(10,-2));
            SalaryEntity salaryEntity1 = SalaryEntity.builder()
                    .grade(salary.getGrade())
                    .basicAmount(salary.getBasicAmount())
                    .basicHouseRent(houseRent)
                    .basicMedicalAllowance(medicalAllowance)
                    .build();
            salaryRepository.save(salaryEntity1);
            return null;
        }
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
