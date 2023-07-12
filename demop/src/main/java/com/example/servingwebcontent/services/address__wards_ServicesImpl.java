package com.example.servingwebcontent.services;
import java.sql.ResultSet;
	// import java.sql.SQLException;
	import java.util.List;
	
	import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
	// import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.example.servingwebcontent.models.address__wards;
import com.example.servingwebcontent.models.address__wards_Mapper;
import com.example.servingwebcontent.interfaces.address__wards_interfaces;

	@Service	
	public class address__wards_ServicesImpl implements address__wards_interfaces{
	    @Autowired
		private JdbcTemplate jdbcTemp;
	
	
	    @Override
		public List<address__wards> address__wards_List() {
			String sql = "SELECT * FROM address__wards ";
			List<address__wards> list = jdbcTemp.query(sql, new address__wards_Mapper());
	
			return list;
		}
	
	    public address__wards_ServicesImpl(DataSource dataSource) {
			jdbcTemp = new JdbcTemplate(dataSource);
		}
	}