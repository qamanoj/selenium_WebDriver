package com.basics.webdriverinterface;

public class User 
{
	public static void main(String[] args) 
	{
		MsOffice e=new Excel();
		e.open();
		Word w=new Word();
		w.close();
	}
}
