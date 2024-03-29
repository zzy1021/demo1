package com.example.demo1.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_user")
public class user {
    @TableField(exist = false)
    private String username;
    @TableField(exist = false)
    private String password;


    @TableId
    private Long id;
    private String name;
    private Integer age;
    private  String email;
    @TableLogic
    private  Integer isDeleted;

}
