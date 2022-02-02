package com.cusotmizedExceptionHandlingByTryCatch;

public class WithTryCatch 
{
	public static void main (String[]args)
	{
		System.out.println("Statement 1");
		try
		{
			System.out.println(10/0); //Risky Code
		}
		catch(ArithmeticException e) //Handling arithmetic exception with try catch
		{
			System.out.println(10/2);//Handling code
		}
		System.out.println("Statement 3");
	}
}
//Normal termination of the program due to Try-Catch.
//durga vid no.71