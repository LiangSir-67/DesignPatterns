package cn.liangyy.interpreter;

/**
 * 终结表达式-数值表达式
 */
public class NumberExpression implements IExpression {
    //终结表达式的值
    private int value;

    public NumberExpression(String value) {
        this.value = Integer.valueOf(value);
    }

    /**
     * 用来解释表达式的方法
     * @return
     */
    @Override
    public int interpret() {
        //解释非终结表达式
        return this.value;
    }
}
