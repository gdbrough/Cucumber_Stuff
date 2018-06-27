package config;

public class MainServiceImpl implements MainService {

	DatabaseService databaseService;
	
	public MainServiceImpl(DatabaseService databaseService) {
		this.databaseService = databaseService;
	}
	
	@Override
	public String getDetails() {
		return databaseService.getDbInfo();
	}

}
