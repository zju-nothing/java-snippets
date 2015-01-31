package com.nothing.classloader.demos;

/**
 * @author chenliu, create at 1/31/15 18:43
 * Use ClassLoader to initialize the instance.
 */
public class UseClassLoader {
    public void sayHello(){
        System.out.println("Hello there!");
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class clazz = ClassLoader.getSystemClassLoader().loadClass("com.nothing.classloader.demos.UseClassLoader");
        UseClassLoader useClassLoader = (UseClassLoader) clazz.newInstance();
        useClassLoader.sayHello();
    }
}
