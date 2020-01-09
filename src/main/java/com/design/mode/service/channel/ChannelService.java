package com.design.mode.service.channel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wjp
 * @date 2020/1/9 17:53
 */
@Service
public class ChannelService {

    @Autowired
    private ChannelFactory channelFactory;


    public void channelFactorys(String code) {
        Channel channel = channelFactory.getChannel(code);
        channel.create();
    }

}
