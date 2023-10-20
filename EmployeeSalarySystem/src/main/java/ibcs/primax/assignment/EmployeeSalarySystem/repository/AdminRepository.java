package ibcs.primax.assignment.EmployeeSalarySystem.repository;

import ibcs.primax.assignment.EmployeeSalarySystem.entity.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<AdminEntity, Long> {
}
