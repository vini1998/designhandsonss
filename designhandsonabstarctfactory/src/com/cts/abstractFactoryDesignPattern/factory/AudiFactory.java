package com.cts.abstractFactoryDesignPattern.factory;

import com.cts.abstractFactoryDesignPattern.headlight.AudiHeadLight;
import com.cts.abstractFactoryDesignPattern.headlight.HeadLight;
import com.cts.abstractFactoryDesignPattern.tire.AudiTire;
import com.cts.abstractFactoryDesignPattern.tire.Tire;

public class AudiFactory extends Factory 
{
	@Override
	public Tire makeTire() 
	{
		return new AudiTire();
	}

	@Override
	public HeadLight makeHeadLight() 
	{
		return new AudiHeadLight();
	}
}