package cn.liangyy.prototype.deep;

import java.util.ArrayList;
import java.util.List;

public class TestDeepPrototype2 {
    public static void main(String[] args) {
        DeepPrototype deepPrototype = new DeepPrototype();
        deepPrototype.setAge(20);
        deepPrototype.setName("亚索");
        List<String> phoneList = new ArrayList<>();
        phoneList.add("132xxxx4562");
        deepPrototype.setPhoneList(phoneList);

        DeepPrototype cloneDeepPrototype = (DeepPrototype) deepPrototype.clone();
        System.out.println("克隆前："+deepPrototype.getPhoneList());
        System.out.println("克隆后："+cloneDeepPrototype.getPhoneList());
        System.out.println(deepPrototype.getPhoneList() == cloneDeepPrototype.getPhoneList());

        //修改原对象中的属性phoneList
        List<String> list = deepPrototype.getPhoneList();
        list.add("188xxxx7896");
        System.out.println("克隆前："+deepPrototype.getPhoneList());
        System.out.println("克隆后："+cloneDeepPrototype.getPhoneList());
    }
}
