package com.lzh.beans;

import com.lzh.inter.Performer;

public class Juggler implements Performer
{
	private int beanBags;
	
	public Juggler(int beanBags)
	{
		this.beanBags = beanBags;
	}
	
	public Juggler()
	{
		beanBags=3;
	}
	
	@Override
	public void perform() throws Exception
	{
		System.out.println("juggling "+beanBags+" beanbags");
	}
	
}
