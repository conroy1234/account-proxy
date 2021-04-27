package com.account.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class AccountProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountProxyApplication.class, args);
	}

}
