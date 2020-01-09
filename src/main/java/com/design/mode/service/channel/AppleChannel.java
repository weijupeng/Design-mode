package com.design.mode.service.channel;

import org.springframework.stereotype.Service;

/**
 * @author wjp
 * @date 2020/1/9 17:09
 */
@Service
public class AppleChannel implements Channel {
    @Override
    public ChannelEnum getChannelEnum() {
        return ChannelEnum.IPHONE;
    }

    @Override
    public void create() {
        System.out.println("生产一部苹果手机");
    }
}
