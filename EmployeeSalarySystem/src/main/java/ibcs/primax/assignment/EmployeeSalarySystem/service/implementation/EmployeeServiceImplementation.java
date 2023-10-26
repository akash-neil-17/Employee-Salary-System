package ibcs.primax.assignment.EmployeeSalarySystem.service.implementation;

import ibcs.primax.assignment.EmployeeSalarySystem.entity.EmployeeEntity;
import ibcs.primax.assignment.EmployeeSalarySystem.entity.UserEntity;
import ibcs.primax.assignment.EmployeeSalarySystem.model.Employee;
import ibcs.primax.assignment.EmployeeSalarySystem.model.UserResponseModel;
import ibcs.primax.assignment.EmployeeSalarySystem.repository.EmployeeRepository;
import ibcs.primax.assignment.EmployeeSalarySystem.repository.UserRepository;
import ibcs.primax.assignment.EmployeeSalarySystem.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImplementation implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final UserRepository userRepository;
    @Override
    public ResponseEntity<String> update(UserResponseModel userResponseModel) {
        Optional<UserEntity> userEntity = userRepository.findByFullNameAndEmail(userResponseModel.getFullName(), userResponseModel.getEmail());
        if (userEntity.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            Optional<EmployeeEntity> existingEmployee = employeeRepository.findByUserEntityUserID(userEntity.get().getUserID());
            if (existingEmployee.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            else {
                UserEntity existingUserEntity = userEntity.get();
                existingUserEntity.setFullName(userResponseModel.getFullName());
                existingUserEntity.setEmail(userResponseModel.getEmail());
                existingUserEntity.setAddress(userResponseModel.getAddress());
                existingUserEntity.setMobile(userResponseModel.getMobile());
                existingUserEntity.setRole(userResponseModel.getRole());
                userRepository.save(existingUserEntity);
                return ResponseEntity.ok("Profile updated successfully!");
            }
        }
    }

    @Override
    public ResponseEntity<UserResponseModel> getEmployee(UserDetails userDetails) {
        String userEmail = userDetails.getUsername();
        UserEntity userEntity = userRepository.findByEmail(userEmail);
        if (userEntity!=null){
            UserResponseModel userResponseModel = new UserResponseModel();
            userResponseModel.setFullName(userEntity.getFullName());
            userResponseModel.setEmail(userEntity.getEmail());
            userResponseModel.setAddress(userEntity.getAddress());
            userResponseModel.setMobile(userEntity.getMobile());
            userResponseModel.setRole(userEntity.getRole());

            return new ResponseEntity<>(userResponseModel, HttpStatus.FOUND);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<Employee> delete(Employee employee) {
        Optional<UserEntity> userEntity = userRepository.findByFullNameAndEmail(employee.getUserRequestModel().getFullName(), employee.getUserRequestModel().getEmail());
        if (userEntity.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            Optional<EmployeeEntity> existingEmployee = employeeRepository.findByUserEntityUserID(userEntity.get().getUserID());
            if (existingEmployee.isPresent()){
                employeeRepository.delete(existingEmployee.get());
                userRepository.delete(userEntity.get());
                return new ResponseEntity<>(HttpStatus.ACCEPTED);
            }
            else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }
    }

    @Override
    public ResponseEntity<List<EmployeeEntity>> getAll() {
        return new ResponseEntity<>(employeeRepository.findAll(), HttpStatus.OK);
    }
}
