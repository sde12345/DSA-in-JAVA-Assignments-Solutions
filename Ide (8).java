/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
//Program for converting rupees to dollar
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     Scanner scn = new Scanner(System.in);
	     long  rupees = scn.nextLong();

		float dollars = rupees / 64;
		System.out.println(dollars);
	}
}
