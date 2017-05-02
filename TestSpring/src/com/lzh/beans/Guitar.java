package com.lzh.beans;

import com.lzh.inter.Instrument;

public class Guitar implements Instrument
{

	@Override
	public void play()
	{
		System.out.println("guitar");
	}

}
