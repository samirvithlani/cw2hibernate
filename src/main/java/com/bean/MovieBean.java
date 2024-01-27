package com.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "movies")
public class MovieBean {

	@Id
	@GeneratedValue
	private int movieId;
	private String movieName;

	@OneToMany
	private List<SongsBean> songs;

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public List<SongsBean> getSongs() {
		return songs;
	}

	public void setSongs(List<SongsBean> songs) {
		this.songs = songs;
	}

}
