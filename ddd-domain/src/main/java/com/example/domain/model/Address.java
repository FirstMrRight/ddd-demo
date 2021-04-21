package com.example.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 描述类的作用
 *
 * @author: ex_zengrs
 * @date: 2021年04月15日 9:26
 * Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

	/**
	 * 省
	 */
	private String province;
	/**
	 * 市
	 */
	private String city;
	/**
	 * 区/县
	 */
	private String county;
	/**
	 * 街道（具体到门牌号）
	 */
	private String street;

}
