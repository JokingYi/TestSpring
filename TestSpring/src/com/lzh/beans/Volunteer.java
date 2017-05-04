package com.lzh.beans;

import com.lzh.inter.Thinker;

public class Volunteer implements Thinker
{
	private String thought;
	@Override
	public void thinkOfSomething(String things)
	{
		thought=things;
	}
	public String getThought()
	{
		return thought;
	}
}
