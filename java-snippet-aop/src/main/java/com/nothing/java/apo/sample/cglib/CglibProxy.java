package com.nothing.java.apo.sample.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author chenliu, create at 11/24/14 13:03
 */
public class CglibProxy implements MethodInterceptor{
    //The proxy instance in cglib
    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class clazz){
        //cglib use sub-class to delegate the target instance.
        enhancer.setSuperclass(clazz);
        //get the callback, which means which instance to call when the target method was invoked.
        //always call the instance which impl the cglib.proxy.MethodInterceptor interface.
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        Long startTime = System.currentTimeMillis();
        // call the target method.
        Object result = methodProxy.invokeSuper(obj,args);
        Long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
        return result;
    }
}
