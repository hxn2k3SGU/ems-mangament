🧑‍💼 EMS Management Backend
Đây là phần backend của hệ thống Quản lý nhân viên (Employee Management System), được xây dựng bằng Spring Boot và MySQL. Dự án cung cấp các API RESTful để thực hiện các thao tác CRUD (Create, Read, Update, Delete) cho thông tin nhân viên.

🚀 Tính năng chính
✅ Thêm mới nhân viên

✅ Cập nhật thông tin nhân viên

✅ Xóa nhân viên

✅ Lấy danh sách tất cả nhân viên

✅ Tìm kiếm nhân viên theo ID

🛠️ Công nghệ sử dụng
⚙️ Spring Boot – Framework Java mạnh mẽ cho phát triển ứng dụng web

🗃️ Spring Data JPA – Quản lý dữ liệu và ORM

🐬 MySQL – Hệ quản trị cơ sở dữ liệu quan hệ

📦 Maven – Quản lý dự án và phụ thuộc

🔄 REST API – Giao tiếp giữa frontend và backend

📁 Cấu trúc thư mục
css
Sao chép
Chỉnh sửa
ems-mangament-backend/
├── ems-backend/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/
│   │   │   │       └── example/
│   │   │   │           └── emsbackend/
│   │   │   │               ├── controller/
│   │   │   │               ├── model/
│   │   │   │               ├── repository/
│   │   │   │               └── service/
│   │   │   └── resources/
│   │   │       ├── application.properties
│   └── pom.xml
⚙️ Cấu hình cơ sở dữ liệu
Trong file application.properties, cấu hình kết nối đến MySQL:

spring.datasource.url=jdbc:mysql://localhost:3306/ems_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
📝 Lưu ý: Thay đổi your_password thành mật khẩu thực tế của bạn.

🧪 Cách chạy dự án
Clone repository:


git clone https://github.com/hxn2k3SGU/ems-mangament-backend.git
cd ems-mangament-backend/ems-backend
Xây dựng và chạy ứng dụng:
./mvnw spring-boot:run
Hoặc nếu bạn sử dụng Maven cài đặt sẵn:
mvn spring-boot:run
Truy cập API:

Ứng dụng sẽ chạy tại http://localhost:8080.

📬 API Endpoint mẫu
GET /api/employees – Lấy danh sách nhân viên

GET /api/employees/{id} – Lấy thông tin nhân viên theo ID

POST /api/employees – Thêm mới nhân viên

PUT /api/employees/{id} – Cập nhật thông tin nhân viên

DELETE /api/employees/{id} – Xóa nhân viên

👨‍💻 Tác giả
Nguyễn Xuân Hiếu – GitHub
