package com.example.microservices.product_catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
public class ProductCatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductCatalogApplication.class, args);
	}
	
//http://localhost:8005/swagger-ui/index.html
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(
				/*RequestHandlerSelectors.any()*/
				RequestHandlerSelectors.basePackage("com.example.microservices.product_catalog"))
				.paths(PathSelectors.any()).build().apiInfo(apiInfo());
	}
	 
	 
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Product Catelog API")
                .description("for better Product management")
                .license("MIT License")
                .licenseUrl("https://opensource.org/licenses/MIT")
                .build();
    }    
   
}
