package pl.ptroc.microservices.gatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class GatewayServiceApplication {

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "gateway-service");
		SpringApplication.run(GatewayServiceApplication.class, args);
	}
}
