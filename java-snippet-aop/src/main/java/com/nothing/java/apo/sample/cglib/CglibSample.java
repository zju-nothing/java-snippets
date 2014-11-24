package com.nothing.java.apo.sample.cglib;

import com.nothing.java.apo.service.impl.TransferServiceImpl;

/**
 * @author chenliu, create at 11/22/14 20:43
 */
public class CglibSample {
    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
        //Here the target class is no longer the TransferService interface, but  the TransferServiceImpl instead.
        TransferServiceImpl proxy = (TransferServiceImpl) cglibProxy.getProxy(TransferServiceImpl.class);
        String result = proxy.transfer("Are you kidding me.");
        System.out.println(result);
    }
}
