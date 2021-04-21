package com.example.facade.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 描述类的作用
 *
 * @author: ex_zengrs
 * @date: 2021年04月15日 11:07
 * Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonRequest {
	public interface CREATE_PERSON{}
	public interface UPDATE_PERSON{}
	public interface UPDATE_PERSON_ADDRESS{}

	/**
	 * 主键
	 */
	@NotNull(message = "id ,不能为空",groups = {UPDATE_PERSON.class,UPDATE_PERSON_ADDRESS.class})
	private Long id;

	/**
	 * 年龄
	 */
//	@NotNull(message = "age ,年龄不能为空",groups = {CREATE.class})
	private Integer age;

	/**
	 * 性别
	 */
//	@NotNull(message = "sex ,性别不能为空",groups = {CREATE.class})
	private Integer sex;

	/**
	 * 名字
	 */
	@NotBlank(message = "名字 ,name不能为空",groups = {CREATE_PERSON.class})
	private String name;

	/**
	 * 省
	 */
	@NotBlank(message = "province ,省不能为空",groups = {CREATE_PERSON.class})
	private String province;

	/**
	 * 市
	 */
	@NotBlank(message = "city ,市不能为空",groups = {CREATE_PERSON.class,UPDATE_PERSON_ADDRESS.class})
	private String city;

	/**
	 * 区/县
	 */
	@NotBlank(message = "county ,区/县不能为空",groups = {CREATE_PERSON.class,UPDATE_PERSON_ADDRESS.class})
	private String county;

	/**
	 * 街道
	 */
	@NotBlank(message = "street ,街道不能为空",groups = {CREATE_PERSON.class,UPDATE_PERSON_ADDRESS.class})
	private String street;

}
