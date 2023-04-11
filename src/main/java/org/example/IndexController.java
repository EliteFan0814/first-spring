package org.example;

import org.example.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/")
    @ResponseBody
    public Object index() {
        return userMapper.getUserById(1);
    }
}
