package ibcs.primax.assignment.EmployeeSalarySystem.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Salary {
    private Grade grade;
    private Float basicAmount;
    private Float basicHouseRent;
    private Float basicMedicalAllowance;
}
