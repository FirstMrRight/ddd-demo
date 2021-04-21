package com.example.domain.service.impl;


import com.example.domain.model.Person;
import com.example.domain.repository.IPersonRepository;
import com.example.domain.service.PersonDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



/**
 * 描述类的作用
 *
 * @author: ex_zengrs
 * @date: 2021年04月14日 9:16
 * Description:
 */
@Component
public class PersonDomainServiceImpl implements PersonDomainService {

	@Autowired
	private IPersonRepository personRepository;

	@Override
	public void save(Person person) {
		if (person.getId()>0){
			personRepository.update(person);
		}else {
			personRepository.save(person);
		}
	}

	@Override
	public Person findById(Long id) {
		return personRepository.getById(id);
	}
}
