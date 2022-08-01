package com.tyagi.generics;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

       CustomArrayList arrayList1 = new CustomArrayList();

       arrayList1.add(35);
        arrayList1.add(5);
        arrayList1.add(3);
        arrayList1.add(67);
       arrayList1.print();
       arrayList1.remove(0);
       arrayList1.remove(1);
       arrayList1.print();
       arrayList1.isFull();
    }
}