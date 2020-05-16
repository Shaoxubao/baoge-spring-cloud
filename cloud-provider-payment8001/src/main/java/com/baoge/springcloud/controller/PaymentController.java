package com.baoge.springcloud.controller;

import com.baoge.springcloud.entity.CommonResult;
import com.baoge.springcloud.entity.Payment;
import com.baoge.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Copyright 2018-2028 Baoge All Rights Reserved.
 * Author: Shao Xu Bao <xubao_shao@163.com>
 * Date:   2020/5/16
 */

@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/create")
    public CommonResult create(@RequestBody Payment payment) {

        int result = paymentService.create(payment);
        log.info("create result: {}", result);

        if (result > 0) {
            return new CommonResult(200, "插入成功");
        }

        return new CommonResult(201, "插入失败");
    }

    @GetMapping("/get/{id}")
    public CommonResult getById(@PathVariable("id") Long id) {
        return new CommonResult(200, "查询成功", paymentService.getById(id));
    }

}
