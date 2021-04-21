package com.example.facade.request;

import javax.validation.constraints.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 描述类的作用
 *
 * @author: ex_zengrs
 * @date: 2021年04月13日 15:30 Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoRequest {

    @NotBlank(message = "avatar，头像不能为空")
    // @ApiModelProperty(value = "头像")
    private String avatar;

    @NotBlank(message = "email,邮箱不能为空")
    @Email(message = "email,邮箱格式不对")
    // @ApiModelProperty(value = "邮箱")
    private String email;

    @NotBlank(message = "password,密码不能为空")
    // @ApiModelProperty(value = "密码")
    private String password;

    @NotBlank(message = "phone,手机号不能为空")
    @Pattern(regexp = "^(?:(?:\\+|00)86)?1(?:(?:3[\\d])|(?:4[5-7|9])|(?:5[0-3|5-9])|(?:6[5-7])|(?:7[0-8])|(?:8[\\d])|(?:9[1|8|9]))\\d{8}$",message = "phone,手机号格式不对")
    // @ApiModelProperty(value = "手机号")
    private String phone;

//    @NotNull(message = "email,盐不能为空")
    // @ApiModelProperty(value = "盐")
    private String salt;

    @Min(value = 0,message ="sex,性别值格式不对")
    @Max(value = 1,message ="sex,性别值格式不对")
    // @ApiModelProperty(value = "性别 0未知 1女 2男")
    private Integer sex;

    @NotBlank(message = "userName,姓名不能为空")
    // @ApiModelProperty(value = "姓名")
    private String userName;
}
