package com.sinarios;

import java.util.Scanner;

public class MoneyBank 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		String cmd="yes";
		
		while(cmd.equalsIgnoreCase("yes"))
		{
			System.out.println("enter the amount");
			int amount=sc.nextInt();
			System.out.println("collect the amount "+amount);
			System.out.println("do you want to continue");
			cmd=sc.next();
		}
	}
}
