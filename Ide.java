/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

// Program for calculating simple interest
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
	Scanner scn = new Scanner(System.in);
    float p = scn.nextFloat();
	float r = scn.nextFloat();
	int t = scn.nextInt();
	float interest = (p * r * t)/100;
	
	System.out.println(interest);
	
	}
}
