package com.lzh.beans;

import com.lzh.inter.Contestant;

public class AboutIntroduction implements Contestant
{

	@Override
	public void receiveAward()
	{
		System.out.println("shot me with money");
	}

}
