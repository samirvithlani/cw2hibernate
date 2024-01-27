package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.MovieBean;
import com.bean.SongsBean;
import com.util.DBConnection;

public class MovieControlle {

	public void add() {

		Session session = DBConnection.getDbConnection();
		if (session != null) {

			Transaction tr = session.beginTransaction();
			SongsBean song1 = new SongsBean();
			song1.setSongName("pqr");
			SongsBean song2 = new SongsBean();
			song2.setSongName("mar java 2");
			session.save(song1);
			session.save(song2);
			List<SongsBean> songs = new ArrayList<SongsBean>();
			songs.add(song1);
			songs.add(song2);

			MovieBean movieBean = new MovieBean();
			movieBean.setMovieName("Avangers");
			movieBean.setSongs(songs);

			session.save(movieBean);
			tr.commit();
			System.out.println("movies and songs created...");

		}

	}

	public void get() {

		Session session = DBConnection.getDbConnection();
		if (session != null) {
			Transaction tr = session.beginTransaction();
			Criteria criteria = session.createCriteria(MovieBean.class);
			List<MovieBean> movies = criteria.list();
			for (MovieBean m : movies) {

				System.out.println(m.getMovieName());
				List<SongsBean> songs = m.getSongs();
				for (SongsBean s : songs) {
					System.out.println(s.getSongName());
				}
			}
			tr.commit();

		}
		

	}

	public static void main(String[] args) {

		MovieControlle movie = new MovieControlle();
		//movie.add();
		movie.get();
	}
}
