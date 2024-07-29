package SimpleInterest;

import java.util.Scanner;

public class SimpleInterest 
	{
		public static void main (String args[])
		{
		float p,r,t,si;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter principle amount,rate and time");
		p = sc.nextFloat(); //Princple amount
		r = sc.nextFloat(); // rate
		t = sc.nextFloat(); //time
		si = p*r*t/100;//Formula of SI
		System.out.println("Simple Interest=" +si);
		}
		}