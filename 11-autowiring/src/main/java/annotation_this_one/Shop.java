package annotation_this_one;

import org.springframework.beans.factory.annotation.Autowired;

public class Shop {

	// required=false allows nullable field.
	@Autowired(required=true)
	private Supervisor supervisor;
	private String type;
	
	public Supervisor getSupervisor() {
		return supervisor;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}

	@Override
	public String toString() {
		return "Shop [supervisor=" + supervisor + "]";
	}
}