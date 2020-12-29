package cn.liangyy.builder.easy;

/**
 * 建造者模式-测试
 */
public class TestSimpleBuilder {
    public static void main(String[] args) {
        SimpleBuilder simpleBuilder = new SimpleBuilder(new HomeWork());
        simpleBuilder.buildEasyQc("简单题目");
        simpleBuilder.buildNormalQc("标准难度题目");
        simpleBuilder.buildMediumQc("中等难度题目");
        simpleBuilder.buildHardQc("高难度题目");
        HomeWork homeWork = simpleBuilder.build();

        StringBuilder sb = new StringBuilder();
        sb.append(null == homeWork ? "" : homeWork.getEasyQc()+",");
        sb.append(null == homeWork ? "" : homeWork.getNormalQc()+",");
        sb.append(null == homeWork ? "" : homeWork.getMediumQc()+",");
        sb.append(null == homeWork ? "" : homeWork.getHardQc()+"!");

        System.out.println(sb.toString());
    }
}
