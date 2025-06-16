package com.controller;

import com.services.EmployeeSERVICES;
import java.util.Scanner;
public class EmployeeCONTROLLER {
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("1.Insert");
		System.out.println("2.Update");
		System.out.println("3.Delete");
		System.out.println("4.GetAllData");
		int ch = sc.nextInt();
		
		
		EmployeeSERVICES es = new EmployeeSERVICES();
		
		switch(ch) {
		case 1 : es.insertData();
		break;
		case 2 : es.updateData();
		break;
		case 3 : es.deleteData();
		break;
		case 4 : es.getAllrecord();
		break;
		default : System.out.println("Enter correct choice");
		}
		
		sc.close();
		
		
		
	}

}
