package com.cts.abstractFactoryDesignPattern.client;

import com.cts.abstractFactoryDesignPattern.factorymaker.FactoryMaker;
import com.cts.abstractFactoryDesignPattern.headlight.HeadLight;
import com.cts.abstractFactoryDesignPattern.tire.Tire;

public class Client 
{
	public void doSomeClientJob()
	{
		Tire tire = FactoryMaker.getFactory("audi").makeTire();
		System.out.println(tire.getTireModel());
		HeadLight light = FactoryMaker.getFactory("audi").makeHeadLight();
		System.out.println(light.getHeadLightModel());
	}
}