package com.lzh.annotation.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.lzh.inter.Instrument;

@Component("myPinao")
@Qualifier("notStringed")
public class MyPinao implements Instrument
{

	@Override
	public void play()
	{
		System.out.println("annotated pinao");
	}

}
