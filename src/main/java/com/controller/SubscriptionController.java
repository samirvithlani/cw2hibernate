package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.ReaderBean;
import com.bean.SubscriptionBean;
import com.util.DBConnection;

public class SubscriptionController {

	public void add() {

		Session session = DBConnection.getDbConnection();
		if (session != null) {

			Transaction tr = session.beginTransaction();
			ReaderBean reader1 = new ReaderBean();
			reader1.setReaderName("amitabh");
			ReaderBean reader2 = new ReaderBean();
			reader2.setReaderName("abhisekh");

			session.save(reader1);
			session.save(reader2);

			List<ReaderBean> readers = new ArrayList<ReaderBean>();
			readers.add(reader1);
			readers.add(reader2);

			SubscriptionBean subscriptionBean1 = new SubscriptionBean();
			subscriptionBean1.setSubName("Gujarat Samachar");
			subscriptionBean1.setReaders(readers);

			SubscriptionBean subscriptionBean2 = new SubscriptionBean();
			subscriptionBean2.setSubName("Times");
			subscriptionBean2.setReaders(readers);

			session.save(subscriptionBean1);
			session.save(subscriptionBean2);

			tr.commit();
			
			System.out.println("data added...");

		}
	}

	public static void main(String[] args) {

		SubscriptionController sb1 = new SubscriptionController();
		sb1.add();
				
	}
}
