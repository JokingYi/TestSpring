package com.lzh.beans;

import java.util.Collection;

import com.lzh.inter.Instrument;
import com.lzh.inter.Performer;

public class OneManBand implements Performer
{
	private Collection<Instrument> instruments; 
	
	@Override
	public void perform() throws Exception
	{
		for (Instrument instrument : instruments)
		{
			instrument.play();
		}
	}

	public Collection<Instrument> getInstruments()
	{
		return instruments;
	}

	public void setInstruments(Collection<Instrument> instruments)
	{
		this.instruments = instruments;
	}
}
