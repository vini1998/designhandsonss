package com.cts.abstractFactoryDesignPattern;

import com.cts.abstractFactoryDesignPattern.client.Client;

public final class Main 
{
	public static void main(String[] args) 
	{
		Client client = new Client();
		client.doSomeClientJob();
	}
}