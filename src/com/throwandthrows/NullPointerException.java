package com.throwandthrows;

public class NullPointerException 
{
	static ArithmeticException e;
	public static void main(String[]args)
	{
		throw e; // if 'e' refers to null then we will get null pointer exception(NPE).
	}
}
// durga vid no. 73
