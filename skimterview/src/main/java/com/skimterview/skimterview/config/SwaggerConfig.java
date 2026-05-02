package com.skimterview.skimterview.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
            .info(apiInfo())
            .components(new Components()
                .addSecuritySchemes("bearerAuth", securityScheme()));
    }

    private Info apiInfo() {
        return new Info()
            .title("Skimterview API")
            .description("얕고 많은 개발 지식 사이트")
            .version("v1.0.0")
            .contact(new Contact()
                .name("JC")
                .email("p990805@naver.com"));
    }

    private SecurityScheme securityScheme() {
        return new SecurityScheme()
            .type(SecurityScheme.Type.HTTP)
            .scheme("bearer")
            .bearerFormat("JWT")
            .description("JWT Access Token을 입력하세요. (Bearer 접두사 불필요)");
    }
}
