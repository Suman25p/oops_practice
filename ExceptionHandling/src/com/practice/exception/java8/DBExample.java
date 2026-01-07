package com.practice.exception.java8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBExample {

	public static void main(String[] args) {
		
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
				PreparedStatement ps = con.prepareStatement
						("INSERT INTO orders VALUES (101, 'Mobile')")){
			ps.executeUpdate();
			System.out.println("Order saved Successfully");
		}catch(Exception e)
		{
			System.out.println("Database error!!");
		}
	}

}

//Database error!!