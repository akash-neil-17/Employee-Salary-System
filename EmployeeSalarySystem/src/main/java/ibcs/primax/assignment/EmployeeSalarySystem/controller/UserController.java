package ibcs.primax.assignment.EmployeeSalarySystem.controller;

import ibcs.primax.assignment.EmployeeSalarySystem.model.UserRequestModel;
import ibcs.primax.assignment.EmployeeSalarySystem.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ess/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @PostMapping("/register")
    public ResponseEntity<Object> register (@RequestBody UserRequestModel userRequestModel){
        return userService.register(userRequestModel);
    }
}
