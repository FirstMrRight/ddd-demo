package com.example.infrastructure.enums;

/**
 * 描述类的作用
 *
 * @author: ex_zengrs
 * @date: 2021年03月30日 9:38
 * Description:
 */
public enum OperationType {
	/**
	 * 操作类型
	 */
	UNKNOWN("unknown"),
	DELETE("delete"),
	SELECT("select"),
	UPDATE("update"),
	INSERT("insert");

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	OperationType(String s) {
		this.value = s;
	}
}