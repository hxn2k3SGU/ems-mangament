package net.javaguides.ems_backend.dto;

import net.javaguides.ems_backend.entity.Employee;

// Class này dùng để chuyển đổi DTO thành Entity và ngược lại
// Entity -> DTO -> DB
// DB -> DTO -> Entity -> FE
public class EmployMapper {

    // Method mapToEmployeeDTO có kiểu trả về là EmployeeDTO với tham số truyền vào là employee
    public static EmployeeDTO mapToEmployeeDTO(Employee employee) {
        return new EmployeeDTO(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    public static Employee mapToEmployee(EmployeeDTO employeeDTO) {
        return new Employee(
                employeeDTO.getId(),
                employeeDTO.getFirstName(),
                employeeDTO.getLastName(),
                employeeDTO.getEmail()
        );
    }

}
