package com.my.streamDemo;

public class Movie {

	private String movieName;
	private String actor;
	private int releaseYear;

	public Movie(String movieName, int releaseYear, String actor) {
		this.movieName = movieName;
		this.actor = actor;
		this.releaseYear = releaseYear;
	}

	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", actor=" + actor + ", releaseYear=" + releaseYear + "]";
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

}
