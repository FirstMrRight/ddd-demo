package com.example.facade.assembler;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import com.example.domain.model.Person;
import com.example.facade.request.PersonRequest;

/**
 * 描述类的作用
 *
 * @author: ex_zengrs
 * @date: 2021年04月13日 15:49 Description:
 */
@Mapper
public interface PersonAssembler {
    PersonAssembler INSTANCE = Mappers.getMapper(PersonAssembler.class);

    @Mappings({@Mapping(source = "province", target = "address.province"),
        @Mapping(source = "city", target = "address.city"), @Mapping(source = "county", target = "address.county"),
        @Mapping(source = "street", target = "address.street")})
    Person convertPerson(PersonRequest request);
}