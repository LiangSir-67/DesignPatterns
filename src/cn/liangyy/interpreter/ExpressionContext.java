package cn.liangyy.interpreter;

import java.util.Stack;

/**
 * 上下文信息类
 */
public class ExpressionContext {
    //定义一个栈，计算一般都用栈，利用其先进后出的特性
    private Stack<IExpression> stack = new Stack<>();

    public ExpressionContext(String expression) {
        this.parse(expression);
    }

    private void parse(String expression){
        //为了简单，直接以空格来切割，所以测试的时候每个数字和符号之间都要有空格
        String[] elementArr = expression.split(" ");
        for (int i = 0;i < elementArr.length;i++){
            String element= elementArr[i];
            if (element.equals("+")){   //加法
                //站内元素出栈
                IExpression leftExpression = stack.pop();
                //取出+号后的下一个元素
                IExpression rightExpression = new NumberExpression(elementArr[++i]);
                //计算
                IExpression addExpression = new AddExpression(leftExpression,rightExpression);
                //将计算结果压入栈
                stack.push(new NumberExpression(addExpression.interpret()+""));
            }else if (element.equals("-")){     //减法
                //栈内元素出栈
                IExpression leftExpression = stack.pop();
                //取出-号后的下一个元素
                IExpression rightExpression = new NumberExpression(elementArr[++i]);
                //计算
                IExpression subExpression = new SubExpression(leftExpression,rightExpression);
                //将计算结果压入栈
                stack.push(new NumberExpression(subExpression.interpret()+""));
            }else{
                //如果是数字则直接入栈
                stack.push(new NumberExpression(element));
            }
        }
    }

    /**
     * 运算结果
     * @return
     */
    public int calcuate(){
        //经过前面解析，到这里stack内只会剩下唯一一个数字，即运算结果
        return stack.pop().interpret();
    }
}
