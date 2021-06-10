package cn.liangyy.interpreter;

/**
 * 非终结表达式-抽象表达式
 */
public abstract class AbstractNonTerminalExpression implements IExpression {
    //非终结表达式左边表达式，一般为数字
    protected IExpression leftExpression;
    //非终结表达式右边表达式，一般为数字
    protected IExpression rightExpression;

    public AbstractNonTerminalExpression(IExpression leftExpression, IExpression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }
}
