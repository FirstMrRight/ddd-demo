package com.example.domain.model;

import lombok.Data;

/**
 * 描述类的作用
 *
 * @author: ex_zengrs
 * @date: 2021年04月15日 9:34
 * Description:
 */
@Data
public class Person {

	private Long id;

	private Integer age;

	// @ApiModelProperty(value = "性别 0未知 1女 2男")
	private Integer sex;

	// @ApiModelProperty(value = "姓名")
	private String name;


	private Address address;
}
