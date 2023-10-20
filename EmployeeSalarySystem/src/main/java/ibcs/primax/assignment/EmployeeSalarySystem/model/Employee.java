package ibcs.primax.assignment.EmployeeSalarySystem.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {
    private UserRequestModel userRequestModel;
    private Grade grade;
    private BankAccount bankAccount;
    private Salary salary;
}
