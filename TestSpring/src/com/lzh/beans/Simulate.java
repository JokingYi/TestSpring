package com.lzh.beans;

import com.lzh.inter.Performer;

//测试动态装配属性
public class Simulate implements Performer
{
	private String song;
	
	public Simulate()
	{
		System.out.println("测试在使用aop代理时，是否会使用目标类的构造函数");
	}
	
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
