package io.alfredux.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.alfredux.demo.domain.Source;
import io.alfredux.demo.domain.Target;
import io.alfredux.demo.mapper.SourceToTargetMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MapstructLombockSpringbootApplicationTests {

	@Autowired
	SourceToTargetMapper sourceToTargetMapper;
	
	@Test
	public void contextLoads() {
		
	}
	
	@Test
	public void mappingWorks() {
		Source source = new Source("demo","demonstration source");
		Target target = sourceToTargetMapper.toTarget(source);
		assertEquals(target.getId(), source.getIdentifier());
		assertEquals(target.getDescription(), source.getCharacteristics());
	}

}
