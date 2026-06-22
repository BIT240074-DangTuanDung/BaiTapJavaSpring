package com.example.studentmanagement.controller;

import com.example.studentmanagement.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @GetMapping("/student/info")
    public String getStudentInfo(Model model) {
        // Tạo đối tượng sinh viên theo yêu cầu đề bài
        Student student = new Student("Đặng Tuấn Dũng", 20, "Công nghệ thông tin");

        // Đẩy đối tượng này vào Model với cái tên định danh là "sv"
        model.addAttribute("sv", student);

        // Trả về file info.html nằm trong thư mục templates/student/
        return "student/info";
    }
}
