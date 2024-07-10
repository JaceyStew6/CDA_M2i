package org.example.tp_spring_react.service;

import org.example.tp_spring_react.dto.employee.EmployeeDtoGet;
import org.example.tp_spring_react.dto.employee.EmployeeDtoPost;
import org.example.tp_spring_react.entities.Employee;
import org.example.tp_spring_react.exception.NotFoundException;
import org.example.tp_spring_react.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService implements BaseService<EmployeeDtoPost, EmployeeDtoGet> {
    @Autowired
    private EmployeeRepository employeeRepository;
    private final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    @Override
    public EmployeeDtoGet create(EmployeeDtoPost employeeDtoPost) {
        Employee employee = Employee.builder()
                .name(employeeDtoPost.getName())
                .identificationNumber(employeeDtoPost.getIdentificationNumber())
                .address(employeeDtoPost.getAddress())
                .phone(employeeDtoPost.getPhone())
                .email(employeeDtoPost.getEmail())
                .birthDate(LocalDate.parse(employeeDtoPost.getBirthDate(), dateFormatter))
                .contractStart(LocalDate.parse(employeeDtoPost.getContractStart(), dateFormatter))
                .contractEnd(LocalDate.parse(employeeDtoPost.getContractEnd(), dateFormatter))
                .occupation(employeeDtoPost.getOccupation())
                .password(employeeDtoPost.getPassword())
                .admin(employeeDtoPost.isAdmin())
                .salary(employeeDtoPost.getSalary())
                .observation(employeeDtoPost.getObservation())
                .build();

        employeeRepository.save(employee);
        return employeeToEmployeeDtoGet(employee);
    }

    private Employee getById(Integer id){
        return employeeRepository.findById(id).orElseThrow(() -> new NotFoundException(id.toString()));
    }

    @Override
    public EmployeeDtoGet update(int id, EmployeeDtoPost employeeDtoPost) {
        Employee employee = getById(id);
        employee.setName(employeeDtoPost.getName());
        employee.setIdentificationNumber(employeeDtoPost.getIdentificationNumber());
        employee.setAddress(employeeDtoPost.getAddress());
        employee.setPhone(employeeDtoPost.getPhone());
        employee.setEmail(employeeDtoPost.getEmail());
        employee.setBirthDate(LocalDate.parse(employeeDtoPost.getBirthDate(), dateFormatter));
        employee.setContractStart(LocalDate.parse(employeeDtoPost.getContractStart(), dateFormatter));
        employee.setContractEnd(LocalDate.parse(employeeDtoPost.getContractEnd(), dateFormatter));
        employee.setOccupation(employeeDtoPost.getOccupation());
        employee.setPassword(employeeDtoPost.getPassword());
        employee.setAdmin(employeeDtoPost.isAdmin());
        employee.setSalary(employeeDtoPost.getSalary());
        employee.setObservation(employeeDtoPost.getObservation());

        employeeRepository.save(employee);
        return employeeToEmployeeDtoGet(employee);
    }

    @Override
    public boolean delete(int id) {
        Employee employee = getById(id);
        employeeRepository.delete(employee);
        return true;
    }

    @Override
    public EmployeeDtoGet findById(int id) {
        return employeeToEmployeeDtoGet(getById(id));
    }

    @Override
    public List<EmployeeDtoGet> findAll() {
        return employeesToEmployeesDtoGets((List<Employee>) employeeRepository.findAll());
    }

    private EmployeeDtoGet employeeToEmployeeDtoGet(Employee employee){
        return EmployeeDtoGet.builder()
                .id(employee.getId())
                .name(employee.getName())
                .identificationNumber(employee.getIdentificationNumber())
                .address(employee.getAddress())
                .phone(employee.getPhone())
                .email(employee.getEmail())
                .birthDate(employee.getBirthDate())
                .contractStart(employee.getContractStart())
                .contractEnd(employee.getContractEnd())
                .occupation(employee.getOccupation())
                .admin(employee.isAdmin())
                .salary(employee.getSalary())
                .observation(employee.getObservation())
                .build();
    }

    private List<EmployeeDtoGet> employeesToEmployeesDtoGets(List<Employee> employees){
        return employees.stream().map(this::employeeToEmployeeDtoGet).collect(Collectors.toList());
    }
}
