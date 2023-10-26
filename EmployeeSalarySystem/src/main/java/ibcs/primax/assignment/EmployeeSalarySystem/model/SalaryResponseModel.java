package ibcs.primax.assignment.EmployeeSalarySystem.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SalaryResponseModel {
    private String fullName;
    private String address;
    private String mobile;
    private String email;
    private String accountType;
    private String accountHolderName;
    private String accountNumber;
    private String bankName;
    private String branchName;
    private Integer currentBalance;
}
