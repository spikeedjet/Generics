package com.luhuibin.genericfuction;
import java.util.Arrays;

public class GenericMethod{

    public static <T> void swap(T[] arr, int i, int j){
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4};
        swap(intArray, 0, 3);
        System.out.println(Arrays.toString(intArray));

        String[] stringArray = {"hello","world"};
        swap(stringArray, 0, 1);
        System.out.println(Arrays.toString(stringArray));
    }
}