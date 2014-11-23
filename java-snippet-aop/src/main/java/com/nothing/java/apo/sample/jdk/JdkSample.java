package com.nothing.java.apo.sample.jdk;

import com.nothing.java.apo.service.TransferService;
import com.nothing.java.apo.service.impl.TransferServiceImpl;

import java.lang.reflect.Proxy;

/**
 * @author chenliu, create at 11/22/14 20:42
 */
public class JdkSample {
    public static void main(String[] args) {
        //The instance to be delegated, named target
        TransferService target = new TransferServiceImpl();

        //The delegate instance, named proxy.
        TransferService proxy = (TransferService) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),
                new TransferServiceHandler(target));

        //Use the delegate instance to invoke the service.
        //1. invoke the method in the InvocationHandler
        //1.1  use reflection to invoke the method of the target.
        String translatedText = proxy.transfer("an insignificant java apo demo yet");
        System.out.println(translatedText);
        System.out.println();
        System.out.println("The Proxy Class Name => " + proxy.getClass().getName());
        System.out.println();
        System.out.println("The Proxy Instance Name => " + proxy);

    }
}
