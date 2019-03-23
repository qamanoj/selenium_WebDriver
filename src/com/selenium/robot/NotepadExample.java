package com.selenium.robot;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class NotepadExample 
{
	public static void main(String[] args) throws IOException, AWTException, InterruptedException, HeadlessException, UnsupportedFlavorException
	{
		//open notepad
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		//click new in file menu
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F);
		
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_F);
		
		Thread.sleep(5000);
		//click on enter button
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		//enter some text/data
		StringSelection s=new StringSelection("my name is manoj kumar sahoo");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		String data=(String)Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		System.out.println(data);
		Thread.sleep(5000);
		
		//System.out.println(data);
		
		//paste into notepad
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(2000);
		//click save in file menu
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F);
		
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_F);
		
		Thread.sleep(2000);
		//enter file path and save
		StringSelection s1=new StringSelection("Documen");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);
		
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		//click on enter button
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		//close notepad
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F4);

		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_F4);
	}
}
