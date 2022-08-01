package com.tyagi.Comparators;

public class Main {

    public static void main(String[] args) {

        //Comparators just make it clear to java what it is that we want to compare.
        // Comparable is an interface that is why implements is used.

        // Generally required when you use your own created class having many parameter.

        Students tyagi = new Students(22,98.2f);
        Students tyagi2 = new Students(106,94.2f);

        if(tyagi.marks>tyagi2.marks){
            System.out.println("tyagi2");   // wrong code as not always achievable.
      }

        if(tyagi.compareTo(tyagi2)>0){   // returns 0,neg or pos value based on which is greater.
            System.out.println("tyagi2");
        }
    }
}
