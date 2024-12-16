package com.example.flashsale.mapper;

import com.example.flashsale.model.User;
import org.apache.ibatis.annotations.*;

/**
 * 用户信息操作 Mapper 接口
 */
@Mapper
public interface UserMapper {
    @Select("SELECT id, name, balance, user_type FROM users WHERE id = #{userId}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "balance", column = "balance"),
            @Result(property = "userType", column = "user_type")
    })
    User getUserById(int userId);

    @Update("UPDATE users SET balance = #{balance} WHERE id = #{id}")
    void updateUserBalance(User user);
}
