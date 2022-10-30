package com.chen.book.mapper;

import com.chen.book.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author CHEN
 * @create 2022-10-30-23:08
 */
@Mapper
public interface UserMapper {

    User getUser(@Param("uname") String uname, @Param("pwd") String pwd);

}
