package ibcs.primax.assignment.EmployeeSalarySystem.service;

import ibcs.primax.assignment.EmployeeSalarySystem.model.BankAccount;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BankService {
    ResponseEntity<BankAccount> create(BankAccount bankAccount);
    ResponseEntity<BankAccount> update(BankAccount bankAccount);
    ResponseEntity<BankAccount> getDetail(BankAccount bankAccount);
    ResponseEntity<BankAccount> delete(BankAccount bankAccount);
    ResponseEntity<List<BankAccount>> getAll();
}
