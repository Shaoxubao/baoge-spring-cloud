package com.baoge.springcloud.dao;

import com.baoge.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Copyright 2018-2028 Baoge All Rights Reserved.
 * Author: Shao Xu Bao <xubao_shao@163.com>
 * Date:   2020/5/16
 */

@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getById(@Param("id") Long id);

}
