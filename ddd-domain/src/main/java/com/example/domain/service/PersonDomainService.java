package com.example.domain.service;


import com.example.domain.model.Person;

/**
 * 描述类的作用
 *
 * @author: ex_zengrs
 * @date: 2021年04月14日 9:16
 * Description:
 */
public interface PersonDomainService {

	void save(Person person);

	Person findById(Long id);
}
