package com.atguigu.admin.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName User
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/19 20:29
 **/

@AllArgsConstructor
@NoArgsConstructor
@Data
//@TableName
public class User {

    /**
     * 所有属性都应该在数据库中
     */

    @TableField(exist = false)
    private String userName;
    @TableField(exist = false)
    private String password;

    private Long id;
    private String name;
    private Integer age;
    private String email;
}
