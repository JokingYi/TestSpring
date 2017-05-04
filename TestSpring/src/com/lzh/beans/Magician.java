package com.lzh.beans;

import com.lzh.inter.MindReader;

public class Magician implements MindReader
{
	private String thoughts;
	@Override
	public void interceptThoughts(String thought)
	{
		System.out.println("intercepting thoughts");
		this.thoughts=thought;
	}

	@Override
	public String getThought()
	{
		return thoughts;
	}
	
}
