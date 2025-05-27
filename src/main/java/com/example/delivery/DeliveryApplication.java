package com.example.delivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.ShallowEtagHeaderFilter;

@SpringBootApplication
public class DeliveryApplication {
	public static void main(String[] args) {
		SpringApplication.run(DeliveryApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean<ShallowEtagHeaderFilter> shallowEtagHeaderFilter() {
		FilterRegistrationBean<ShallowEtagHeaderFilter> filterRegistrationBean =
				new FilterRegistrationBean<>(new ShallowEtagHeaderFilter());
		filterRegistrationBean.addUrlPatterns("/restaurants/*", "/menu/*", "/orders/*");
		filterRegistrationBean.setName("etagFilter");
		return filterRegistrationBean;
	}
}