package com.example.infrastructure.exception;

/**
 * 描述类的作用
 *
 * @author: ex_zengrs
 * @date: 2021年03月30日 15:27
 * Description:
 */
public class ParamaErrorException extends RuntimeException {

	public ParamaErrorException() {
	}

	public ParamaErrorException(String message) {
		super(message);
	}
}
