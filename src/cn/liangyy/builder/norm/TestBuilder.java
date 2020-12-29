package cn.liangyy.builder.norm;

/**
 * 建造者模式-测试
 */
public class TestBuilder {
    public static void main(String[] args) {
        HomeWork homeWork = new HomeWork();
        HomeWorkBuilder homeWorkBuilder = new ConcreateBuilder(homeWork);
        homeWorkBuilder.builderEasyQc("我是一道简单题目")
                .builderNormQc("我是一道标准题目")
                .builderMediumQc("我是一道中等难度题目")
                .builderHardQc("我是一道困难题目");

        StringBuilder sb = new StringBuilder();
        sb.append(null == homeWork.getEasyQc() ? "" : homeWork.getEasyQc()+",");
        sb.append(null == homeWork.getNormalQc() ? "" : homeWork.getNormalQc()+",");
        sb.append(null == homeWork.getMediumQc() ? "" : homeWork.getMediumQc()+",");
        sb.append(null == homeWork.getHardQc() ? "" : homeWork.getHardQc()+"!");
        System.out.println("我的家庭作业有："+sb.toString());
    }
}
