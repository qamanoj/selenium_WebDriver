package com.selenium.robot;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Calculator2
{
	public static void main(String[] args) throws Throwable
	{
		//open calculator
		Runtime.getRuntime().exec("calc.exe");
		Thread.sleep(5000);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first data");
		int ss=sc.nextInt();
		String str=String.valueOf(ss);
		//put data in a clipboard
		StringSelection s=new StringSelection(str);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		String data=(String)Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		Thread.sleep(5000);
		System.out.println("First data---->"+data);
		//paste into calculator screen by using Robot class
		Robot r=new Robot();

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);


		Thread.sleep(5000);
		//click on + buttom
		r.keyPress(KeyEvent.VK_ADD);
		r.keyRelease(KeyEvent.VK_ADD);
		System.out.println("enter second data");
		int ss1=sc.nextInt();
		String str1=String.valueOf(ss1);
		//put data in a clipboard
		StringSelection s1=new StringSelection(str1);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);
		String data1=(String)Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		Thread.sleep(5000);
		System.out.println("Second data---->"+data1);
		//paste data into screen of second value
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

		Thread.sleep(5000);
		//click on the = buttom
		r.keyPress(KeyEvent.VK_EQUALS);
		r.keyRelease(KeyEvent.VK_EQUALS);

		Thread.sleep(5000);
		//right click on the context menu 
		r.keyPress(KeyEvent.VK_CONTEXT_MENU);
		r.keyRelease(KeyEvent.VK_CONTEXT_MENU);

		Thread.sleep(5000);
		//click down buttom
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		//click enter buttom
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(5000);
		//display result in console
		String result=(String)Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		System.out.println("Total data---->"+result);
		//close calculator
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F4);

		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_F4);
		//compair two data
		if(result.equals(result))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}
}
