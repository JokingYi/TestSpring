package com.lzh.annotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lzh.inter.Instrument;
import com.lzh.inter.Performer;

@Component("myInstrumentlist")
public class MyInstrumentlist implements Performer
{
	@Autowired
	private Instrument instrument; 
	
	@Override
	public void perform() throws Exception
	{
		instrument.play();
	}

}
