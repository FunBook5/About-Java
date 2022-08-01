package com.tyagi.Exceptions;

public class ExceptionHandling {
    public static void main(String[] args) {

        // Exceptions are something that stop the flow of the program.These can be recovered from.
        //Eg:- divide by zero.

        // Errors are lack of resources and problems that can't be handled by code.
        //Eg:- memory full.

        // In Java throwable class handles all exceptions.

        // Exceptions are of two types: checked(given by ide at compile time) and unchecked(happen at runtime).

        try{
            int a = 5;   // All your normal code goes inside try block.
            int b = 0;

            int c = a/b;

            System.out.println(c);
        }
        catch (Exception exp){   // If any error is encountered it can be caught and passed as obj argument.
            System.out.println(exp.getMessage());
            System.out.println(exp.getClass());
        }

        finally {
            System.out.println("Always Executes finally block");
            int d = divide(14,23);
            int c = divide(12,0);
        }


        // Above code is by the system, but what if you want to explicitly throw an exception not listed.

        // There can only be one finally block but multiple catch blocks, also finally is optional but catch is mandatory.

    }

    static int divide(int a,int b) throws RuntimeException{ //Used to tell the computer if you are using this method, it may throw an exception.
       if(b == 0){
           throw new RuntimeException("Do not divide by Zero");
       }
       return a/b;
    }
}


// See Shallow and deep copy also once.
 //Shallow - just references original obj. -- ob1 = ob2;
// Deep - creates a completely different copy. -- ob1 = ..ob2;