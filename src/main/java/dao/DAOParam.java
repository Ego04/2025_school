package dao;

public class DAOParam {
	private final String JDBC_URL = "jdbc:mysql://localhost/r4a129";
	private final String DB_USER ="root";
	private final String DB_PASS ="password";
	public String getJDBC_URL() {
		return JDBC_URL;
	}
	public String getDB_USER() {
		return DB_USER;
	}
	public String getDB_PASS() {
		return DB_PASS;
	}

}
