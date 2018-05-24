package com.rqhua.javademo.samples;

public class Main {
    public static void main(String[] args) {

        System.out.println("byte " + Byte.BYTES);
        System.out.println("short " + Short.BYTES);
        System.out.println("char " + Character.BYTES);
        System.out.println("int " + Integer.BYTES);
        System.out.println("float " + Float.BYTES);
        System.out.println("double " + Double.BYTES);
        System.out.println("long " + Long.BYTES);


        printLength("学Java");
        printLength("学");
        printLength("華");
        printLength("J");
        printLength("Java");

    }
    private static void printLength(String string) {
        System.out.println(string + " 所占内存 " + string.getBytes().length + " byte");
    }
}