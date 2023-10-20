package ibcs.primax.assignment.EmployeeSalarySystem.controller;

import ibcs.primax.assignment.EmployeeSalarySystem.model.Employee;
import ibcs.primax.assignment.EmployeeSalarySystem.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ess/admin")
@RequiredArgsConstructor
public class AdminController {
    private final AdminService adminService;
    @PutMapping("/assignGrade")
    public ResponseEntity<Object> assignGrade(@RequestBody Employee employee){
        return adminService.assignGrade(employee);
    }
}
