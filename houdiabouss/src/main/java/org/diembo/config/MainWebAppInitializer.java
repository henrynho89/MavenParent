package org.diembo.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class MainWebAppInitializer implements WebApplicationInitializer{

	public void onStartup(ServletContext sc) throws ServletException {
		// Chargement du contexte d'application
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(WebAppConfiguration.class);
		
		// Création de la servlet
		DispatcherServlet servlet = new DispatcherServlet(context);
		ServletRegistration.Dynamic registration = sc.addServlet("app", servlet);
	    registration.setLoadOnStartup(1);
	    registration.addMapping("/");
	}

}
