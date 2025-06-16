package com.services;

import com.dao.EmployeeDAO;

public class EmployeeSERVICES {
	
	public void insertData () throws Exception {
		EmployeeDAO ed = new EmployeeDAO();
		ed.insertData();
		
	}
	
	public void updateData () throws Exception {
		EmployeeDAO ed = new EmployeeDAO();
		ed.updateData();
		
	}
	
	public void deleteData () throws Exception {
		EmployeeDAO ed = new EmployeeDAO();
		ed.deleteData();
		
	}
	public void getAllrecord() throws Exception {
		EmployeeDAO ed = new EmployeeDAO();
		ed.getAllrecord();
		
	}
	

}
