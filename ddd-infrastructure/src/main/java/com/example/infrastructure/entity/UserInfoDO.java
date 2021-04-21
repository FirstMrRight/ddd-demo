package com.example.infrastructure.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 用户会员基础信息
 *
 * @author: ex_zengrs
 * @date: 2021年04月13日 10:57 Description:
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("user_info")
// @ApiModel(value="UserInfo对象", description="用户信息表")
public class UserInfoDO extends BaseEntity {

    private static final long serialVersionUID = 1L;

    // @ApiModelProperty(value = "头像")
    @TableField("avatar")
    private String avatar;

    // @ApiModelProperty(value = "邮箱")
    @TableField("email")
    private String email;

    // @ApiModelProperty(value = "密码")
    @TableField("password")
    private String password;

    // @ApiModelProperty(value = "手机号")
    @TableField("phone")
    private String phone;

    // @ApiModelProperty(value = "盐")
    @TableField("salt")
    private String salt;

    // @ApiModelProperty(value = "性别 0未知 1女 2男")
    @TableField("sex")
    private Integer sex;

    // @ApiModelProperty(value = "姓名")
    @TableField("user_name")
    private String userName;
}
