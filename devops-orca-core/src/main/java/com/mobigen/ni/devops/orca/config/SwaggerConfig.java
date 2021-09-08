package com.mobigen.ni.devops.orca.config;

import com.fasterxml.classmate.TypeResolver;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;


@Profile("!test")
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    private final ApplicationContext applicationContext;

    public SwaggerConfig(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Bean
    public Docket api(TypeResolver typeResolver) {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.mobigen.ni.devops.orca.api"))
                .paths(PathSelectors.any())
                .build()
                .useDefaultResponseMessages(false)
                .apiInfo(new ApiInfo(applicationContext.getApplicationName() + " DevOps ORCA api",
                        "",
                        "",
                        "",
                        new Contact("", "", ""),
                        "",
                        "",
                        Collections.emptyList()));
    }
}
