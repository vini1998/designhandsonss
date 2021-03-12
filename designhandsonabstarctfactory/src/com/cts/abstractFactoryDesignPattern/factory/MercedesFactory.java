package com.cts.abstractFactoryDesignPattern.factory;

import com.cts.abstractFactoryDesignPattern.headlight.HeadLight;
import com.cts.abstractFactoryDesignPattern.headlight.MercedesHeadLight;
import com.cts.abstractFactoryDesignPattern.tire.MercedesTire;
import com.cts.abstractFactoryDesignPattern.tire.Tire;

public class MercedesFactory extends Factory 
{
	@Override
	public Tire makeTire() 
	{
		return new MercedesTire();
	}

	@Override
	public HeadLight makeHeadLight() 
	{
		return new MercedesHeadLight();
	}
}