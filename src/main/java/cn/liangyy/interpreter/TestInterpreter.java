package cn.liangyy.interpreter;

/**
 * 解释器模式-测试
 */
public class TestInterpreter {
    public static void main(String[] args) {
        //注意每个符号之间要包含空格
        ExpressionContext context = new ExpressionContext("123 + 345 + 678 - 234");
        System.out.println(context.calcuate());

        context = new ExpressionContext("123 - 345 + 890");
        System.out.println(context.calcuate());
    }
}
