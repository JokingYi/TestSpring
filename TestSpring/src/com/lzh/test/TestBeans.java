package com.lzh.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.quartz.MethodInvokingJobDetailFactoryBean;

import com.lzh.beans.Auditorium;
import com.lzh.beans.DryHands;
import com.lzh.beans.Instrumentlist;
import com.lzh.beans.OneManBand;
import com.lzh.beans.Pinao;
import com.lzh.beans.Simulate;
import com.lzh.beans.Stage;
import com.lzh.inter.Contestant;
import com.lzh.inter.MindReader;
import com.lzh.inter.Performer;
import com.lzh.inter.Thinker;

public class TestBeans
{
	public static void main(String[] args) throws Exception
	{
		//���Կ��������ĸ�������
		ApplicationContext context=new ClassPathXmlApplicationContext("com/lzh/beans/beans.xml");
//		ApplicationContext context=new ClassPathXmlApplicationContext("com/lzh/beans/beans2.xml");
//		ApplicationContext context=new AnnotationConfigApplicationContext("com.lzh.beans");
		
		//method injection
		//����ԭ��������ķ���ֵ
//		DryHands dryHands=(DryHands) context.getBean("injection.method.dryHands");
//		System.out.println(dryHands.getOne()==dryHands.getOne());
//		System.out.println(dryHands.getOne());
//		System.out.println(context.getBean("injection.method.tissue")
//				==context.getBean("injection.method.tissue"));
//		System.out.println(context.getBean("duke")
//				==context.getBean("duke"));
		
		//bean����Ioc������ʼ��ʱֱ��ʵ�����ģ�����ͨ������lazy-init����Ϊtrueʹ��bean�ڱ���һ�ε���ʱ��ʵ����
//		Pinao pinao=(Pinao) context.getBean("pinao");
//		pinao.play();
//		Pinao pinao2=(Pinao) context.getBean("pinao2");
//		pinao2.play();
		
		//�õ���ʵ������һ���ġ�spring�����Ĭ��bean���ǵ���ģʽ��
//		Pinao pinao=(Pinao) context.getBean("pinao");
//		pinao.setField("first");
//		Pinao pinao2=(Pinao) context.getBean("pinao");
//		System.out.println(pinao.getField());
		
//		Stage stage=(Stage) context.getBean("stage");
//		Auditorium auditorium=(Auditorium) context.getBean("auditorium");
//		Instrumentlist instrument	list=(Instrumentlist) context.getBean("instrumentlist");
//		instrumentlist.perform();
		
//		Performer oneManBand=(Performer) context.getBean("oneManBand");
//		oneManBand.perform();
		
		//ʹ����aop֮��ֻ��ʹ����Ӧ�Ľӿ���ת��
//		Performer performer=(Performer) context.getBean("simulate");
//		performer.perform();
		
//		Performer duke=(Performer) context.getBean("duke");
//		System.out.println(duke.getClass().getName());//which means you didnt get the direct access to the real object
//		duke.perform();
		
		//Ϊ֪ͨ�������
//		Thinker volunteer=(Thinker) context.getBean("volunteer");
//		volunteer.thinkOfSomething("what are you doing");
//		MindReader reader=(MindReader) context.getBean("magician");
//		System.out.println(reader.getThought());
		
		//spring aop�е� ������ ������--failed
//		Contestant contestant=(Contestant) context.getBean("pinao");
//		contestant.receiveAward();
	}
}
