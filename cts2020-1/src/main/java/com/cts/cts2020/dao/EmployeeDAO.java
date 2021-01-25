package com.cts.cts2020.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cts.cts2020.Employee;

public class EmployeeDAO {

	
	public Connection getConnection(){
		Connection con = null;
		try {
			con = DriverManager.
					getConnection("jdbc:mysql://localhost:3306/hr", "root", "full2work");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		 return con;
	}
	
	public List<Employee> getAllEmployees(){
		
		Connection con = getConnection();
		Statement st = null;
		List<Employee> eList = new ArrayList<>();
		try {
			st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from employees");
			while(rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getDate("hire_date"));
				
				Employee emp = new Employee();
				emp.setName(rs.getString(2), rs.getString(3));
				emp.setSalary(rs.getDouble("salary"));
				eList.add(emp);
				
				
			}
						
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			try {
				con.close();
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return eList;
		
	}
	
	public List<Employee> getEmpByLname(String lname){
		Connection con = getConnection();
		Statement st = null;
		List<Employee> eList = new ArrayList<>();
		
		String sql = "select * from employees e where e.last_name = ?"
				+ "and department_id = ? ";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,lname); // "Cambrault"
			ps.setInt(2, 80);
			
			ResultSet rs = ps.executeQuery();
			
			
			
			while(rs.next()) {
				Employee e = new Employee();
				e.setName(rs.getString(2), rs.getString(3));
				eList.add(e);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return eList;
	}
	
	//To do 
	// code getAllDepartments() write its test case also
	// get me all employees who lastname is "King", getEmployeesByLastName()
	// get me all emolyess whose lastname is "Cambrault" but use prepared statement
	// getEmpByLnameParameterized() -- preparedstatement
	// statement, preparedstatement, callableStatement;
	
	
	// transaction - set of statements that 
				// should rollback together or get committed to db together
				/* try {
				con.setAutoCommit(false);
				ps2.executeUpdate();
				ps3.executeUpdate();
				con.commit();
				}catch(Exception e) {
					con.rollback();
				}*/
	

}
