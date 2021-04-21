package com.example.facade.controller;

import com.example.application.service.IUserInfoService;
import com.example.domain.model.UserInfo;
import com.example.facade.assembler.UserInfoAssembler;
import com.example.facade.request.UserInfoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ex_zengrs
 * @date 2021年03月22日 9:54
 */
@RestController
@RequestMapping("userInfo")
public class UserInfoController {

    private IUserInfoService userInfoService;

    private UserInfoAssembler userInfoAssembler;

    private UserInfoController(IUserInfoService userInfoService) {
        this.userInfoService = userInfoService;
        this.userInfoAssembler = UserInfoAssembler.INSTANCE;
    }

    @PostMapping("addUser")
    public String addUser(@Validated @RequestBody UserInfoRequest request) {
        UserInfo userInfo = userInfoAssembler.convertToVO(request);
        userInfoService.createUser(userInfo);
        return "ok";
    }
}
