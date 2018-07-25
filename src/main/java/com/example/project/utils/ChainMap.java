package com.example.project.utils;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 用户构建简单map值对象
 * 支持链式调用
 *
 * @Author weipeng
 * @date 2018/5/8 下午7:49
 */
public class ChainMap extends ConcurrentHashMap<String, Object> {

    private ChainMap() {
        super();
    }

    public static ChainMap createMap() {
        ChainMap chainMap = new ChainMap();
        return chainMap;
    }

    public static ChainMap createMap(String key, Object value) {
        ChainMap chainMap = new ChainMap();
        chainMap.append(key, value);
        return chainMap;
    }

    public ChainMap append(String key, Object value) {
        this.put(key, value);
        return this;
    }

}
