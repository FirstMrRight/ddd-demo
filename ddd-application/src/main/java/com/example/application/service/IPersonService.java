package com.example.application.service;


import com.example.domain.model.Person;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zengrenshang
 * @since 2021-04-15
 */
public interface IPersonService  {

	void createPreson(Person person);

	void updatePersonAddress(Person person);
}
