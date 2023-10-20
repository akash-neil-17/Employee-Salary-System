package ibcs.primax.assignment.EmployeeSalarySystem.service.implementation;

import ibcs.primax.assignment.EmployeeSalarySystem.model.BankAccount;
import ibcs.primax.assignment.EmployeeSalarySystem.service.BankService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BankServiceImplementation implements BankService {
    @Override
    public ResponseEntity<BankAccount> create(BankAccount bankAccount) {
        return null;
    }

    @Override
    public ResponseEntity<BankAccount> update(BankAccount bankAccount) {
        return null;
    }

    @Override
    public ResponseEntity<BankAccount> getDetail(BankAccount bankAccount) {
        return null;
    }

    @Override
    public ResponseEntity<BankAccount> delete(BankAccount bankAccount) {
        return null;
    }

    @Override
    public ResponseEntity<List<BankAccount>> getAll() {
        return null;
    }
}
