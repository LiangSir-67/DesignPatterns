package cn.liangyy.prototype.shadow;

import java.util.ArrayList;
import java.util.List;

public class TestShallowPrototype {
    public static void main(String[] args) {
        //初始化一个原型实例对象ShallowPrototype
        ShallowPrototype shallowPrototype = new ShallowPrototype();
        shallowPrototype.setAge(20);
        shallowPrototype.setName("亚索");

        List<String> phoneList = new ArrayList<>();
        phoneList.add("133xxxx452");
        shallowPrototype.setPhoneList(phoneList);

        //克隆原型对象
        ShallowPrototype cloneShallowPrototype = (ShallowPrototype) shallowPrototype.clone();
        //打印结果
        System.out.println("克隆前："+shallowPrototype.getPhoneList());
        System.out.println("克隆后："+cloneShallowPrototype.getPhoneList());

        //比较两个对象是否指向同一内存地址
        System.out.println(shallowPrototype.getPhoneList() == cloneShallowPrototype.getPhoneList());
    }
}
