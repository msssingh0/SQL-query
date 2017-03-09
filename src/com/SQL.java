package com;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class SQL  {
	public SQL(){
		new Connector();
	}
		
	public int loginCheck(String  data,String data2) {

		int res=-1;
		try {
			Statement st=Connector.loginCon.createStatement();
			
			ResultSet rs=st.executeQuery("select id,password from login");
			while(rs.next()){
				//System.out.println(rs.getString(1) + "," + rs.getString(2));
				if(rs.getString(1).equals(data)){
					if(rs.getString(2).equals(data2)){
						res=1;
						break;
					}
				}
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return res;
	}
	
	public int signup(String data,String data2){
		int res=-1;
		try{
			PreparedStatement pst=Connector.loginCon.prepareStatement("insert into login (id,password) values (?,?)");
			
			pst.setString(1, data);
			pst.setString(2, data2);
			
			res=pst.executeUpdate();		
			
		} catch (SQLException e) {
		e.printStackTrace();
		}
		
		return res;
	}

	public int insert(int id,String name,float salary){
		try {
			java.sql.PreparedStatement pst=Connector.con.prepareStatement("insert into employee values (?,?,?)");
			
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setFloat(3, salary);
			
			int res = pst.executeUpdate();
			
			return res;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public int delete(int id){
		try {
			PreparedStatement pst=Connector.con.prepareStatement("delete from employee where id = ?");
			
			pst.setInt(1, id);
			
			int res=pst.executeUpdate();
			System.out.println(res);
			return res;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return -1;
	}
	
	public int update(int id,String name,float salary){
		try {
			PreparedStatement pst=Connector.con.prepareStatement("update employee set name = ?, salary = ? where id = ?");
			pst.setString(1, name);
			pst.setFloat(2, salary);
			pst.setInt(3, id);
			
			int res=pst.executeUpdate();
			
			return res;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return -1;
	}
	
	public String[] search(int id){
		String[] value=null;
		try {
			java.sql.PreparedStatement pst=Connector.con.prepareStatement("select * from Employee where id = ?");
			
			pst.setInt(1, id);
			
			ResultSet rs=pst.executeQuery();
			
			
		//	System.out.println("ID\tName\tSalary");
			value =new String[3];
			
			while(rs.next()){
				
				value[0]=rs.getString(1);
				value[1]=rs.getString(2);
				value[2]=rs.getString(3);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return value;
	}
	
	public String[][] viewAll(){
		String[][] table=null;
		try {
			Statement st=Connector.con.createStatement();
			
			ResultSet rs=st.executeQuery("select * from employee");
			int count=0;
			while(rs.next())
				count++;
		//	rs.beforeFirst();
			 rs=st.executeQuery("select * from employee");
		//	System.out.println("Id\tName\tSalary");
			table=new String[count][3];
			int i=0;
			while(rs.next()){
				
				table[i][0]=rs.getString(1);
				table[i][1]=rs.getString(2);
				table[i][2]=rs.getString(3);
				
				i++;
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return table;
		
		
	}
}
