package com.lzh.beans;

public class Stage
{
	//即使没有显式使用，也会调用
	private Stage()
	{
		System.out.println("test");
		
	}
	//听说是延迟加载机制
	private static class StageSingletonHolder
	{
		static Stage instance=new Stage();
	}
	public static Stage getInstance()
	{
		return StageSingletonHolder.instance;
	}
}
