package java_config.test;

import static org.junit.Assert.assertEquals;
import java_config.AppConfig;
import java_config.Hello;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class Test {

	@Autowired
	private Hello hello = null;

	@org.junit.Test
	public void testNameIsNotNullAndIsGreg() {
		//assertNotNull("Constructor message instance is null.", hello);
		String name = hello.getName();
		//assertNotNull("Name is null.", stream.toString());
		String expectedOutput = "Greg";
		assertEquals(expectedOutput, name);
	}
}