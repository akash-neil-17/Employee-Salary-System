package ibcs.primax.assignment.EmployeeSalarySystem.service.implementation;

import ibcs.primax.assignment.EmployeeSalarySystem.config.JwtService;
import ibcs.primax.assignment.EmployeeSalarySystem.entity.AdminEntity;
import ibcs.primax.assignment.EmployeeSalarySystem.entity.EmployeeEntity;
import ibcs.primax.assignment.EmployeeSalarySystem.entity.UserEntity;
import ibcs.primax.assignment.EmployeeSalarySystem.model.UserRequestModel;
import ibcs.primax.assignment.EmployeeSalarySystem.model.UserResponseModel;
import ibcs.primax.assignment.EmployeeSalarySystem.repository.AdminRepository;
import ibcs.primax.assignment.EmployeeSalarySystem.repository.EmployeeRepository;
import ibcs.primax.assignment.EmployeeSalarySystem.repository.UserRepository;
import ibcs.primax.assignment.EmployeeSalarySystem.service.UserService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImplementation implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final UserResponseModel userResponseModel;
    private final EmployeeRepository employeeRepository;
    private final AdminRepository adminRepository;
    @Override
    @Transactional
    public ResponseEntity<Object> register(UserRequestModel userRequestModel) {
        Optional<UserEntity> existingUser = userRepository.findByFullNameAndEmail(userResponseModel.getFullName(), userRequestModel.getEmail());
        if (existingUser.isPresent()){
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        else {
            UserEntity userEntity = UserEntity.builder()
                    .fullName(userRequestModel.getFullName())
                    .address(userRequestModel.getAddress())
                    .mobile(userRequestModel.getMobile())
                    .email(userRequestModel.getEmail())
                    .password(passwordEncoder.encode(userRequestModel.getPassword()))
                    .role(userRequestModel.getRole())
                    .build();
            userRepository.save(userEntity);
            String role = userEntity.getRole().name();
            if (role.equalsIgnoreCase("ADMIN")){
                AdminEntity adminEntity = AdminEntity.builder()
                        .userEntity(userEntity)
                        .build();
                adminRepository.save(adminEntity);
            }
            else{
                EmployeeEntity employeeEntity = EmployeeEntity.builder()
                        .userEntity(userEntity)
                        .build();
                employeeRepository.save(employeeEntity);
            }
            return new ResponseEntity<>(HttpStatus.CREATED);
        }
    }
}
