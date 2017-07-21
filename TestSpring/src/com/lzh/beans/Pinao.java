package com.lzh.beans;

import com.lzh.inter.Instrument;

public class Pinao implements Instrument
{
	private String field;
	private static int id=0;
	public Pinao()
	{
		field="";
		id++;
		System.out.println("test when was the constructor invoked");
	}
	
	public String getField()
	{
		return field;
	}
	public void setField(String field)
	{
		this.field = field;
	}
	@Override
	public void play()
	{
		System.out.println("pinao#"+id);
	}

}
