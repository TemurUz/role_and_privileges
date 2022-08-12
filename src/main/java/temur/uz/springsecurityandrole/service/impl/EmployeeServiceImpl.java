package temur.uz.springsecurityandrole.service.impl;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import temur.uz.springsecurityandrole.entity.Employee;
import temur.uz.springsecurityandrole.repository.EmployeeRepository;
import temur.uz.springsecurityandrole.service.EmployeeService;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(Long id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public List<Employee> findByName(String name) {
        return employeeRepository.findByNameQueryNative(name);
    }

    @Override
    public List<Employee> findAllByParam(String name) {
        return employeeRepository.findAllNativeLike(name);
    }

    @Override
    public void delete(Long id) {
        Employee employee = employeeRepository.getOne(id);
        employeeRepository.delete(employee);
    }

    @Scheduled(cron = "0 45 23 * * *")
    @Override
    public Employee saveSchedule() {
        Employee employee1 = new Employee();
        employee1.setName("ddddddddd");
        employee1.setLastName("ddddd");
        return employeeRepository.save(employee1);
    }
}
