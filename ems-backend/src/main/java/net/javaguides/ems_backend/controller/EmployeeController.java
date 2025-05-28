package net.javaguides.ems_backend.controller;

import net.javaguides.ems_backend.dto.EmployeeDTO;
import net.javaguides.ems_backend.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Để đánh dấu là Class này trả về JSON chứ không phải HTML
@RestController
// gán cho class này với đường dẫn dưới
// khi truy cập đường dẫn này thì class này được thực hiện
@RequestMapping("/api/employees")
public class EmployeeController {
    // Khai báo dependencies
    private EmployeeService employeeService;
    // constructor của dependencies để gán giá trị
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // Build Add Employee REST API
    @PostMapping
    public ResponseEntity<EmployeeDTO> createEmployee(@RequestBody EmployeeDTO employeeDTO) {
        EmployeeDTO savedEmployee = employeeService.createEmployeeById(employeeDTO);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
}
