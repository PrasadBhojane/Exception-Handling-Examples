package com.throwandthrows;

public class Test // exception handling by throws keyword
{
	public static void main(String[]args) throws InterruptedException
	{ 
		doStuff();
	}

	public static void doStuff() throws InterruptedException
	{
		doMoreStuff();
	}

	public static void doMoreStuff() throws InterruptedException 
	{
		Thread.sleep(10000);
	}
}
//durga vid no. 74
//main purpose of throws keyword is to delegates responsibility of the exception handling to the JVM.