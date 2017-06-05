package com.lzh.annotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.lzh.inter.Instrument;
import com.lzh.inter.Performer;

//bean��Ĭ��idΪ���޶�����
@Component("myInstrumentlist")
public class MyInstrumentlist implements Performer
{
	//��required����Ϊfalse�ʺ�û�ж�Ӧ��beanʱ�����ж��ʱ������ʹ��
	@Autowired(required=false)
	@Qualifier("notStringed")
	private Instrument instrument; 
	
	@Override
	public void perform() throws Exception
	{
		instrument.play();
	}

}
