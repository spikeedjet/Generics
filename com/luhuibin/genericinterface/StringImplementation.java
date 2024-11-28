package com.luhuibin.genericinterface;

import java.util.ArrayList;

public class StringImplementation implements Genericinterface<String> {
    
    private final ArrayList<String> list = new ArrayList<>();

    @Override
    public void add(String item){
        list.add(item);
    }

    @Override
    public String get(int index){
        if (index >= 0 && index < list.size()){
            return list.get(index);
        }
        return null;
    }
}
