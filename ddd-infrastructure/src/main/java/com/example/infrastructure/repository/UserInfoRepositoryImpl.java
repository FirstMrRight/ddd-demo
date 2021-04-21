package com.example.infrastructure.repository;


import com.example.domain.model.UserInfo;
import com.example.domain.repository.IUserInfoRepository;
import com.example.infrastructure.entity.UserInfoDO;
import com.example.infrastructure.mapper.UserInfoMapper;
import com.example.infrastructure.repository.convert.UserInfoConvert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 * 会员信息 业务层
 * @author: ex_zengrs
 * @date: 2021年04月13日 14:39
 * Description:
 */
@Service
public class UserInfoRepositoryImpl  implements IUserInfoRepository {

	@Autowired
	private UserInfoMapper userInfoMapper;

	@Override
	public void createUser(UserInfo vo) {
		UserInfoDO userInfoDO = UserInfoConvert.INSTANCE.convertToDO(vo);
		if (userInfoDO.getId()!=null&&userInfoDO.getId()>0){
			userInfoMapper.updateById(userInfoDO);
		}else {
			userInfoMapper.insert(userInfoDO);
		}
	}
}
