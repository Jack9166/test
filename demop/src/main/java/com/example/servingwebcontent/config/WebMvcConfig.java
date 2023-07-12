package com.example.servingwebcontent.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

// import com.example.servingwebcontent.interfaces.UserInterface;
// import com.example.servingwebcontent.services.UserServicesImpl;

// import com.example.servingwebcontent.interfaces.address__provinces_Interface;
// import com.example.servingwebcontent.services.address__provinces_ServicesImpl;

import com.example.servingwebcontent.interfaces.address__wards_interfaces;
import com.example.servingwebcontent.services.address__wards_ServicesImpl;

// import com.example.servingwebcontent.interfaces.address__districts_interfaces;
// import com.example.servingwebcontent.services.address__districts_ServicesImpl;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.example.servingwebcontent.controllers" })
public class WebMvcConfig implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("index");
	}

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver bean = new InternalResourceViewResolver();

		bean.setViewClass(JstlView.class);
		bean.setPrefix("/WEB-INF/view/");
		bean.setSuffix(".jsp");

		return bean;
	}

	public DriverManagerDataSource getDataSource() {

		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://127.0.0.1:3306/test?useSSL=false");
		ds.setUsername("root");
		ds.setPassword("root");

		return ds;
	}

	// @Bean
	// public UserInterface getUserInterface() {
	// 	return new UserServicesImpl(getDataSource());
	// }

	// @Bean
	// public address__provinces_Interface getaddress__provincesInterface() {
	// 	return new address__provinces_ServicesImpl(getDataSource());
	// }

	// @Bean
	// public address__districts_interfaces getaddress__districtsInterface() {
	// 	return new address__districts_ServicesImpl(getDataSource());
	// }

	@Bean
	public address__wards_interfaces getaddress__wardsInterface() {
		return new address__wards_ServicesImpl(getDataSource());
	}
}