package com.luhuibin.genericinterface;

public class GenericInterfaceDemo {
    public static void main(String[] args) {
        StringImplementation si = new StringImplementation();

        si.add("hello");

        System.out.println(si.get(0));

        IntegerImplementation ii = new IntegerImplementation();
        ii.add(123);
        System.out.println(ii.get(0));
    }

}
