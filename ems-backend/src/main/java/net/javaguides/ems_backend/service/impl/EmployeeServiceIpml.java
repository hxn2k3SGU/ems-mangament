package net.javaguides.ems_backend.service.impl;

import net.javaguides.ems_backend.dto.EmployMapper;
import net.javaguides.ems_backend.dto.EmployeeDTO;
import net.javaguides.ems_backend.entity.Employee;
import net.javaguides.ems_backend.repository.EmployeeRepository;
import net.javaguides.ems_backend.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceIpml implements EmployeeService {

    // Khai báo dependencies để giao tiếp voi
    private EmployeeRepository employeeRepository;

    // Constructor
    public EmployeeServiceIpml(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
        return null;
    }

    @Override
    public EmployeeDTO createEmployeeById(EmployeeDTO employeeDTO) {
        // Chuyển DTO sang entity
        Employee employee = EmployMapper.mapToEmployee(employeeDTO);
        // Lưu entity vào DB qua JpaRepository
        Employee savedEmployee = employeeRepository.save(employee);
        // Chuyển từ entity đã lưu thành DTO để trả về
        return EmployMapper.mapToEmployeeDTO(savedEmployee);
    }
}
