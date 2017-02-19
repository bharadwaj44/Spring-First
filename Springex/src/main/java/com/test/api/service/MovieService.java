package com.test.api.service;

import java.util.List;

import com.test.api.entity.Movie;

public interface MovieService {
	
	public List<Movie> findall();
	public Movie findone(String s);
	
	public Movie create(Movie m);
	public Movie update(Movie m);
	public Movie delete(String s);


}
