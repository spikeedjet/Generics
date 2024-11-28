package com.luhuibin.genericclass;

class GenericClass<T> {
    private T data;
    // 构造函数,接受一个 T 类型的参数
    public GenericClass(T data) {
        this.data = data;
        }
        // 获取数据的方法
        public T getData() {
        return data;
        }
        // 设置数据的方法
        public void setData(T data) {
        this.data = data;
        }
        public static void main(String[] args) {
            GenericClass<String> stringClass =   new GenericClass<>("Hello");
            GenericClass<Integer> integerClass =  new GenericClass<>(123);
            System.out.println(stringClass.getData());
            System.out.println(integerClass.getData());
        }
    }
