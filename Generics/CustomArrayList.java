package com.tyagi.generics;

import java.util.ArrayList;

import java.util.Arrays;

public class CustomArrayList {

    // ArrayList is the dynamic implementation of array data structure.
    // On an average doubling of arraylist takes constant time called amortised time.

    // we have implemented custom arraylist at last as an int[] but internal arraylist allows all values.
    // This is possible using JAVA GENERICS.







static public void main(String[] args){
    ArrayList a1 = new ArrayList();

    // Methods of ArrayList
    a1.add(45);
    System.out.println(a1);
    a1.add(35);
    System.out.println(a1);
    a1.add(20);
    a1.get(1);
    a1.remove(0);
    System.out.println(a1);
    a1.remove(0);
    System.out.println(a1);







}

    //Custom ArrayList implementation

private int[] customArray;
private static int DEFAULT_SIZE = 2;   // default size at start.
private int size = 0; // size to compare and double later.

public CustomArrayList(){      // Constructor
    this.customArray = new int[DEFAULT_SIZE];
}

public void add(int value){

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
    int[] temp = new int[customArray.length*2];

    for(int i=0;i<customArray.length;i++){
        temp[i] = customArray[i];
    }

    customArray = temp;
}

public void remove(int index){

    int temp = customArray[index];

    for(int i=index;i<customArray.length-1;i++){
        customArray[i] = customArray[i+1];
    }
    size--;
    customArray[customArray.length-1] = 0;


    System.out.println("The removed number is "+ temp);
}

}





