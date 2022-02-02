package com.cusotmizedExceptionHandlingByTryCatch;

public class Test //methods to print exception information
{
	public static void main(String[]args)
	{
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace(); //Name of Exception: Description - Stack trace
			System.out.println(e.toString()); //OR - System.out.println(e) //Name of Exception: Description 
			System.out.println(e.getMessage()); //Description
		}
	}
}
//'printStackTrace' method internally used by default exception handler to print exception information to the console.
//durga vid no. 71