package annotation_this_one;

import org.springframework.stereotype.Component;

@Component
public class Supervisor {
	private String name;
	private int level;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Supervisor [name=" + name + ", level=" + level + "]";
	}
}