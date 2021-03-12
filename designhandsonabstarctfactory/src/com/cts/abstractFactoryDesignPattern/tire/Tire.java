package com.cts.abstractFactoryDesignPattern.tire;
public abstract class Tire 
{
	protected final String _tireModel;
	
	public Tire(String tireModel)
	{
		_tireModel = tireModel;
	}
	
	public String getTireModel()
	{
		return _tireModel;
	}
}