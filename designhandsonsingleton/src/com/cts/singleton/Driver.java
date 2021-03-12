package com.cts.singleton;

public class Driver {

	public static void main(String[] args) {
		
		DBConn dbConn1 = DBConn.getInstance();
		DBConn dbConn2 = DBConn.getInstance();
		
		System.out.println(dbConn1.hashCode() + " " + dbConn2.hashCode() + " " + (dbConn1==dbConn2));
	}

}
