package com.test.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.api.entity.Movie;
import com.test.api.service.MovieService;

//@Controller
//@ResponseBody

@RestController
@RequestMapping(value="Movie")
public class MovieController {
	
	@Autowired
	MovieService m;

	@RequestMapping(method=RequestMethod.GET)
	public List<Movie> findall(){
		
		return m.findall();
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/{id}")
	public  Movie findone(@PathVariable("id") String movieid){
		
		return m.findone(movieid);
	}
	
	@RequestMapping(method=RequestMethod.POST)
public Movie create(@RequestBody Movie movie ){
		
		return m.create(movie);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public Movie update(@RequestBody Movie movie){
		
		return m.update(movie);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="{id}")

	public void delete(String id){
		
	 m.delete(id);
		
		
		
	}
	
	
	
	
}
