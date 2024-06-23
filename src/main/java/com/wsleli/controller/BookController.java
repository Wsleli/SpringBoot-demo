package com.wsleli.controller;

import com.wsleli.domain.Enterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * @Description: 功能描述
 * @Version: 1.0
 * @Author: Wsleli Wiliams
 * @Date: 2024/06/23 0:18
 */
@RestController
@RequestMapping("/books")
public class BookController {
    @Value("${lesson}")
    private String lesson;
    @Value("${server.port}")
    private Integer port;
    @Value("${enterprise.subject[0]}")
    private String subject_00;

    @Autowired
    private Environment env;

    @Autowired
    private Enterprise enterprise;

    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println(lesson);
        System.out.println(port);
        System.out.println(subject_00);
        System.out.println("---------------------------------------");
        System.out.println(env.getProperty("lesson"));
        System.out.println(env.getProperty("enterprise.name"));
        System.out.println(env.getProperty("enterprise.subject[0]"));
        System.out.println("---------------------------------------");
        System.out.println(enterprise.getName());
        System.out.println(enterprise.getAge());
        System.out.println(Arrays.toString(enterprise.getSubject()));
        System.out.println(enterprise.getTel());
        System.out.println(enterprise.getSubject()[0]);
        System.out.println(enterprise);
        return "hello , spring boot!";
    }
}