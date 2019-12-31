/*
 * Copyright © 1998 - 2018 Tencent. All Rights Reserved
 * www.tencent.com
 * All rights reserved.
 */
package com.tencent.tusi.springboot_demo_redis_mybatis.dao;

import com.tencent.tusi.springboot_demo_redis_mybatis.entity.AccountInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

/**
 * @author shanpeng
 */
@Qualifier(value = "accountDao")
public interface AccountInfoDao {
    int saveAccountInfo(@Param("pojo")AccountInfo accountInfo);

    int removeAccountById(@Param("id")int id);

    AccountInfo findAccountInfoById(@Param("id")int id);

    int updateAccountInfo(@Param("pojo")AccountInfo accountInfo);

    List<AccountInfo> findAllAccountInfo();
}