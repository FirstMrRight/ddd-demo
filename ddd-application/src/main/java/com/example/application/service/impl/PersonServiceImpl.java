package com.example.application.service.impl;

import com.example.application.service.IPersonService;
import com.example.domain.model.Address;
import com.example.domain.model.Person;
import com.example.domain.service.PersonDomainService;
import com.example.infrastructure.exception.ParamaErrorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zengrenshang
 * @since 2021-04-15
 */
@Service
public class PersonServiceImpl  implements IPersonService {

	@Autowired
	private PersonDomainService personDomainService;

	@Override
	public void createPreson(Person person) {
		personDomainService.save(person);
	}

	@Override
	public void updatePersonAddress(Person person) {
		Person personDomain = personDomainService.findById(person.getId());
		if (personDomain==null){
			throw  new ParamaErrorException("用户不存在");
		}
		personDomain.setAddress(new Address(person.getAddress().getProvince(),person.getAddress().getCity(),person.getAddress().getCounty(),person.getAddress().getStreet()));
		personDomainService.save(personDomain);
	}
}
