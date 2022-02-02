package com.customizedException;

class TooYoungException extends RuntimeException // It is highly recommended to define customized exception as unchecked exception i.e. runtime exception.
{
	TooYoungException(String s)
	{
		super (s); //super keyword use for to make description available to default exception handler.
	}
}
class TooOldException extends RuntimeException
{
	TooOldException (String s)
	{
		super (s); //super keyword use for to make description available to default exception handler.
	}
}
class CustException 
{
	public static void main(String[]args)
	{
		int age = Integer.parseInt(args[0]);
		if (age>60)
		{
			throw new TooYoungException("Please wait some more time.. You will get best match soon"); // description
		}
		else if ( age<18)
		{
			throw new TooOldException("Your age is already crossed marriage age.. no chance of getting marriage"); // description
		}
		else
		{
			System.out.println("You will get match detail soon by email.."); // description
		}
	}
}
//* 'throw' keyword is best suitable for user defined or customized exception but not for predefined exception.
//code ran successfully.
//durga vid no. 75
