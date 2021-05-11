package com.kundan.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	/**
	 * bean for swagger Screen
	 * It will detect all controllers
	 * and display operations at UI for execution
	 */
	@Bean
	public Docket createSwaggerDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.kundan.controller"))
				.paths(PathSelectors.regex("/student.*"))
				.build()
				.apiInfo(apiInfo());
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfo("Student Application", "SAMPLE APP","3.3GA", "https://nareshit.in/", new Contact("Kundan", "https://www.facebook.com/kundan.kumar.1238", "kumarkundan380@gmail.com"), "NIT Licence", "https://nareshit.in", new ArrayList<VendorExtension>());
	}

}
