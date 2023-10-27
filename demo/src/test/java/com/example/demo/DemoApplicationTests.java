package com.example.demo;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.service.ValidateParenthesis;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class DemoApplicationTests {


	@Test
	void test0(){
		String input = "({[])";
		assertFalse(ValidateParenthesis.isvalid(input), "Invalid");
	}

	@Test
	void test1(){
		String input = "({[]})";
		assertTrue(ValidateParenthesis.isvalid(input), "Valid");
	}

	@Test
	void test2(){
		String input = "((()";
		assertFalse(ValidateParenthesis.isvalid(input), "invalid");
	}




}
