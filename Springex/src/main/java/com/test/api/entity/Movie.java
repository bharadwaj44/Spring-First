package com.test.api.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table
@NamedQueries({
		@NamedQuery(name="Movie.findall",query="SELECT m FROM Movie as m"),

		@NamedQuery(name="Movie.findbyname",query="select m from Movie  as m where m.Moviename=:pmoviename")
})
//@NamedQueries(@NamedQuery(name = "Employee.findByEmail", query = "SELECT e FROM Employee e WHERE e.email=:pEmail"))

public class Movie {
	
	
    

	@Id
	private String MovieId;
	private String Moviename;
	
	private String MovieRuntime;
	private String MovieRating;
	
	
	public Movie(){
		
		MovieId=UUID.randomUUID().toString();
	}
	

	public String getMoviename() {
		return Moviename;
	}
	public void setMoviename(String moviename) {
		Moviename = moviename;
	}
	public String getMovieId() {
		return MovieId;
	}
	public void setMovieId(String id) {
		 this.MovieId=id;
		 
	}
	public String getMovieRuntime() {
		return MovieRuntime;
	}
	public void setMovieRuntime(String movieRuntime) {
		MovieRuntime = movieRuntime;
	}
	public String getMovieRating() {
		return MovieRating;
	}
	public void setMovieRating(String movieRating) {
		MovieRating = movieRating;
	}
	
	public String toString() {
		return "Movie [MovieId=" + MovieId + ", Moviename=" + Moviename + ", MovieRuntime=" + MovieRuntime
				+ ", MovieRating=" + MovieRating + "]";
	}
	
}
