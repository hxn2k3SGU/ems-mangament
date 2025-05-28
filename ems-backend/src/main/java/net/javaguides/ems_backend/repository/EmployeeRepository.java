package net.javaguides.ems_backend.repository;

import net.javaguides.ems_backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


// Định nghĩa một interface kế thừa từ JpaRepository có hai tham số là Entity và Kiểu dữ liệu của khóa chính
// Việc làm interface như thế này làm cho dễ quản lý code hơn và tách biệt được phần xử lý logic vơi khai báo method
// Khi mà định nghĩa như này thì nó sẽ tạo ra code CRUD cho luộn
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
