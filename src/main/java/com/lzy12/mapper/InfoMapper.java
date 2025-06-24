package com.lzy12.mapper;

import com.lzy12.entity.*;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface InfoMapper {
//    @Select("select * from user where username=#{username}")
//    UserEntity findUserByUsername(@Param("username") String username);
//    @Insert("INSERT INTO `blog`.`user` (`username`, `age`) VALUES (#{username}, #{age});")
//    int insertUser(@Param("username") String username, @Param("age") Integer age);

    @Select("SELECT * FROM info")
    List<InfoEntity> getInfoList();  // 返回所有记录
    @Insert("INSERT INTO info (info) VALUES (#{info});")
    int insertInfo(@Param("info") String info);
    @Delete("delete from info where id = (#{id})")
    int deleteInfo(@Param("id") int id);
}
