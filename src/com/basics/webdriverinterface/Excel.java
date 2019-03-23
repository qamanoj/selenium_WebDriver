 package com.basics.webdriverinterface;

public class Excel implements MsOffice
{

	@Override
	public void open() {
		System.out.println("this is open of Excel class");
		
	}

	@Override
	public void read() {
		System.out.println("this is read of Excel class");
		
	}

	@Override
	public void close() {
		System.out.println("this is close of Excel class");
		
	}
	
}
