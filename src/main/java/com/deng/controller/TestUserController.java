package com.deng.controller;

import com.deng.entity.TestUser;
import com.deng.service.TestUserService;
import org.apache.ibatis.io.ResolverUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestUserController {
    @Autowired
    TestUserService testUserService;

    @GetMapping("/getList")
    public List<TestUser> getList(){
        return testUserService.queryAllByLimit(1, 2);
    }
}
