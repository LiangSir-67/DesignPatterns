package cn.liangyy.builder.easy;

/**
 * 建造者类
 * 用来创建对象
 */
public class SimpleBuilder {
    private HomeWork homeWork;

    public SimpleBuilder(HomeWork homeWork) {
        this.homeWork = homeWork;
    }

    public void buildEasyQc(String easyQc){
        homeWork.setEasyQc(easyQc);
    }

    public void buildNormalQc(String normalQc){
        homeWork.setNormalQc(normalQc);
    }

    public void buildMediumQc(String mediumQc){
        homeWork.setMediumQc(mediumQc);
    }

    public void buildHardQc(String hardQc){
        homeWork.setHardQc(hardQc);
    }

    public HomeWork build(){
        return homeWork;
    }
}
