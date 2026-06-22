package com.example.studentmanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // Dùng luôn RestController cho ngắn gọn vì bài này đều trả về text
public class ProductController {

    // 1. Sử dụng @PathVariable cho /product/detail/5
    @GetMapping("/product/detail/{id}")
    public String getProductDetail(@PathVariable("id") String id) {
        if (id == null || id.trim().isEmpty()) {
            return "Lỗi: ID sản phẩm không được để trống!";
        }
        try {
            int productId = Integer.parseInt(id);
            return "Product ID = " + productId;
        } catch (NumberFormatException e) {
            return "Lỗi: ID sản phẩm phải là một số nguyên hợp lệ!";
        }
    }

    // 2. Sử dụng @RequestParam cho /product/category?name=Laptop
    @GetMapping("/product/category")
    public String getProductCategory(@RequestParam(name = "name", required = false) String name) {
        if (name == null || name.trim().isEmpty()) {
            return "Lỗi: Tên danh mục (category name) không hợp lệ hoặc bị thiếu!";
        }
        return "Category = " + name;
    }
}