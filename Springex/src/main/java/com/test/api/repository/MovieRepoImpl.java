package com.test.api.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.test.api.entity.Movie;
@Repository
public class MovieRepoImpl implements MovieRepository {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Movie> findall() {
		// TODO Auto-generated method stub
		
		
		//Query query=	em.createQuery("select * from javapractise.movies;");
	TypedQuery<Movie> query=em.createNamedQuery("Movie.findall",Movie.class);

		return query.getResultList();
	}

	@Override
	public Movie findone(String s) {
		TypedQuery<Movie> query=em.createNamedQuery("Movie.findbyname",Movie.class);
		query.setParameter("pmoviename",s);
		return 	query.getSingleResult();
		
		
	}	

	@Transactional
	@Override
	public Movie create(Movie m) {
		
		em.persist(m);
		return m;
	}

	@Transactional
	@Override
	public Movie update(Movie m) {
	
		em.merge(m);
		return m;
	}

	@Transactional
	@Override
	public void delete(String s) {
		Movie m=findone(s);
		em.remove(m);
		//em.detach(m);

	}

}
