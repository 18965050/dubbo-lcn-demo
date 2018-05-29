package com.demo.service.impl;

import com.demo.dao.Test2Dao;
import com.demo.dao.TestDao;
import com.demo.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * lvchenggang
 * 2018/5/29
 **/
@Service
public class Test3ServiceImpl {


    @Autowired
    private Test2Dao test2Dao;

    public String test() {
        String name = "mybatis_demo3";
        Test test = new Test();
        test.setName(name);
        test2Dao.save(test);

        return name;
    }
}
