package com.defaultExceptionHandling;

public class Test //Abnormal termination
{
	public static void main(String[]args)
	{
		doStuff();
	}
	public static void doStuff()
	{
		doMoreStuff();
	}
	public static void doMoreStuff()
	{
		System.out.println(10/0);//Abnormal termination - Arithmetic exception
	}
}
//working of Default exception handler - Arithmetic Exception occurs
//If the caller method doesnt contain handling then JVM terminate that caller method abnormally and removes corresponding from the stack.-
//-this process will be continue until main method
//durga vid no. 69