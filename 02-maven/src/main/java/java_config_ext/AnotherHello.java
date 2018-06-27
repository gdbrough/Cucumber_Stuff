package java_config_ext;

public class AnotherHello {
	private String name;
	private Detail detail;
	
	public AnotherHello(String name, Detail detail) {
		this.name = name;
		this.detail = detail;
	}
	
	public Detail getDetail() {
		return detail;
	}
	
	public void setDetail(Detail detail) {
		this.detail = detail;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
