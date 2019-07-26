package com.labifuco.firestats.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class TestJdbc {

	public static void main(String[] args) {

		Properties connectionProps = new Properties();
		connectionProps.put("user", "firestats");
		connectionProps.put("password", "Apagarfuegos");

		String jdbcURL = "jdbc:mysql://localhost:3306/firestats?useSSL=" + "false&serverTimezone=UTC";

		try { 

			System.out.println("Connecting to database: " + jdbcURL);

			Connection myConn = DriverManager.getConnection(jdbcURL, connectionProps);

			System.out.println("Connected to database");
		} catch (Exception exc) {
			exc.printStackTrace();
		}

	}

}
