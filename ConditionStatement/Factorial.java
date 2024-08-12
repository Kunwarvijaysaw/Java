package ConditionStatement;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int n,i,f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		n = sc.nextInt();
		f=1;
    	i=1;
		while(i<=n) {
			f=f*i;
			i++;
		}
		System.out.println("factorial="+f);
			

	}

}
