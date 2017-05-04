package com.lzh.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.quartz.MethodInvokingJobDetailFactoryBean;

import com.lzh.beans.Auditorium;
import com.lzh.beans.Instrumentlist;
import com.lzh.beans.OneManBand;
import com.lzh.beans.Pinao;
import com.lzh.beans.Simulate;
import com.lzh.beans.Stage;
import com.lzh.inter.MindReader;
import com.lzh.inter.Performer;
import com.lzh.inter.Thinker;

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
		//使用了aop之后，只能使用相应的接口来转化
//		Performer performer=(Performer) context.getBean("simulate");
//		performer.perform();
		//为通知传入参数
//		Thinker volunteer=(Thinker) context.getBean("volunteer");
//		volunteer.thinkOfSomething("what are you doing");
//		MindReader reader=(MindReader) context.getBean("magician");
//		System.out.println(reader.getThought());
		
	}
}
