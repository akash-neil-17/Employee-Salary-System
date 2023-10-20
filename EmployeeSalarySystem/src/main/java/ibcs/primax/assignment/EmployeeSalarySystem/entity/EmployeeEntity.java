package ibcs.primax.assignment.EmployeeSalarySystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "employees")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long employeeID;
    @OneToOne
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;
    @OneToOne
    @JoinColumn(name = "bankAccount_id")
    private BankAccountEntity bankAccountEntity;
    @OneToOne
    @JoinColumn(name = "salary_id")
    private SalaryEntity salaryEntity;
}
