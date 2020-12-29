package cn.liangyy.interpreter;

/**
 * 顶层的表达式接口
 */
public interface IExpression {
    /**
     * 用来解释表达式的方法
     * @return
     */
    int interpret();
}
