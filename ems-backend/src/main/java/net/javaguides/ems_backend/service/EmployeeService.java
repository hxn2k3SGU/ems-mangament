package net.javaguides.ems_backend.service;

import net.javaguides.ems_backend.dto.EmployeeDTO;

import java.util.List;

// Đây là interface của thằng Service Employee
// Chỉ nen dùng thằng DTO tại vì nó đúng cấu trúc
// API không bị thay đổi khi dtb thay đổi
public interface EmployeeService {
    // Khai báo cái khung của thằng create của thằng employee có phương thức tạo nhân viên
    // Với tham số là object của class EmployDTO
    EmployeeDTO createEmployee(EmployeeDTO employeeDTO);
    EmployeeDTO createEmployeeById(EmployeeDTO employeeDTO);
    // Khai báo khung của thằng get nhân viên bằng ID với tham số ID nhân viên
    EmployeeDTO getEmployeeById(long EmployeeId);
    List<EmployeeDTO> getAllEmployees();
    EmployeeDTO updateEmployee(Long employeeID, EmployeeDTO employeeDTO);

}
