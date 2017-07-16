package com.lzh.annotation.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.lzh.inter.Instrument;

@Configuration
@ComponentScan
public class AnnotationConfig
{
	//@ComponentScan默认扫描与配置类相同的包
//	@Bean
//	public MyInstrumentlist myInstrumentlist()
//	{
//		return new MyInstrumentlist(instrument());
//	}
	//another to auto wire the argument, ignore how the bean "instrument" is loaded
	@Bean
	public MyInstrumentlist myInstrumentlist(Instrument instrument)
	{
		return new MyInstrumentlist(instrument);
	}
	@Bean
	public Instrument instrument()
	{
		//some operation can be added here;
		return new MyPinao();
	}
}
