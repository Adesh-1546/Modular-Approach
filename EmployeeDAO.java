package com.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;



public class EmployeeDAO  {
	

		public void insertData() throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","adeshpol141546");
			
			Statement st = con.createStatement();
			
			st.executeUpdate("Insert into empdeatails(emp_id, emp_name, location) values (1,'Adesh','Pune')");
			System.out.println("Data inserted");
			con.close();
			
		}
		
		public void updateData() throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","adeshpol141546");
			
			Statement st = con.createStatement();
			
			st.executeUpdate("Update empdeatails set emp_name = 'John', location = 'Mumbai'");
			System.out.println("Data Updated");
			con.close();
			
		}
		
		public void deleteData() throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","adeshpol141546");
			
			Statement st = con.createStatement();
			
			st.executeUpdate("Delete from empdeatails where emp_id = 2 ");
			System.out.println("Data Deleted");
			con.close();
			
		}
		
		public void getAllrecord() throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","adeshpol141546");
			
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery("Select * from empdeatails");
			while (rs.next()) {
				System.out.println(rs.getInt(1)+ "    "+ rs.getString(2)+"    "+rs.getString(3));
			}
			
			con.close();
			
		}
		
	

}
