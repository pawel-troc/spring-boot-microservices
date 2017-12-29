package pl.ptroc.microservices.customerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class CustomerServiceApplication {

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "customer-service");
		SpringApplication.run(CustomerServiceApplication.class, args);
	}
}
