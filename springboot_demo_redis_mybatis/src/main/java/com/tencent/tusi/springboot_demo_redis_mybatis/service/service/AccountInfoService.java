/*
 * Copyright © 1998 - 2018 Tencent. All Rights Reserved
 * www.tencent.com
 * All rights reserved.
 */
package com.tencent.tusi.springboot_demo_redis_mybatis.service.service;

import com.tencent.tusi.springboot_demo_redis_mybatis.entity.AccountInfo;

import java.util.List;

/**
 * @author shanpeng
 */
public interface AccountInfoService {
    int saveAccountInfo(AccountInfo accountInfo);

    int removeAccountInfoById(int id);

    AccountInfo findAccountInfoById(int id);

    int updateAccountInfo(AccountInfo accountInfo);

    List<AccountInfo> findAllAccountInfo();
}