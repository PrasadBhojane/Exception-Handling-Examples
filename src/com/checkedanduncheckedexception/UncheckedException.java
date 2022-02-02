package com.checkedanduncheckedexception;

import java.io.*;

public class UncheckedException
{
	public static void main(String[]args) throws FileNotFoundException
	{
		PrintWriter pw = new PrintWriter("abc.text");
		pw.println("Hello");
		System.out.println(10/0); //Unchecked exception
	}
}
//there are some exception which are not checked by compiler, these exception are called as Unchecked Exception. 