package ibcs.primax.assignment.EmployeeSalarySystem.controller;

import ibcs.primax.assignment.EmployeeSalarySystem.model.Salary;
import ibcs.primax.assignment.EmployeeSalarySystem.service.SalaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ess/salary")
@RequiredArgsConstructor
public class SalaryController {
    private final SalaryService salaryService;
    @PostMapping("/create")
    public ResponseEntity<Salary> create(@RequestBody Salary salary){
        return salaryService.create(salary);
    }
    @PutMapping("/update")
    public ResponseEntity<Salary> update(@RequestBody Salary updatedSalary){
        return salaryService.update(updatedSalary);
    }
    @GetMapping("/getDetail")
    public ResponseEntity<Salary> getDetail(@RequestBody Salary salary){
        return salaryService.getDetail(salary);
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<Salary>> getAll(){
        return salaryService.getAll();
    }
}
