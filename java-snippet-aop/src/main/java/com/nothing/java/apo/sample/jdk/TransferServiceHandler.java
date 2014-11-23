package com.nothing.java.apo.sample.jdk;

import com.nothing.java.apo.service.TransferService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author chenliu, create at 11/23/14 22:28
 */
public class TransferServiceHandler implements InvocationHandler {
    //The target instance to be delegated.
    private TransferService transferService;

    public TransferServiceHandler(TransferService transferService) {
        this.transferService = transferService;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Long startTime = System.currentTimeMillis();
        //To be applied to different method more generally, use Object as the method invoke return type.
//        String translatedText = (String) method.invoke(transferService,args);
        Object translatedText = method.invoke(transferService, args);
        Long endTime = System.currentTimeMillis();
        System.out.println("executing time: " + (endTime - startTime));
        return translatedText;
    }
}
