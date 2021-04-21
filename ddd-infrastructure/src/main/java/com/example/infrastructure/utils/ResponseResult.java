package com.example.infrastructure.utils;



import com.example.infrastructure.enums.ResultEnum;
import lombok.Data;

/**
 * 描述类的作用
 *
 * @author: ex_zengrs
 * @date: 2021年03月30日 15:28
 * Description:
 */
@Data
public class ResponseResult {
	private Integer code;
	private String msg;

	public ResponseResult(){
	}

	public ResponseResult(ResultEnum resultEnum){
		this.code = resultEnum.getCode();
		this.msg = resultEnum.getMessage();
	}

	public ResponseResult(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}
}
