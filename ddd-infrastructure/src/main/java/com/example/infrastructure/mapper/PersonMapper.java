package com.example.infrastructure.mapper;

import com.example.infrastructure.entity.PersonDO;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zengrenshang
 * @since 2021-04-15
 */
@Mapper
public interface PersonMapper extends BaseMapper<PersonDO> {

}
