package cn.liangyy.iterator;

/**
 * 行李类
 */
public class Baggage {
    //行李名称
    private String name;

    public Baggage(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
