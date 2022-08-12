package temur.uz.springsecurityandrole.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import temur.uz.springsecurityandrole.entity.Employee;
import temur.uz.springsecurityandrole.security.SecurityUtils;
import temur.uz.springsecurityandrole.service.EmployeeService;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/")
public class EmployeeController {

    private final EmployeeService employeeService;

    /**
     * create user
     * @param employee
     * @return Employee
     */
    @PostMapping("/employees")
    public ResponseEntity create(@RequestBody Employee employee){
        Employee employee1 = employeeService.save(employee);
        return ResponseEntity.ok(employee1);
    }

    @PutMapping("/employees")
    public ResponseEntity update(@RequestBody Employee employee){
        Employee employee1 = employeeService.save(employee);
        return ResponseEntity.ok(employee1);
    }

    @GetMapping("/employees")
    public ResponseEntity getAll(){
        List<Employee> employeeList = employeeService.findAll();
        return ResponseEntity.ok(employeeList);
    }

    @GetMapping("/employees/{name}")
    public ResponseEntity getAll(@PathVariable String name){
        Optional<String> optional = SecurityUtils.getCurrentUserName();
        List<Employee> employeeList = employeeService.findByName(name);
        return ResponseEntity.ok(employeeList);
    }

    @GetMapping("/employees/search")
    public ResponseEntity getAllSerach(@RequestParam String name){
        List<Employee> employeeList = employeeService.findAllByParam(name);
        return ResponseEntity.ok(employeeList);
    }

    @DeleteMapping("/employees/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        employeeService.delete(id);
        return ResponseEntity.ok("Qator o'chirildi");
    }
}
