package com.example.domain.repository;


import com.example.domain.model.UserInfo;

/**
 * 描述类的作用
 *
 * @author: ex_zengrs
 * @date: 2021年04月13日 14:38
 * Description:
 */
public interface IUserInfoRepository {

	public void createUser(UserInfo vo);
}