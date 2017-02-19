package com.test.api;


import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class ServeletAPIInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("in getrootconfigclasses");

		return new Class[]{ApiConfig.class,JPAConfig.class};
		
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("in getservletmappings");
		return new String[]{"/api/*"};
	}

	

}
