package com.util;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class DBConnection {

	// Connection --> Session

	public static Session getDbConnection() {

		return new Configuration().configure().buildSessionFactory().openSession();

		
	}
	
	public static void main(String[] args) {
		
		Session session = getDbConnection();
		if(session!=null) {
			
			System.out.println("db connected..");
		}
		else {
			
			System.out.println("not connected...");
		}
	}

}
