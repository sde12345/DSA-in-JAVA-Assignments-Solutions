/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

// Program to find wheather a character is is uppercase or lowercase
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner scn = new Scanner(System.in);
	char ch = scn.next().trim().charAt(0);
	
	if ( ch >= 'a' && ch <= 'z'){
	    System.out.println("Lowercase");
	} else{
	    System.out.println("Uppercase");
	}

	}
}
