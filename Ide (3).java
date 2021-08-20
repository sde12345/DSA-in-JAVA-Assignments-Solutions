/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

// Factorial program 
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  int i = 1, fact = 1;
	  Scanner scn = new Scanner(System.in);
	  int n = scn.nextInt();
	  
	  for( i = 1; i <= n ; i ++){
	     fact = fact * i;
	  }
	  
	  System.out.println(fact);
	 
	 
	
	
	}
}
