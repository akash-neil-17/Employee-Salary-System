package ibcs.primax.assignment.EmployeeSalarySystem.controller;

import ibcs.primax.assignment.EmployeeSalarySystem.entity.EmployeeEntity;
import ibcs.primax.assignment.EmployeeSalarySystem.model.Employee;
import ibcs.primax.assignment.EmployeeSalarySystem.model.UserResponseModel;
import ibcs.primax.assignment.EmployeeSalarySystem.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ess/employee")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;
    @PutMapping("/update")
    public ResponseEntity<String> create(@RequestBody UserResponseModel userResponseModel){
        return employeeService.update(userResponseModel);
    }
    @DeleteMapping("/delete")
    public ResponseEntity<Employee> delete(@RequestBody Employee employee){
        return employeeService.delete(employee);
    }
    @GetMapping("/getDetail")
    public ResponseEntity<UserResponseModel> getDetail(@AuthenticationPrincipal UserDetails userDetails){
        return employeeService.getEmployee(userDetails);
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<EmployeeEntity>> getAll(){
        return employeeService.getAll();
    }
}
