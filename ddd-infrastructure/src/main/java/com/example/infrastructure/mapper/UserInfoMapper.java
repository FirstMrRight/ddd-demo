package com.example.infrastructure.mapper;

import com.example.infrastructure.entity.UserInfoDO;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;


/**
 * 会员信息 mapper
 * @author ex_zengrs
 * @date 2021年04月13日 14:39
 */
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfoDO> {

}
