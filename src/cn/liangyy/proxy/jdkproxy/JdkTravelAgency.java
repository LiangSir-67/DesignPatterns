package cn.liangyy.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理类
 */
public class JdkTravelAgency implements InvocationHandler {
    //被代理对象，即示例中的 JdkTravelPerson
    private Object target;

    //动态获取代理对象
    public Object getInstance(Object target){
        //target就是被代理对象
        this.target = target;
        Class<?> clazz = target.getClass();
        //创建并返回代理对象
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target,args);
        after();
        return obj;
    }

    private void before(){
        System.out.println("付定金");
    }

    private void after(){
        System.out.println("付尾款");
    }
}
