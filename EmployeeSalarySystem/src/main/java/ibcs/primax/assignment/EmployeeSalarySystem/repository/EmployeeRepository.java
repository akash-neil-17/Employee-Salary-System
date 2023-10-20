package ibcs.primax.assignment.EmployeeSalarySystem.repository;

import ibcs.primax.assignment.EmployeeSalarySystem.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
    Optional<EmployeeEntity> findByUserEntityUserID(Long userID);
    Optional<EmployeeEntity> findByBankAccountEntityBankAccountID(Long bankAccountID);
    Optional<EmployeeEntity> findBySalaryEntitySalaryID (Long salaryID);
}
