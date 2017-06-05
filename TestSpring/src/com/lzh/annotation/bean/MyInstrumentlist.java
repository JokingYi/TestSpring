package com.lzh.annotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.lzh.inter.Instrument;
import com.lzh.inter.Performer;

//bean的默认id为无限定类名
@Component("myInstrumentlist")
public class MyInstrumentlist implements Performer
{
	//将required设置为false适合没有对应的bean时，当有多个时，不能使用
	@Autowired(required=false)
	@Qualifier("notStringed")
	private Instrument instrument; 
	
	@Override
	public void perform() throws Exception
	{
		instrument.play();
	}

}
