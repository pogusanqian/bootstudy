package com.pogu.bootstudy.controller;

import com.pogu.bootstudy.domain.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  @RestController = @Controller+ @ResponseBody
 */
@RestController
public class StudentController {

    @RequestMapping("/getStudent")
    public Student getStudent() {
        // stringboot会自动将对象转换成json字符串进行返回
        return new Student("张三", 23, "男");
    }
}
