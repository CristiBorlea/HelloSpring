package com.javapoint;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveEmployee(Employee e) {
		String query = "insert into employee values('" + e.getId() + "','" + e.getName() + "','" + e.getSalary() + "')";
		return jdbcTemplate.update(query);
	}

	public int updateEmployee(Employee e) {
		String query = "update employee set name" + e.getName() + "',salary='" + e.getSalary() + "' where id='"
				+ e.getId() + "' ";
		return jdbcTemplate.update(query);
	}

	public int deleteEmployee(Employee e) {
		String query = "delete from employee where id='" + e.getId() + "' ";
		return jdbcTemplate.update(query);
	}

	public List<Employee> getEmployee(String name) {
		String query = "select * from employee where name='" + name + "' ";
		List<Employee> list1 = jdbcTemplate.query(query, new RowMapper<Employee>() {
			@Override
			public Employee mapRow(ResultSet rs, int rownumber) throws SQLException {

				return new Employee(rs.getInt(1), rs.getString(2), rs.getBigDecimal(3));
			}
		});
		return list1;
	}

	public List<Employee> getAll() {
		String query = "select * from employee";
		List<Employee> list = jdbcTemplate.query(query, new RowMapper<Employee>() {
			@Override
			public Employee mapRow(ResultSet rs, int rownumber) throws SQLException {

				return new Employee(rs.getInt(1), rs.getString(2), rs.getBigDecimal(3));
			}
		});
		return list;

	}

}