package java_config_ext;

public class HelloImpl implements Hello {
	
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return this.name;
	}
}