package cn.liangyy.prototype.shadow;

import java.util.List;

/**
 * 原型实例类
 */
public class ShallowPrototype implements IPrototype {
    private String name;
    private  int age;

    private List<String> phoneList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(List<String> phoneList) {
        this.phoneList = phoneList;
    }

    @Override
    public IPrototype clone() {
        ShallowPrototype shallowPrototype = new ShallowPrototype();
        shallowPrototype.setAge(this.age);
        shallowPrototype.setName(this.name);
        shallowPrototype.setPhoneList(this.phoneList);
        return shallowPrototype;
    }
}
