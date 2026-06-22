package com.example.studentmanagement.model;

public class Student {
    private String name;
    private int age;
    private String major;

    // Constructor (Hàm khởi tạo)
    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    // Các hàm Getter và Setter để Thymeleaf có thể đọc được dữ liệu
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }
}