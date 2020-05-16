package com.baoge.springcloud.service;

import com.baoge.springcloud.entity.Payment;

/**
 * Copyright 2018-2028 Baoge All Rights Reserved.
 * Author: Shao Xu Bao <xubao_shao@163.com>
 * Date:   2020/5/16
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getById(Long id);

}
