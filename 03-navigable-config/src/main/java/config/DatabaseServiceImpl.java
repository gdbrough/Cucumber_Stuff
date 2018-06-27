package config;

public class DatabaseServiceImpl implements DatabaseService {

	@Override
	public String getDbInfo() {
		return "dbinfo: OracleXE";
	}

}