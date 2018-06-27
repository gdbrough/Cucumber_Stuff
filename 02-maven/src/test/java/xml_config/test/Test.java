package xml_config.test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import xml_config.Hello;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("applicationContext.xml")
public class Test {

	@Autowired
	private Hello hello = null;

	@org.junit.Test
	public void testNameIsNotNullAndIsGreg() {
		assertNotNull("Constructor message instance is null.", hello);
		String name = hello.getName();
		assertNotNull("Name is null.", name);
		String expectedName = "Greg";
		assertEquals("Name should be '" + expectedName + "'.", expectedName,
				name);
	}
}