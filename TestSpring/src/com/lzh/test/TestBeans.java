package com.lzh.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lzh.inter.Performer;

public class TestBeans
{
	public static void main(String[] args) throws Exception
	{
		//���Կ��������ĸ�������
		ApplicationContext context=new ClassPathXmlApplicationContext("com/lzh/beans/beans.xml");
		Performer performer=(Performer) context.getBean("duke");
		performer.perform();
	}
}
