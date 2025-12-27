package com.java.practice.string;
class QueryGen
{
	public StringBuilder generateQuery(int empId) {
		
		StringBuilder query = new StringBuilder("SELECT * from Employee_deatils");
		
		if(empId>0)
		{
			query.append(" where empId " + empId);
		} else {
			query.append(";");
		}
		return query;
	}
}
public class DynamicSQL {

	public static void main(String[] args) {
		
		QueryGen gen = new QueryGen();
		StringBuilder sb1 = gen.generateQuery(0);
		StringBuilder sb2 = gen.generateQuery(1234);
		
		System.out.println(sb1);
		System.out.println(sb2);
		
	}

}

//SELECT * from Employee_deatils;
//SELECT * from Employee_deatils where empId 1234
