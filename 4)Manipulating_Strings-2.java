/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.io.*;


public class Main
{
  public static void main (String[]args)
  {

    // for(int i=0;i<26;i++){

    //     char ch = (char)('a'+ i);
    //     System.out.print(ch+" ");
    // }

    // String string1;

    //   string1 = "GeeksforGeeks";

    // String string2;
    // Scanner sc = new Scanner (System.in);

    //   string2 = sc.next();
    //   int count = 0;

    //System.out.println(string1);
    //System.out.println(string2);

    // String CSV = "Google, Apple, Microsoft"; 
    // String[] values = CSV.split("\\s*,\\s*");
    // System.out.println(values[0]);
    // System.out.println(Arrays.toString(values));
    
    
    String str= "26/06/2001";
    str = str.replaceAll("[^a-zA-Z0-9]", "");
    System.out.println(str);
    
    String str2 = new String[str.length()];
    
    // int a = 7;
    // int b = 4;
    
    // str2.charAt(a) = str.charAt(b); // This does not work as the result of a function cannot be another function, it should be a variable.
    

    System.out.println(str2);
	}
}