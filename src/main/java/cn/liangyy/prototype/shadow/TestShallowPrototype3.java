package cn.liangyy.prototype.shadow;

import java.util.ArrayList;
import java.util.List;

public class TestShallowPrototype3 {
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

        //直接修改prototype对象的phoneList指向
        shallowPrototype.setPhoneList(new ArrayList<>());   //这样只是把phoneList属性修改了一个指向（指向的是一个新的地址），而原List对象依旧在内存中
        System.out.println(shallowPrototype.getPhoneList()); //[]
        System.out.println(cloneShallowPrototype.getPhoneList()); //[133xxxx452]
    }
}
