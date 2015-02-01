package com.nothing.classloader.impl;

import com.nothing.classloader.demos.UseClassLoader;

/**
 * @author chenliu, create at 2/1/15 17:18
 */
public class SimpleClassLoaderTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        SimpleClassLoader simpleClassLoader = new SimpleClassLoader("/Users/chenliu/Code/myGit/java-snippets/java-snippet-classloader/target/classes");
        Class clazz = simpleClassLoader.loadClass("com.nothing.classloader.demos.UseClassLoader");
        UseClassLoader useClassLoader = (UseClassLoader) clazz.newInstance();
        useClassLoader.sayHello();
    }
}
