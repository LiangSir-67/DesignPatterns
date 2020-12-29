package cn.liangyy.builder.norm;

/**
 * 抽象的建造者类
 */
public abstract class HomeWorkBuilder {
    public abstract HomeWorkBuilder builderEasyQc(String easyQc);

    public abstract HomeWorkBuilder builderNormQc(String normQc);

    public abstract HomeWorkBuilder builderMediumQc(String mediumQc);

    public abstract HomeWorkBuilder builderHardQc(String hardQc);

    public abstract HomeWork build();
}
