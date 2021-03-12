package com.cts.abstractFactoryDesignPattern.factorymaker;

import com.cts.abstractFactoryDesignPattern.factory.AudiFactory;
import com.cts.abstractFactoryDesignPattern.factory.Factory;
import com.cts.abstractFactoryDesignPattern.factory.MercedesFactory;

public class FactoryMaker 
{	
	public static Factory getFactory(String factoryName)
	{
		if(factoryName.equals("audi"))
			return new AudiFactory();
		else if(factoryName.equals("mercedes"))
			return new MercedesFactory();
		else
			return null;
	}
}