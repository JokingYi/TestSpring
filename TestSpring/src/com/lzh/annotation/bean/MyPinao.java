package com.lzh.annotation.bean;

import org.springframework.stereotype.Component;

import com.lzh.inter.Instrument;

@Component("myPinao")
public class MyPinao implements Instrument
{

	@Override
	public void play()
	{
		System.out.println("annotated pinao");
	}

}
