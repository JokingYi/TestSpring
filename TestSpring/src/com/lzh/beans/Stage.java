package com.lzh.beans;

public class Stage
{
	//��ʹû����ʽʹ�ã�Ҳ�����
	private Stage()
	{
		System.out.println("test");
		
	}
	//��˵���ӳټ��ػ���
	private static class StageSingletonHolder
	{
		static Stage instance=new Stage();
	}
	public static Stage getInstance()
	{
		return StageSingletonHolder.instance;
	}
}
