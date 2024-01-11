package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.model.Employee;

public class EmpDaoImpl implements EmpDao {

	static Connection conn;
	static PreparedStatement selemp, insemp, selById, upemp, delById;
	static {
		try {
			conn = DBUtil.getMyConnection();
			selemp = conn.prepareStatement("select * from empnew");
			insemp = conn.prepareStatement("insert into empnew values(?,?,?)");
			selById = conn.prepareStatement("select * from empnew where eid = ?");
			upemp = conn.prepareStatement("update empnew set ename = ?,sal = ? where eid = ?");
			delById = conn.prepareStatement("delete from empnew where eid=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Employee> getAllEmp() {
		List<Employee> list = new ArrayList<>();

		try {
			ResultSet rs = selemp.executeQuery();
			while (rs.next()) {
				Employee e = new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3));
				list.add(e);
				System.out.println(e);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void save(Employee e) {
		try {
			insemp.setInt(1, e.getEid());
			insemp.setString(2, e.getEname());
			insemp.setDouble(3, e.getSal());
			insemp.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@Override
	public Employee FindById(int empid) {
		// TODO Auto-generated method stub
		Employee e = null;
		try {
			selById.setInt(1, empid);
			ResultSet rs = selById.executeQuery();
			while (rs.next()) {
				e = new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3));
				System.out.println("Found emp " + e);
			}
			return e;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return null;
	}

	@Override
	public void UpdateEmp(Employee e) {
		try {
			upemp.setString(1, e.getEname());
			upemp.setDouble(2, e.getSal());
			upemp.setInt(3, e.getEid());
			upemp.executeUpdate();

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	@Override
	public void DeleteById(int eid) {
		// TODO Auto-generated method stub
		try {
			delById.setInt(1, eid);
			delById.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
