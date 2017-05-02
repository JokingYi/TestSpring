package com.lzh.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lzh.beans.Auditorium;
import com.lzh.beans.Instrumentlist;
import com.lzh.beans.OneManBand;
import com.lzh.beans.Pinao;
import com.lzh.beans.Simulate;
import com.lzh.beans.Stage;
import com.lzh.inter.Performer;

public class TestBeans
{
	public static void main(String[] args) throws Exception
	{
		
		//可以看看是在哪个包里面
		ApplicationContext context=new ClassPathXmlApplicationContext("com/lzh/beans/beans.xml");
//		ApplicationContext context=new ClassPathXmlApplicationContext("com/lzh/beans/beans2.xml");
//		ApplicationContext context=new AnnotationConfigApplicationContext("com.lzh.beans");
//		Pinao pinao=(Pinao) context.getBean("getPinao");
//		pinao.play();
//		Pinao pinao=(Pinao) context.getBean("pinao");
//		pinao.play();
//		Stage stage=(Stage) context.getBean("stage");
//		Auditorium auditorium=(Auditorium) context.getBean("auditorium");
//		Instrumentlist instrumentlist=(Instrumentlist) context.getBean("instrumentlist");
//		instrumentlist.perform();
//		OneManBand oneManBand=(OneManBand) context.getBean("oneManBand");
//		oneManBand.perform();
//		Performer performer=(Performer) context.getBean("simulate");
//		performer.perform();
	}
}
