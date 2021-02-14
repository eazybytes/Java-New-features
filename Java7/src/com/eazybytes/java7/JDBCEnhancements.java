/**
 * 
 */
package com.eazybytes.java7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

/**
 * @author EazyBytes
 *
 */
public class JDBCEnhancements {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		viewResults();
		createJdbcRowset();
	}

	/**
	 * Sample implementation from Java 7
	 * 
	 * @throws Exception
	 *
	 */
	public static void viewResults() throws Exception {
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/organization", "root", "root");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from employee");) {
			while (rs.next()) {
				System.out.println(rs.getString("NAME") + "" + rs.getInt("AGE") + "" + rs.getString("DEPARTMENT"));
			}
		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * Sample implementation from Java 7
	 * 
	 * @throws Exception
	 * 
	 */
	public static void createJdbcRowset() throws Exception {
		try (JdbcRowSet jRS = RowSetProvider.newFactory().createJdbcRowSet();) {
			jRS.setUrl("jdbc:mysql://localhost:3306/organization");
			jRS.setUsername("root");
			jRS.setPassword("root");
			jRS.setCommand("select * from employee");
			jRS.execute();
			while (jRS.next()) {
				System.out.println(jRS.getString("NAME") + "" + jRS.getInt("AGE") + "" + jRS.getString("DEPARTMENT"));
			}
		} catch (Exception e) {
			throw e;
		}
	}

}
