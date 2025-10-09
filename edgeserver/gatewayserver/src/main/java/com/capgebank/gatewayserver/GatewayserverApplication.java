package com.capgebank.gatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayserverApplication.class, args);
	}

    @Bean
    public RouteLocator capgeBankRouteConfig(RouteLocatorBuilder routeLocatorBuilder){
        return routeLocatorBuilder.routes()
                .route(p->p
                        .path("/capgebank/accounts/**")
                        .filters(f->
                                f.rewritePath("/capgebank/accounts/(?<segment>.*)","/${segment}"))
                        .uri("lb://ACCOUNTS"))
                .route(p->p
                        .path("/capgebank/loans/**")
                        .filters(f->
                                f.rewritePath("/capgebank/loans/(?<segment>.*)","/${segment}"))
                        .uri("lb://LOANS"))
                .route(p->p
                        .path("/capgebank/cards/**")
                        .filters(f->
                                f.rewritePath("/capgebank/cards/(?<segment>.*)","/${segment}"))
                        .uri("lb://CARDS")).build();
    }

}
