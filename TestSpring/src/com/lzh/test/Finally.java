package com.lzh.test;

public class Finally
{
	public static int testFinally()
	{
		int x=1;
		try
		{
			return x;
		} catch (Exception e)
		{
			e.printStackTrace();
		}finally 
		{
			return ++x;
		}
		
	}
	
	public static void main(String[] args)
	{
		//finally 中的语句比return语句后执行
		System.out.println(Finally.testFinally());
	}

}
