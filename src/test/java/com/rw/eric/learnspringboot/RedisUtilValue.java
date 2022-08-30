package com.rw.eric.learnspringboot;


import com.rw.eric.learnspringboot.util.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {LearnSpringbootApplication.class})
public class RedisUtilValue {

    @Autowired
    private RedisUtil util;

    @Test
    public void test() {
        util.set("uitls","111");
    }

}