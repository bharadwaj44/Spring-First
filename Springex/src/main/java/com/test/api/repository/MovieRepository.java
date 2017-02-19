package com.test.api.repository;

import java.util.List;

import com.test.api.entity.Movie;

public interface MovieRepository {
	
	public List<Movie> findall(); 


	public Movie findone(String s); 

	
	public Movie create(Movie m); 

	
	public Movie update(Movie m); 

	
	public void delete(String s); 

}
