package com.lzy12.service;

import com.lzy12.entity.InfoEntity;
import com.lzy12.entity.UserEntity;
import com.lzy12.mapper.InfoMapper;
import com.lzy12.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@Slf4j //开启Lombok的日志支持
@CrossOrigin(origins = "*") // 允许所有来源,只有开启了才可以允许其它地址或其它端口的数据，实现前后端分离
public class infoDBController {
    @Autowired
    private InfoMapper infoMapper;
    @GetMapping("/getInfo")
    public List<InfoEntity> getInfoList() {
        log.info("getInfo");
        return infoMapper.getInfoList();
    }

    @PostMapping("/insert")
    public Map<String,String> insertUser(@RequestBody InfoEntity info) {   //表示通过json接收数据
        Map<String,String> map = new HashMap<>();
        if(infoMapper.insertInfo(info.getInfo())>0){
            map.put("code","200");
            map.put("msg","success");
        }else {
            map.put("code","500");
            map.put("msg","fail");
        }
        return map;
    }

    @PostMapping("/delete")
    public Map<String,String> deleteUser(@RequestBody InfoEntity info) {
        Map<String,String> map = new HashMap<>();
        if(infoMapper.deleteInfo(info.getId())>0){
            map.put("code","200");
            map.put("msg","success");
        } else {
            map.put("code","500");
            map.put("msg","fail");
        }
        return map;
    }

}
