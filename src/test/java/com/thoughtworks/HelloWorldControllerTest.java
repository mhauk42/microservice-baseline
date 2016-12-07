package com.thoughtworks;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class HelloWorldControllerTest {

	HelloWorldController subject= new HelloWorldController();
	
	@Test
	public void shouldAnswerHello() {
		String answer = subject.helloWorld();
		assertThat(answer,is("Hello World!"));
		
	}
}
