package com.basics.webdriverinterface;

public class Word implements MsOffice
{
	@Override
	public void open() {
		System.out.println("this is open of Word class");
		
	}

	@Override
	public void read() {
		System.out.println("this is read of Word class");
		
	}

	@Override
	public void close() {
		System.out.println("this is close of Word class");
		
	}

}
