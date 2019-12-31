/*
 * Copyright © 1998 - 2018 Tencent. All Rights Reserved
 * www.tencent.com
 * All rights reserved.
 */
package com.tencent.tusi.springboot_demo_redis_mybatis.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author shanpeng
 */
@Data
public class AccountInfo implements Serializable {

    private static final long serialVersionUID = -1340095119555693650L;

    public AccountInfo() {
    }

    private int id;

    private String accountName;

    private String accountAge;

    private String nickName;

    private String password;

    private Date createTime;

    private Date updateTime;
}
