package ibcs.primax.assignment.EmployeeSalarySystem.repository;

import ibcs.primax.assignment.EmployeeSalarySystem.entity.SalaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SalaryRepository extends JpaRepository<SalaryEntity, Long> {
    Optional<SalaryEntity> findBySalaryID(Long salaryID);
}
