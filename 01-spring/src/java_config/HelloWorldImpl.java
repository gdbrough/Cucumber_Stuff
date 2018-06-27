package java_config;

// This is a Spring bean.
public class HelloWorldImpl implements HelloWorld {
	 
	@Override
	public void printHelloWorld(String msg) {
 
		System.out.println("Hello : " + msg);
	}
 
}