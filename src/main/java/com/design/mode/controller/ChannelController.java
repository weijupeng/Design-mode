package com.design.mode.controller;

import com.design.mode.service.channel.ChannelService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wjp
 * @date 2020/1/9 17:54
 */
@RestController
public class ChannelController {

    @Resource
    private ChannelService channelService;

    @GetMapping("/channel/{code}")
    public void channels(@PathVariable("code") String code) {
        channelService.channelFactorys(code);
    }
}
