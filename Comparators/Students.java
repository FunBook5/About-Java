package com.tyagi.Comparators;

//public class Students {
//
//    int age;
//    float marks;
//
//    public Students(int age, float marks) {
//        this.age = age;
//        this.marks = marks;
//    }
//}

public class Students implements Comparable<Students> {  // -- inside <> the class to be compared is provided.

    int age;
    float marks;

    // As Comparable is an interface it has an abstract method compareTo() and we have to implement it.


    @Override
    public int compareTo(Students o) {

      //  int diff = (int)(this.marks - o.marks); return diff;  -- this can also be used

        float diff = (this.marks - o.marks);

        return (int) diff;
    }

    public Students(int age, float marks) {
        this.age = age;
        this.marks = marks;
    }
}

