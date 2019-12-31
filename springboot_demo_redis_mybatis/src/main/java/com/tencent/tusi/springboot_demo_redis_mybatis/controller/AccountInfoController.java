/*
 * Copyright © 1998 - 2018 Tencent. All Rights Reserved
 * www.tencent.com
 * All rights reserved.
 */
package com.tencent.tusi.springboot_demo_redis_mybatis.controller;

import com.tencent.tusi.springboot_demo_redis_mybatis.entity.AccountInfo;
import com.tencent.tusi.springboot_demo_redis_mybatis.service.service.AccountInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author shanpeng
 */
@Controller
@RequestMapping(value = "demo")
public class AccountInfoController {

    @Autowired
    AccountInfoService accountInfoService;

    @PostMapping(value = "/saveAccount")
    @ResponseBody
    public int saveAccount(@RequestBody AccountInfo accountInfo){
        return accountInfoService.saveAccountInfo(accountInfo);
    }

    @GetMapping(value = "/getAccount/{id}")
    @ResponseBody
    public AccountInfo findAccount(@PathVariable(value = "id")int id){
        return accountInfoService.findAccountInfoById(id);
    }

    @GetMapping(value = "/getAllAccount")
    @ResponseBody
    public List<AccountInfo> findAllAccount(){
        return accountInfoService.findAllAccountInfo();
    }

    @RequestMapping(value = "/removeAccount/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public int removeAccountById(@PathVariable("id")int id){
        return accountInfoService.removeAccountInfoById(id);
    }

    @RequestMapping(value = "/updateAccount",method = RequestMethod.PUT)
    @ResponseBody
    public int updateAccount(@RequestBody AccountInfo accountInfo){
        return accountInfoService.updateAccountInfo(accountInfo);
    }
}
