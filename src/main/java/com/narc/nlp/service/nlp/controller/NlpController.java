package com.narc.nlp.service.nlp.controller;

import com.alibaba.fastjson.JSONObject;
import com.narc.nlp.service.nlp.service.TimeNlpService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Narcssus
 * @date : 2019/11/17 17:03
 */
@RestController
@RequestMapping("/")
@Api(tags = "语义识别接口")
@Slf4j
public class NlpController {


    @Autowired
    private TimeNlpService timeNlpService;


    @ApiOperation(value = "时间语义识别接口", notes = "2年1个月后提醒我拿快递1小时3分50秒后吃饭半分钟后带回家2小时后工作3小时2分钟后干啥45分钟后干啥30分钟20秒后干啥半小时后干啥")
    @GetMapping(value = "/timeNlp")
    public JSONObject doNlp(String param) {
        log.info("时间语义识别接口收到请求：{}", param);
        return timeNlpService.doTimeNlp(param);
    }



}
