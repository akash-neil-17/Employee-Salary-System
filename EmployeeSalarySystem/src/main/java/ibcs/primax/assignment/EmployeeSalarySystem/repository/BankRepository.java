package ibcs.primax.assignment.EmployeeSalarySystem.repository;

import ibcs.primax.assignment.EmployeeSalarySystem.entity.BankAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BankRepository extends JpaRepository<BankAccountEntity, Long> {
    Optional<BankAccountEntity> findById(Long aLong);
}
