package br.com.componel.ssp.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDAO {
	
	public BaseDAO() {
		String driver = "com.informix.jdbc.IfxDriver";
				
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	protected Connection getConnection() throws SQLException {
		String url = "jdbc:informix-sqli://147.2.10.69:10030/sspdbh:INFORMIXSERVER=sop_prod_str";
		Connection conn = DriverManager.getConnection(url, "informix", "informix");
		return conn;
	}
	
	protected Connection getConnectionCass() throws SQLException {
		String url = "jdbc:informix-sqli://147.2.10.24:10040/casdb:INFORMIXSERVER=ol_srvmaodb";
		Connection conn = DriverManager.getConnection(url, "informix", "informix");
		return conn;
	}
	
	protected Connection getConnectionMysql() throws SQLException {
		String driver = "com.mysql.jdbc.Driver";
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:mysql://147.2.10.10/sspdb";
		Connection conn = DriverManager.getConnection(url, "user_ssp", "ssppass");
		return conn;
	}

	public static void main(String[] args) throws SQLException {
		BaseDAO db = new BaseDAO();
		Connection conn = db.getConnectionMysql();
		System.out.println(conn);
	}

}
