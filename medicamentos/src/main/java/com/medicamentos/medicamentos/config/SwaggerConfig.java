package com.medicamentos.medicamentos.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.models.Contact;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfig {

	
	 @Bean
	    public Docket api() {
	        return new Docket(DocumentationType.SWAGGER_2)
	          .select()
	          .apis(RequestHandlerSelectors.any())
	          .paths(PathSelectors.any())
	          .build()
	          .apiInfo(metaInfo());
	          
	        
	        
	    }

	 private ApiInfo metaInfo() {

	        ApiInfo apiInfo=new ApiInfo("Api Medicamentos","Ivan Nilson Kaiser","Versão 2.0.0",
	        		"gringo9994@hotmail.com","Versão de Teste","ivan@teste","Api@copy")
	                
	        ;

	        return apiInfo;
	
	

	 }
}
