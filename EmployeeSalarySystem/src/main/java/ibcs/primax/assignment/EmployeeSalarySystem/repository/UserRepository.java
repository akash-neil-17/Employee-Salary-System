package ibcs.primax.assignment.EmployeeSalarySystem.repository;

import ibcs.primax.assignment.EmployeeSalarySystem.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    public UserEntity findByEmail(String email);
    Optional<UserEntity> findByFullNameAndEmail(String fullName,String email);
}
