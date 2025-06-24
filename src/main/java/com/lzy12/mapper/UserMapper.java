package com.lzy12.mapper;

import com.lzy12.entity.*;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 表结构：
 * CREATE TABLE `user` (
 *   `username` varchar(255) DEFAULT NULL,
 *   `age` int DEFAULT NULL
 * )
 */
public interface UserMapper {
    @Select("select * from user where username=#{username}")
    UserEntity findUserByUsername(@Param("username") String username);
    @Insert("INSERT INTO `blog`.`user` (`username`, `age`) VALUES (#{username}, #{age});")
    int insertUser(@Param("username") String username, @Param("age") Integer age);

}
