package temur.uz.springsecurityandrole.service;

import temur.uz.springsecurityandrole.entity.Employee;

import java.util.List;

public interface EmployeeService {

    Employee save(Employee employee);

    List<Employee> findAll();

    Employee findById(Long id);

    List<Employee> findByName(String name);

    List<Employee> findAllByParam(String name);

    void delete(Long id);

    Employee saveSchedule();

}
