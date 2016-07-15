package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import domain.Custom;

public class EmpController {
	
	public static Connection getConnection(){
		Connection con = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/test","root","1111");
			
		}catch(Exception e){
			System.out.println(e);
		}
		return con;
	}
	
	public static List<Custom> getRecords(int start, int total){
		
		List<Custom> list = new ArrayList<Custom>();
		
		try{
			Connection con = getConnection();
			   PreparedStatement ps=con.prepareStatement("select * from customer_list limit "+(start-1)+","+total);  
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				Custom e = new Custom();
				e.setNum(rs.getInt(1));
				e.setCustName(rs.getString(2));
				list.add(e);
			}
			
			con.close();
			
		}catch(Exception e){
			System.out.println(e);
		}
		
		return list;
		
		
	}
}
