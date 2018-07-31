package com.example.gupao.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 模板模式实体类
 *
 * @author liushiqiang
 * @date 2018/07/30 22:44
 */
public class ConcretePrototype implements Cloneable {
    private String name;
    private Integer age;
    public ArrayList<String> list;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        ConcretePrototype prototype = null;
        try {
            prototype = (ConcretePrototype) super.clone();
            prototype.list = (ArrayList<String>) this.list.clone();
        }catch (Exception e){
        }
        return prototype;
    }
}
