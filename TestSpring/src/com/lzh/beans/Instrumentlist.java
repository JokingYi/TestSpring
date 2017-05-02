package com.lzh.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.lzh.inter.Instrument;
import com.lzh.inter.Performer;

public class Instrumentlist implements Performer
{
	@Value("Í¯»°Õò")
	private String song;
	@Autowired
	private Instrument instrument;
	
	@Override
	public void perform() throws Exception
	{
		System.out.println("Instrument: singing"+song);
		instrument.play();
	}
	public String getSong()
	{
		return song;
	}
	public void setSong(String song)
	{
		this.song = song;
	}
	public Instrument getInstrument()
	{
		return instrument;
	}
	
}
