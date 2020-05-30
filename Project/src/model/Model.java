package model;

import java.sql.Connection;

public interface Model {
	static boolean insert(Connection con, String sql) {
		return false;
	}
	static boolean edit(Connection con, String table, String data, String where) {
		return false;
	}
	static boolean delete(Connection con, String table, String where) {
		return false;
	} 
}
