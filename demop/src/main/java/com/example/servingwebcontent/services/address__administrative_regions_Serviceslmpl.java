// package com.example.servingwebcontent.services;
// import java.sql.ResultSet;
// 	import java.sql.SQLException;
// 	import java.util.List;
	
// 	import javax.sql.DataSource;
	
// 	import org.springframework.jdbc.core.JdbcTemplate;
// 	import org.springframework.jdbc.core.RowMapper;

// import com.example.servingwebcontent.models.address__administrative_regions;
// import com.example.servingwebcontent.interfaces.address__administrative_regions_interfaces;

// 	public class address__administrative_regions_Serviceslmpl implements address__administrative_regions_interfaces{
	    
// 		private JdbcTemplate jdbcTemp;
	
// 	    public address__administrative_regions_Serviceslmpl(DataSource dataSource) {
// 			jdbcTemp = new JdbcTemplate(dataSource);
// 		}
	
// 	    @Override
// 		public List<address__administrative_regions> address__administrative_regions_List() {
// 			List<address__administrative_regions> list = jdbcTemp.query("SELECT * FROM address__administrative_regions ", new RowMapper<address__administrative_regions>() {
	
// 				@Override
// 				public address__administrative_regions mapRow(ResultSet rs, int rowNum) throws SQLException {
// 					address__administrative_regions emp = new address__administrative_regions();
// 					emp.setName(rs.getString("name"));
// 					emp.setId(rs.getInt("code"));
// 					return emp;
// 				}
// 			});
	
// 			return list;
// 		}
	
// 	}