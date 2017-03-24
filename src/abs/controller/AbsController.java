package abs.controller;

import abs.model.*;

public class AbsController
{
	private Bombay bombay;
	public AbsController()
	{
		bombay = new Bombay();
	}
	
	public void start()
	{
		if(bombay instanceof Cat)
		{
			System.out.println("Yes, Bombay is a breed of cat.");
		}
		else
		{
			System.out.println("No, Bombay is not a breed of cat.");
		}
	}

}
