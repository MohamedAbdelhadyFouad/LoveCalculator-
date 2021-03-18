package com.configurationPackage.Setup;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LoveCalcDispatcherServlet extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class arr[]= {loveCalcConfiguration.class}; 
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		String arr[]= {"/"}; 
 		return arr;
	}

}
