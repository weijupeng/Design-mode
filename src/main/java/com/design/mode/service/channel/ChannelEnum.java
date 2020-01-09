package com.design.mode.service.channel;

import lombok.Getter;

import java.util.HashMap;

/**
 * @author wjp
 * @date 2020/1/9 16:59
 */
@Getter
public enum ChannelEnum {
    /**
     * 手机
     */
    IPHONE("apple", "apple"),
    HUAWEI("huawei", "huawei"),
    ;
    private String code;
    private String value;

    ChannelEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }


    private static final HashMap<String, ChannelEnum> mappings = new HashMap<>();

    static {
        for (ChannelEnum value : ChannelEnum.values()) {
            mappings.put(value.getCode(), value);
        }
    }

    public static ChannelEnum resolve(String code) {
        return mappings.get(code);
    }

}
