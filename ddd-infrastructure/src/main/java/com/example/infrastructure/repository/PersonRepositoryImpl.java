package com.example.infrastructure.repository;


import com.example.domain.model.Person;
import com.example.domain.repository.IPersonRepository;
import com.example.infrastructure.entity.PersonDO;
import com.example.infrastructure.mapper.PersonMapper;
import com.example.infrastructure.repository.convert.PersonConvert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 会员信息 业务层
 * @author: ex_zengrs
 * @date: 2021年04月13日 14:39
 * Description:
 */
@Service
public class PersonRepositoryImpl  implements IPersonRepository {

	@Autowired
	private PersonMapper personMapper;


	@Override
	public void update(Person person) {
		PersonDO personDO = PersonConvert.INSTANCE.convertToDO(person);
		personMapper.updateById(personDO);
	}

	@Override
	public void save(Person person) {
		PersonDO personDO = PersonConvert.INSTANCE.convertToDO(person);
		personMapper.insert(personDO);
	}

	@Override
	public Person getById(Long id) {
		PersonDO personDO = personMapper.selectById(id);
		return PersonConvert.INSTANCE.convertToPerson(personDO);
	}
}
