package com.nothing.ltw.transformer;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;

/**
 * @author chenliu, create at 12/7/14 11:37
 */
public class MyTransformer implements ClassFileTransformer{
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
        System.out.println("Hello " + className + "!");
        return null;
    }
}
