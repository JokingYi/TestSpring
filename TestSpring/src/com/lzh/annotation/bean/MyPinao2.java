package com.lzh.annotation.bean;

import org.springframework.stereotype.Component;

import com.lzh.inter.Instrument;

@Component("myPinao2")
public class MyPinao2 implements Instrument
{

	@Override
	public void play()
	{
		System.out.println("annotated pinao2");
	}

}
