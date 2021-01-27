package com.cts.cts2020;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper  implements RowMapper<Employee> {

	
	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		emp.setName(rs.getString(2), rs.getString(3));
		emp.setSalary(rs.getDouble("salary"));
		return emp;
	}

}
