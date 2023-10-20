package ibcs.primax.assignment.EmployeeSalarySystem.controller;

import ibcs.primax.assignment.EmployeeSalarySystem.model.BankAccount;
import ibcs.primax.assignment.EmployeeSalarySystem.service.BankService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ess/bankAccount")
@RequiredArgsConstructor
public class BankAccountController {
    private final BankService bankService;
    @PostMapping("/create")
    public ResponseEntity<BankAccount> create(@RequestBody BankAccount bankAccount){
        return bankService.create(bankAccount);
    }
    @PutMapping("/update")
    public ResponseEntity<BankAccount> update(@RequestBody BankAccount updatedAccount){
        return bankService.update(updatedAccount);
    }
    @DeleteMapping("/delete")
    public ResponseEntity<BankAccount> delete(@RequestBody BankAccount bankAccount){
        return bankService.delete(bankAccount);
    }
    @GetMapping("/getDetail")
    public ResponseEntity<BankAccount> getDetail(@RequestBody BankAccount bankAccount){
        return bankService.getDetail(bankAccount);
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<BankAccount>> getAll(){
        return bankService.getAll();
    }
}
