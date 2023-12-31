package com.controller;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.EmployeeBean;
import com.util.DBConnection;

//ORM --> class obj --> bind..

public class EmployeeController {

	public void addData() {

		Session session = DBConnection.getDbConnection();
		if (session != null) {

			Transaction tr = session.beginTransaction();
			EmployeeBean employeeBean = new EmployeeBean();
			employeeBean.seteName("amit");
			employeeBean.seteAge(23);
			employeeBean.seteEmail("amit@gmail.com");
			employeeBean.setSalary(13456.78);

			session.save(employeeBean); // insert into..
			tr.commit();
			session.close();

		}

	}

	public void deleteData() {

		Session session = DBConnection.getDbConnection();
		if (session != null) {

			EmployeeBean employeeBean = new EmployeeBean();
			Transaction tr = session.beginTransaction();
			employeeBean.seteId(1);
			session.delete(employeeBean);
			tr.commit();
			session.close();

		}

	}

	public static void main(String[] args) {

		EmployeeController employeeController = new EmployeeController();
		//employeeController.addData();
		employeeController.deleteData();

	}
}
