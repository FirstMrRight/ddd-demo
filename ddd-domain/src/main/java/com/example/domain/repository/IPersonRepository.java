package com.example.domain.repository;


import com.example.domain.model.Person;

/**
 * 描述类的作用
 *
 * @author: ex_zengrs
 * @date: 2021年04月13日 14:38
 * Description:
 */
public interface IPersonRepository  {

	void update(Person person);

	void save(Person person);

	Person getById(Long id);
}