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

    String string1;

      string1 = "GeeksforGeeks";

    String string2;
    Scanner sc = new Scanner (System.in);

      string2 = sc.next();

    //System.out.println(string1);
    //System.out.println(string2);

    int j = string2.length();
    for (int i = 0; i<(string1.length()-(string2.length())); i++)
      {

          	if ((string1.subSequence(i, j).equals(string2)))
	        {
	            System.out.println("Yes from " + i + " to " + j);
	         }
	         j++;

	    }

	}
}
