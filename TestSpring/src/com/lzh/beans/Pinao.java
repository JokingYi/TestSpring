package com.lzh.beans;

import com.lzh.inter.Instrument;

public class Pinao implements Instrument
{
	private String field;
	
	public Pinao()
	{
		field="";
//		System.out.println("test constructor");
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
		System.out.println("pinao");
	}

}
