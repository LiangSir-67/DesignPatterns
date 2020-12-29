package cn.liangyy.interpreter;

/**
 * 非终结表达式-具体表达式-减法表达式
 */
public class SubExpression extends AbstractNonTerminalExpression {
    public SubExpression(IExpression leftExpression, IExpression rightExpression) {
        super(leftExpression, rightExpression);
    }

    /**
     * 用来解释表达式的方法
     * @return
     */
    @Override
    public int interpret() {
        //解释器，将左右两个终结符的值相减
        return this.leftExpression.interpret() - this.rightExpression.interpret();
    }
}
