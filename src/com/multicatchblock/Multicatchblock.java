package com.multicatchblock;

public class Multicatchblock 
{
	public static void main (String[]args)
	{
		try
		{
			System.out.println(10/0);
			String s = null;
			System.out.println(s.length());
		}
		catch (ArithmeticException | NullPointerException e) //Multi catch Block
		{
			System.out.println(e.getLocalizedMessage());
			e.printStackTrace();
		}
	}
}
/**
* Multi-Catch block
* Output will be : java.lang.ArithmeticException: / by zero
* Durga vid no. 77
*/