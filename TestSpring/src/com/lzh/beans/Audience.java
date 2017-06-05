package com.lzh.beans;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience
{
	public void takeSeats()
	{
		System.out.println("the audiences are taking their seats");
	}
	public void applaud()
	{
		System.out.println("clap clap clap clap");
	}
	public void demandFund()
	{
		System.out.println("Boo, We want our money back");
	}
	
	public void watchPerformance(ProceedingJoinPoint point)
	{
		System.out.println("before");
		try
		{
			point.proceed();
			System.out.println("clap clap clap");
		} catch (Throwable e)
		{
			e.printStackTrace();
			System.out.println("demand Fund");
		}
		
	}
}
