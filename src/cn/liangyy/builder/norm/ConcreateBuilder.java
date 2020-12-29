package cn.liangyy.builder.norm;

/**
 * 具体的建造者类
 */
public class ConcreateBuilder extends HomeWorkBuilder {
    private HomeWork homeWork;

    public ConcreateBuilder(HomeWork homeWork) {
        this.homeWork = homeWork;
    }

    @Override
    public HomeWorkBuilder builderEasyQc(String easyQc) {
        homeWork.setEasyQc(easyQc);
        return this;
    }

    @Override
    public HomeWorkBuilder builderNormQc(String normQc) {
        homeWork.setNormalQc(normQc);
        return this;
    }

    @Override
    public HomeWorkBuilder builderMediumQc(String mediumQc) {
        homeWork.setMediumQc(mediumQc);
        return this;
    }

    @Override
    public HomeWorkBuilder builderHardQc(String hardQc) {
        homeWork.setHardQc(hardQc);
        return this;
    }

    @Override
    public HomeWork build() {
        return null;
    }
}
