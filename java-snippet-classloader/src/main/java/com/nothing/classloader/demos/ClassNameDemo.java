package com.nothing.classloader.demos;

import java.util.ArrayList;

/**
 * @author chenliu, create at 1/31/15 18:29
 * The ClassName for Array is special,  composite with '[' + 'L' + 'ClassName'
 * or '[' + 'ClassNameAbrev'  for primitive types.
 */

public class ClassNameDemo{
    public static void main(String[] args) {
        System.out.println("ClassName ArrayList<String>     => " + new ArrayList<String>().getClass().getName());
        System.out.println("ClassName ArrayList<Integer>    =>"+new ArrayList<Integer>().getClass().getName());
        System.out.println("ClassName String    =>"+String.class.getName());

        System.out.println("ClassName String[]    =>"+String[].class.getName());
        System.out.println("ClassName Integer[]    =>"+Integer[].class.getName());

        System.out.println("ClassName int    =>"+int.class.getName());
        System.out.println("ClassName char    =>"+char.class.getName());

        System.out.println("ClassName int[]    =>"+int[].class.getName());
        System.out.println("ClassName char[]    =>"+char[].class.getName());
    }
}
