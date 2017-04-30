package com.lzh.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lzh.inter.Performer;

public class TestBeans
{
	public static void main(String[] args) throws Exception
	{
		//可以看看是在哪个包里面
		ApplicationContext context=new ClassPathXmlApplicationContext("com/lzh/beans/beans.xml");
		Performer performer=(Performer) context.getBean("duke");
		performer.perform();
	}
}
