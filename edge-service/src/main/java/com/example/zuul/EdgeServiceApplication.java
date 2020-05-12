package com.example.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.ZuulFilter;
import com.example.zuul.SimplePostFilter;
import com.example.zuul.SimplePreFilter;

@SpringBootApplication
@EnableZuulProxy
public class EdgeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdgeServiceApplication.class, args);
	}
	
	@Bean
	public SimplePreFilter simplePreFilter() {
		return new SimplePreFilter();
	}
	
	@Bean
	public SimplePostFilter simplePostFilter() {
		return new SimplePostFilter();
	}

}
