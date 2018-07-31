package com.example.gupao.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 策略模式测试
 *
 * @author liushiqiang
 * @date 2018/07/30 9:37
 */
public class StrategyTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("afae");
        list.add("dde");
        list.add("fes");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
    }
}
