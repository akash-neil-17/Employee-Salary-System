package ibcs.primax.assignment.EmployeeSalarySystem.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequestModel {
    private String fullName;
    private String address;
    private String mobile;
    private String email;
    private String password;
    private Role role;
}
