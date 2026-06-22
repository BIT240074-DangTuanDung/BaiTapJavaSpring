package com.example.studentmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home") // Gom gốc đường dẫn chung là /home
public class HomeController {

    @GetMapping("/index")
    @ResponseBody // Bắt buộc phải có để trả về chuỗi text thay vì tìm file HTML
    public String index() {
        return "Welcome to Spring Boot";
    }

    @GetMapping("/about")
    @ResponseBody
    public String about() {
        return "Đặng Tuấn Dũng"; // Thay bằng họ tên của bạn vào đây
    }

    @GetMapping("/contact")
    @ResponseBody
    public String contact() {
        return "dangtuandung@gmail.com"; // Thay bằng email của bạn vào đây
    }
}
