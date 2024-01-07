package com.controller;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.AccountBean;
import com.bean.UserBean;
import com.util.DBConnection;

public class UserAccountController {

	public void addUserWithAccoount() {

		Session session = DBConnection.getDbConnection();
		if (session != null) {

			Transaction tr = session.beginTransaction();
			AccountBean accountBean = new AccountBean();
			accountBean.setAcNo("ABC11121");
			accountBean.setAcName("Netflix");
			session.save(accountBean);

			UserBean userBean = new UserBean();
			userBean.setUserName("AMit");
			userBean.setUserEmail("amit@gmail.com");
			userBean.setUserAge(22);
			userBean.setAccountBean(accountBean);

			session.save(userBean);

			tr.commit();

		}

	}

	public void getUserDetailWithAccount() {

		Session session = DBConnection.getDbConnection();
		if (session != null) {

			Transaction tr = session.beginTransaction();

			Criteria criteria = session.createCriteria(UserBean.class);

			List<UserBean> users = criteria.list();

			for (UserBean user : users) {

				System.out.println(user.getUserName());
				System.out.println(user.getAccountBean().getAcName());
			}

		}

	}

	public void deleteUser() {

		Session session = DBConnection.getDbConnection();
		if (session != null) {

			Transaction tr = session.beginTransaction();

			UserBean userBean = new UserBean();
			userBean.setId(6);
			session.delete(userBean);
			tr.commit();
			session.close();

		}

	}

	public static void main(String[] args) {

		UserAccountController userAccountController = new UserAccountController();
		// userAccountController.addUserWithAccoount();
		// userAccountController.getUserDetailWithAccount();
		userAccountController.deleteUser();

	}
}
