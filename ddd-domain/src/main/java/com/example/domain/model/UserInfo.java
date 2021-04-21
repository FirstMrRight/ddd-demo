package com.example.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 描述类的作用
 *
 * @author: ex_zengrs
 * @date: 2021年04月13日 15:30
 * Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {

	private String id;

	// @ApiModelProperty(value = "邮箱")
	private String email;

	// @ApiModelProperty(value = "密码")
	private String password;

	// @ApiModelProperty(value = "手机号")
	private String phone;


	// @ApiModelProperty(value = "性别 0未知 1女 2男")
	private Integer sex;

	// @ApiModelProperty(value = "姓名")
	private String userName;


}
