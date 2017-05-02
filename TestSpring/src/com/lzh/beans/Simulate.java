package com.lzh.beans;

import com.lzh.inter.Performer;

//≤‚ ‘∂ØÃ¨◊∞≈‰ Ù–‘
public class Simulate implements Performer
{
	private String song;
	
	@Override
	public void perform() throws Exception
	{
		System.out.println("singing "+song);
	}

	public String getSong()
	{
		return song;
	}

	public void setSong(String song)
	{
		this.song = song;
	}
	
	
}
