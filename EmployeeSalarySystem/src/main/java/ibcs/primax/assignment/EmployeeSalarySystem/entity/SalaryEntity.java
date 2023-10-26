package ibcs.primax.assignment.EmployeeSalarySystem.entity;

import ibcs.primax.assignment.EmployeeSalarySystem.model.Grade;
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
@Table(name = "salary_list")
public class SalaryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "salary_id")
    private Long salaryID;
    @Enumerated(EnumType.STRING)
    private Grade grade;
    private Integer basicAmount;
    private Integer basicHouseRent;
    private Integer basicMedicalAllowance;
}
