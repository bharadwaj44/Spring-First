package com.test.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.api.entity.Movie;
import com.test.api.exceptions.EntityNotfound;
import com.test.api.repository.MovieRepository;



//validations.exceptions,needs to be handled
@Component

public class Movieserviceimpl implements MovieService {

	@Autowired
	MovieRepository mr;
	@Override
	public List<Movie> findall() {
		// TODO Auto-generated method stub
		return mr.findall();
	
	}

	@Override
	
	public Movie findone(String s) {
		// TODO Auto-generated method stub
		
	Movie m=	mr.findone(s);
	if(m==null){
		throw new EntityNotfound("Movienot found");}
	
	return m;
	}

	@Override
	public Movie create(Movie m) {
		Movie mv=mr.create(m);
		if(mv==null){
			throw new EntityNotfound("Movie coudnt be created");}
		return mv;
	}

	@Override
	public Movie update(Movie m) {
		Movie mv=mr.update(m);
		if(mv==null){
			throw new EntityNotfound("Movie coudnt be updated");}
		return mv;
	}

	@Override
	public Movie delete(String s) {
		
		mr.delete(s);
		return null;
		
	}

}
