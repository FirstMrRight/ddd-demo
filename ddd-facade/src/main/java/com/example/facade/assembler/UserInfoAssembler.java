package com.example.facade.assembler;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.example.domain.model.UserInfo;
import com.example.facade.request.UserInfoRequest;

/**
 * 描述类的作用
 *
 * @author: ex_zengrs
 * @date: 2021年04月13日 15:49 Description:
 */
@Mapper
public interface UserInfoAssembler {
    UserInfoAssembler INSTANCE = Mappers.getMapper(UserInfoAssembler.class);

    UserInfo convertToVO(UserInfoRequest request);

}