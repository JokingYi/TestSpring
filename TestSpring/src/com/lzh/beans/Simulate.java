package com.lzh.beans;

import com.lzh.inter.Performer;

//���Զ�̬װ������
public class Simulate implements Performer
{
	private String song;
	
	public Simulate()
	{
		System.out.println("������ʹ��aop����ʱ���Ƿ��ʹ��Ŀ����Ĺ��캯��");
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
