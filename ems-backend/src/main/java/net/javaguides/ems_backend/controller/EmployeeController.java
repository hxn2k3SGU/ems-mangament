package net.javaguides.ems_backend.controller;

import net.javaguides.ems_backend.dto.EmployeeDTO;
import net.javaguides.ems_backend.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    // Build Get Employee REST API
    // hàm này là hàm trả về ResponseEntity<T>
    // Trong đó T (EmployDTO) là kiểu dữ liệu bạn muốn trả về
    // Kèm theo là giá trị của thằng HTTP response.
    // VD: 200,201....v...v
    @GetMapping("{id}")
    public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable("id") Long EmployeeId) {
        EmployeeDTO employeeDTO = employeeService.getEmployeeById(EmployeeId);
        return ResponseEntity.ok(employeeDTO);
    }


    // Build API Get ALLEmployees
    // Trả về list hèm trạng thái HTTP

    @GetMapping
    public ResponseEntity<List<EmployeeDTO>> getAllEmployees() {
        // Gọi Service để lấy danh sách EmployeeDTO
        List<EmployeeDTO> employeeDTOList = employeeService.getAllEmployees();
        // Trả về HTTP 200 OK cùng với danh sách JSON các nhân viên
        return ResponseEntity.ok(employeeDTOList);
    }

    //REST API update employee
    // Trả về thằng DTO nhân viên với HTTP STATUS
    // Tham số là phải có thằng id với Nhân viên DTO
    // Gọi thằng service để xử lý
    // trả về HTTP ok với thằng DTO đã xử lý
    @PutMapping("{id}")
    public ResponseEntity<EmployeeDTO> updateEmployee(@PathVariable("id") Long employeeID
            ,@RequestBody EmployeeDTO updatedEmployeeDTO) {
        EmployeeDTO employeeDTO = employeeService.updateEmployee(employeeID, updatedEmployeeDTO);
        return ResponseEntity.ok(employeeDTO);
    }
}
