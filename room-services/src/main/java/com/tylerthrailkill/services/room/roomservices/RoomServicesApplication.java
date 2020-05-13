package com.tylerthrailkill.services.room.roomservices;

import static springfox.documentation.builders.PathSelectors.any;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableZuulProxy
public class RoomServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(RoomServicesApplication.class, args);
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Room").select()
                .apis(RequestHandlerSelectors.basePackage("com.tylerthrailkill.services.room"))
                .paths(any()).build().apiInfo(new ApiInfo("Room Services",
                                                          "A set of services to provide data access to rooms", "1.0.0", null,
                                                          "tyler", null, null));
    }

}
