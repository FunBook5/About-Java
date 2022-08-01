package com.tyagi.generics;

import java.util.Arrays;

public class CustomArrayListGen<T> {

    // GENERICS

    // is exactly like templates in C++.
    // Does not work for primitives, instead use wrapper classes.

    //We put T instead of integer everywhere.

    //Custom ArrayList implementation using generics.

    private Object[] customArray;
    private static int DEFAULT_SIZE = 2;   // default size at start.
    private int size = 0; // size to compare and double later.

//    public CustomArrayListGen(){      // Constructor
//        this.customArray = new T[DEFAULT_SIZE]; --- This gives error as Template cannot run in runtime.
//    }

    //workaround is to use Object class.

    public CustomArrayListGen(){      // Constructor
        this.customArray = new Object[DEFAULT_SIZE];  //super parent class used.
    }

    public void add(T value){

        if(isFull()){
            resize();
        }

        int n = size;
        customArray[n] = value;
        size++;

    }


    public void print(){
        System.out.println(Arrays.toString(customArray));
    }

    public boolean isFull(){
        if(size == customArray.length){  //one-liner -- return(size == customArray.length);
            return true;
        }
        return false;
    }

    public void resize(){
        Object[] temp = new Object[customArray.length*2];

        for(int i=0;i<customArray.length;i++){
            temp[i] = customArray[i];
        }

        customArray = temp;
    }

    public void remove(int index){

        Object temp = customArray[index]; // -- T temp = (T)customArray[index]; will also work.


        for(int i=index;i<customArray.length-1;i++){
            customArray[i] = customArray[i+1];
        }
        size--;
        customArray[customArray.length-1] = 0;


        System.out.println("The removed number is "+ temp);
    }












    // JAVA WILDCARDS
    // Used to restrict the types that can be allocated to a generic class.

    //Example
    // public class CustomArrayListGen<T extends Number> { -- now only number or its subclass can be added.

    // method implementation -- public void getList(List<Number> list1){






}
