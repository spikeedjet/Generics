package com.luhuibin.genericinterface;

import java.util.ArrayList;

public class IntegerImplementation implements Genericinterface<Integer>{

    private  ArrayList<Integer> list = new ArrayList<>() ;
    @Override
    public void add(Integer item){
        list.add(item);
    }   

    @Override
    public Integer get( int index){
        if (index >= 0 && index < list.size()){
            return list.get(index);
        }
        return null;
    }
}
