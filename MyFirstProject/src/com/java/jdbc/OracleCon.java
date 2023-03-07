package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;  
class OracleCon{ 
	
	public static void main(String args[]){  
	try{  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","orcl","orcl");  
		  
		PreparedStatement stmt=con.prepareStatement("select * from custmers");  
		ResultSet rs=stmt.executeQuery();  
		while(rs.next()){  
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+""+rs.getInt(3)+""+rs.getString(4)+""+rs.getInt(5));  
		}  
		int i=stmt.executeUpdate();  
		System.out.println(i+" records inserted");  
		  
		con.close();  
		  
		}catch(Exception e){ System.out.println(e);}  
		  
		}  
		}  