package com.design.mode.service.channel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author wjp
 * @date 2020/1/9 16:52
 */
@Component
public class ChannelFactory {

    @Autowired
    private List<Channel> channels = new ArrayList<>();

    private HashMap<String, Channel> channelOrderHashMap = new HashMap<>();

    @PostConstruct
    private void init() {
        for (Channel channelOrder : channels) {
            channelOrderHashMap.put(channelOrder.getChannelEnum().getCode(), channelOrder);
        }
    }


    public Channel getChannel(String code) {
        ChannelEnum channelEnum = ChannelEnum.resolve(code);
        return channelOrderHashMap.get(channelEnum.getCode());
    }

}
