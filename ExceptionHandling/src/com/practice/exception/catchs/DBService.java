package com.practice.exception.catchs;

import java.sql.SQLException;

public class DBService {

	public static void main(String[] args) 
	{
		try {
			throw new SQLException();
		}catch (SQLException | NullPointerException e) {
			System.out.println("DataBase operation failed");
		}

	}

}
