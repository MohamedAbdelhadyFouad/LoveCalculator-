package com.configurationPackage.Setup;

import javax.validation.Validator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.loveCalc_Controllers" )
public class loveCalcConfiguration {
	
      
	@Bean
	public InternalResourceViewResolver viewResolve() {
		InternalResourceViewResolver x = new InternalResourceViewResolver();
		x.setPrefix("/WEB-INF/view/");
		x.setSuffix(".jsp");
		return x;
	}

}
