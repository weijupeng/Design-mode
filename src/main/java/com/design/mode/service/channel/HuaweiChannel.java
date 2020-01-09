package com.design.mode.service.channel;

import org.springframework.stereotype.Service;

/**
 * @author wjp
 * @date 2020/1/9 17:10
 */
@Service
public class HuaweiChannel implements Channel {
    @Override
    public ChannelEnum getChannelEnum() {
        return ChannelEnum.HUAWEI;
    }

    @Override
    public void create() {
        System.out.println("生产一部华为手机");
    }
}
