package com.lzh.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig
{
	@Bean
	public Pinao getPinao()
	{
		return new Pinao();
	}
}
