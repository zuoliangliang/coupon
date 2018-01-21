package com.xiao6.coupon.mapper;

import com.xiao6.coupon.mapper.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import java.util.List;

@Mapper
public interface UserMapper {

    @Insert("insert into tb_user(user_name,age) values(#{userName},#{age})")
    @SelectKey(statement = "select last_insert_id()", keyProperty = "id", before = false, resultType = int.class)
    Integer save(User user);

    @Select("select * from tb_user")
    List<User> list();
}
