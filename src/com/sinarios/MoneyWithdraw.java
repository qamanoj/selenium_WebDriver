package com.sinarios;

import java.util.Scanner;

public class MoneyWithdraw 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the valid pincode number");
		int pincode= 12345;
		int a=0;
		int number=sc.nextInt();
		while(a<=2)
		{
			if(pincode==number)
			{
				System.out.println("WELLCOME");
				return;
			}
			else
			{
				if(a<2)
				{
					System.out.println("invalid pincode.. Try again");
					number=sc.nextInt();
					a++;
				}
				else
				{
					System.out.println("your card is blocked");
					return;
				}
			}	
		}
	}
}
