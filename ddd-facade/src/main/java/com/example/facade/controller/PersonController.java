package com.example.facade.controller;

import com.example.domain.model.Person;
import com.example.facade.assembler.PersonAssembler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.application.service.IPersonService;
import com.example.facade.request.PersonRequest;
import com.example.infrastructure.utils.ResponseResult;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author zengrenshang
 * @since 2021-04-15
 */
@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private IPersonService personService;

	@PostMapping("createPreson")
	public ResponseResult createPreson(@Validated(PersonRequest.CREATE_PERSON.class) @RequestBody PersonRequest request) {
		Person person = PersonAssembler.INSTANCE.convertPerson(request);
		personService.createPreson(person);
		return new ResponseResult();
	}

	@PostMapping("updatePersonAddress")
	public ResponseResult updatePersonAddress(@Validated(PersonRequest.UPDATE_PERSON_ADDRESS.class) @RequestBody PersonRequest request) {
		Person person = PersonAssembler.INSTANCE.convertPerson(request);
		personService.updatePersonAddress(person);
		return new ResponseResult();
	}

}
