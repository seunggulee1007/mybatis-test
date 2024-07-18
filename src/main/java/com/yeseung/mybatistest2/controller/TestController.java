package com.yeseung.mybatistest2.controller;

import com.yeseung.mybatistest2.entity.Test;
import com.yeseung.mybatistest2.mapper.TestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestMapper testMapper;

    @GetMapping("/test")
    public Test getTest() {
        return testMapper.selectTest();
    }

    @PostMapping("/test/{id}")
    public void insertTest(@PathVariable Long id) {
        testMapper.insertTest(id);
    }

}
