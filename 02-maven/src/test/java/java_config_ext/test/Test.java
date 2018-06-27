package java_config_ext.test;

import static org.junit.Assert.*;
import java_config_ext.AnotherHello;
import java_config_ext.AppConfig;
import java_config_ext.Detail;
import java_config_ext.Hello;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class Test {

	@Autowired
	private Hello hello = null;
	
	@Autowired
	private AnotherHello anotherHello = null;

	@org.junit.Test
	public void testNameIsNotNullAndIsGreg() {
		//assertNotNull("Constructor message instance is null.", hello);
		String name = hello.getName();
		//assertNotNull("Name is null.", stream.toString());
		String expectedOutput = "Greg";
		assertEquals(expectedOutput, name);
	}
	
	@org.junit.Test
	public void testAnotherBeansDetailDescriptionIsSunny() throws Exception {
		Detail detail = anotherHello.getDetail();
		String expectedOutput = "Sunny";
		assertEquals(expectedOutput, detail.getDescription());
	}
	
}