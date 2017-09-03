package io.alfredux.demo.mapper;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component("testComponent")
@Slf4j
public class TestComponent {

	public void test(){
		log.info("TEST COMPONENT");
	}
	
}
