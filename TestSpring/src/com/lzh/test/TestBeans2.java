package com.lzh.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lzh.annotation.bean.MyInstrumentlist;

public class TestBeans2
{
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/lzh/beans/beans2.xml");
		MyInstrumentlist instrumentlist= (MyInstrumentlist) context.getBean("myInstrumentlist");
		try
		{
			instrumentlist.perform();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
