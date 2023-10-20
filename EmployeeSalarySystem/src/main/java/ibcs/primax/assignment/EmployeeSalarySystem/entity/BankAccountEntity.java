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
@Table(name = "bank_accounts")
public class BankAccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bankAccount_id")
    private Long bankAccountID;
    private String accountType;
    private String accountHolderName;
    private String accountNumber;
    private String bankName;
    private String branchName;
    private Float currentBalance;
}
