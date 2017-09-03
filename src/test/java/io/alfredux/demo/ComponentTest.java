package io.alfredux.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.alfredux.demo.configuration.TestConfiguration;
import io.alfredux.demo.mapper.TestComponent;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestConfiguration.class)
public class ComponentTest {

	@Autowired
	TestComponent testComponent;
	
	@Test
	public void contextLoads() {
		testComponent.test();
	}
	
}
