package com.lzh.beans;

public class Tissue
{
	private int size;
	private String type;
	
	public void setType(String type)
	{
		this.type = type;
	}
	@Override
	public String toString()
	{
		return "tissue info: "+type+"-"+size;
	}
}
