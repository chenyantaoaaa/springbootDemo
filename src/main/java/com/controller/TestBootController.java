package com.controller;

import com.mapper.PvInfoMapper;
import com.pojo.PvInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pojo.User;

/**
 * Created by chenyantao
 * 2017/12/1.
 */

@RestController
@EnableAutoConfiguration
@RequestMapping("/testboot")
public class TestBootController {
    @Autowired
    private PvInfoMapper pvInfoMapper;

    @RequestMapping("getuser")
    public PvInfo getUser() {
        PvInfo info = pvInfoMapper.selectByPrimaryKey(100);
        return info;
    }
}
