package com.defaultExceptionHandling;

public class Test2 // normal and abnormal termination
{
	public static void main (String[]args)
	{
		doStuff();
		System.out.println(10/0); //abnormal termination 
	}
	public static void doStuff()
	{
		doMoreStuff();
		System.out.println("Hi"); //normal termination
	}
	public static void doMoreStuff()
    {
	System.out.println("Hello"); //normal termination
    }
}
//durga vid no. 69
//Even if one method terminates abnormally, then the total program termination become abnormal.