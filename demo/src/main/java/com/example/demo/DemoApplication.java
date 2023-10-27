package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.example.service.ValidateParenthesis.isvalid;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		String string1 = "([{}])";
		String string2 = "({[])";
		String string3 = "({[}])";
		boolean result1 = isvalid(string1);
		boolean result2 = isvalid(string2);
		boolean result3 = isvalid(string3);

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
