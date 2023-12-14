package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	static Connection conn;
	static PreparedStatement findsorted,selectprod,insprod,selectbypid,delbyid,upbyid;
	static {
		try {
			conn=DBUtil.getMyConnection();

			selectprod=conn.prepareStatement("select * from Employee");
			insprod=conn.prepareStatement("insert into Employee values(?,?,?,?)");
			selectbypid=conn.prepareStatement("select * from Employee where eid=?");
			delbyid=conn.prepareStatement("delete from Employee where eid=?");
			upbyid=conn.prepareStatement("update Employee set ename=?,dept=?,salary=? where eid=?");
			findsorted=conn.prepareStatement("select * from Employee order by salary");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	@Override
	public List<Employee> findAll() {
		List<Employee> plist=new ArrayList<>();
		try {
			ResultSet rs=selectprod.executeQuery();
			while(rs.next()) {
			    plist.add(new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4)));
			}
			return plist;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public void save(Employee p) {
		try {
			insprod.setInt(1, p.getEid());
			insprod.setString(2,p.getEname());
			insprod.setString(3, p.getDept());
			insprod.setDouble(4,p.getSalary());
			int n=insprod.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}


	@Override
	public Employee findById(int id) {
		try {
			selectbypid.setInt(1, id);
			ResultSet rs=selectbypid.executeQuery();
			if(rs.next()) {
				return new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public boolean removeById(int id) {
		try {
			delbyid.setInt(1, id);
			int n=delbyid.executeUpdate();
			if(n>0)
				return true;
			else
				return false;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
		
	}


	@Override
	public boolean updateById(int id, String pnm, String qty, double price) {
		try {
			upbyid.setString(1,pnm);
			upbyid.setString(2,qty);
			upbyid.setDouble(3,price);
			upbyid.setInt(4,id);
			int n=upbyid.executeUpdate();
			if(n>0)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
		
	}


	@Override
	public List<Employee> findSorted() {
		List<Employee> plist=new ArrayList<>();
		try {
			ResultSet rs=findsorted.executeQuery();
			while(rs.next()) {
				 plist.add(new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4)));
				
			}
			return plist;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}


	@Override
	public void closeConnection() {
		DBUtil.closeMyConnection();
		
	}

	
	
	
	
}
