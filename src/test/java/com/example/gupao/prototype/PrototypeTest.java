package com.example.gupao.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 模板模式测试
 *
 * @author liushiqiang
 * @date 2018/07/30 22:47
 */
public class PrototypeTest {

    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setAge(18);
        prototype.setName("bing");
        ArrayList<String> list = new ArrayList<>();
        list.add("wefaf");
        prototype.setList(list);
        try {
            ConcretePrototype copy = (ConcretePrototype) prototype.clone();
            System.out.println((copy == prototype) + "," + copy.getName() + "," + copy.getAge());
            System.out.println((copy.getList() == prototype.getList()) + "," + copy.getList().size());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
