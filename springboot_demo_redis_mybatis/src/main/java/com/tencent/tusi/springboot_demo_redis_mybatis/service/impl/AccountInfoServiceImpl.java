/*
 * Copyright © 1998 - 2018 Tencent. All Rights Reserved
 * www.tencent.com
 * All rights reserved.
 */
package com.tencent.tusi.springboot_demo_redis_mybatis.service.impl;

import com.tencent.tusi.springboot_demo_redis_mybatis.dao.AccountInfoDao;
import com.tencent.tusi.springboot_demo_redis_mybatis.entity.AccountInfo;
import com.tencent.tusi.springboot_demo_redis_mybatis.service.service.AccountInfoService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shanpeng
 */
@Service
public class AccountInfoServiceImpl implements AccountInfoService {

    @Resource
    AccountInfoDao accountInfoDao;

    @Override
    @Caching(evict = {@CacheEvict(cacheNames = "accountList",allEntries = true)},
             put = {@CachePut(cacheNames = "account",key = "#accountInfo.id")})
    public int saveAccountInfo(AccountInfo accountInfo) {
        return accountInfoDao.saveAccountInfo(accountInfo);
    }

    @Override
    @Caching(evict = {@CacheEvict(cacheNames = "accountList",allEntries = true),
                      @CacheEvict(cacheNames = "account",key = "#id")})
    public int removeAccountInfoById(int id) {
        return accountInfoDao.removeAccountById(id);
    }

    @Override
    @Cacheable(value = "account")
    public AccountInfo findAccountInfoById(int id) {
        return accountInfoDao.findAccountInfoById(id);
    }

    @Override
    @Cacheable(value = "accountList")
    public List<AccountInfo> findAllAccountInfo(){
        return accountInfoDao.findAllAccountInfo();
    }

    @Override
    @Caching(evict = {@CacheEvict(cacheNames = "accountList",allEntries = true)},
            put = {@CachePut(cacheNames = "account",key = "#accountInfo.id")})
    public int updateAccountInfo(AccountInfo accountInfo) {
        return accountInfoDao.updateAccountInfo(accountInfo);
    }
}
