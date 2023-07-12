// package com.example.servingwebcontent.services;
// import java.sql.ResultSet;
// 	import java.sql.SQLException;
// 	import java.util.List;
	
// 	import javax.sql.DataSource;
	
// 	import org.springframework.jdbc.core.JdbcTemplate;
// 	import org.springframework.jdbc.core.RowMapper;

// import com.example.servingwebcontent.models.address__districts;
// import com.example.servingwebcontent.interfaces.address__districts_interfaces;

// 	public class address__districts_ServicesImpl implements address__districts_interfaces{
	    
// 		private JdbcTemplate jdbcTemp;
	
// 	    public address__districts_ServicesImpl(DataSource dataSource) {
// 			jdbcTemp = new JdbcTemplate(dataSource);
// 		}
	
// 	    @Override
// 		public List<address__districts> address__districts_List() {
// 			List<address__districts> list = jdbcTemp.query("SELECT * FROM address__districts ", new RowMapper<address__districts>() {
	
// 				@Override
// 				public address__districts mapRow(ResultSet rs, int rowNum) throws SQLException {
// 					address__districts emp = new address__districts();
// 					emp.setName(rs.getString("name"));
// 					emp.setId(rs.getInt("code"));
// 					return emp;
// 				}
// 			});
	
// 			return list;
// 		}
	
// 	}