package com.example.servingwebcontent.models;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class address__wards_Mapper implements RowMapper<address__wards>{
    @Override
	public address__wards mapRow(ResultSet rs, int rowNum) throws SQLException {
		address__wards emp = new address__wards();
		emp.setName(rs.getString("name"));
		emp.setId(rs.getInt("code"));
		return emp;
		}
}
