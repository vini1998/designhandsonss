package com.cts.abstractFactoryDesignPattern.factory;

import com.cts.abstractFactoryDesignPattern.headlight.HeadLight;
import com.cts.abstractFactoryDesignPattern.tire.Tire;

public abstract class Factory 
{
	public abstract Tire makeTire();
	
	public abstract HeadLight makeHeadLight();
}