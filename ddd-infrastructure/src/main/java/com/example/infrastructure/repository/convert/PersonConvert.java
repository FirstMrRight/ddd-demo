package com.example.infrastructure.repository.convert;


import com.example.domain.model.Person;
import com.example.infrastructure.entity.PersonDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;


/**
 * 描述类的作用
 *
 * @author: ex_zengrs
 * @date: 2021年04月13日 15:49
 * Description:
 */
@Mapper
public interface PersonConvert {
	PersonConvert INSTANCE = Mappers.getMapper(PersonConvert.class);



	@Mappings({
			@Mapping(source = "province", target = "address.province"),
			@Mapping(source = "city", target = "address.city"),
			@Mapping(source = "county", target = "address.county"),
			@Mapping(source = "street", target = "address.street")
	})
	Person convertToPerson(PersonDO personDO);

	@Mappings({
			@Mapping(source = "address.province", target = "province"),
			@Mapping(source = "address.city", target = "city"),
			@Mapping(source = "address.county", target = "county"),
			@Mapping(source = "address.street", target = "street")
	})
	PersonDO convertToDO(Person person);


}