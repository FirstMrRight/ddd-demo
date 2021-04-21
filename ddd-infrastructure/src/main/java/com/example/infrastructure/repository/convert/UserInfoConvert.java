package com.example.infrastructure.repository.convert;


import com.example.domain.model.UserInfo;
import com.example.infrastructure.entity.UserInfoDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


/**
 * 描述类的作用
 *
 * @author: ex_zengrs
 * @date: 2021年04月13日 15:49
 * Description:
 */
@Mapper
public interface UserInfoConvert {
	UserInfoConvert INSTANCE = Mappers.getMapper(UserInfoConvert.class);

	UserInfo convertToVO(UserInfoDO userInfoDO);

	UserInfoDO convertToDO(UserInfo userInfoVO);

}