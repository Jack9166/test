// package com.example.servingwebcontent.services;
// import java.sql.ResultSet;
// 	import java.sql.SQLException;
// 	import java.util.List;
	
// 	import javax.sql.DataSource;
	
// 	import org.springframework.jdbc.core.JdbcTemplate;
// 	import org.springframework.jdbc.core.RowMapper;

// import com.example.servingwebcontent.models.address__administrative_units;
// import com.example.servingwebcontent.interfaces.address__administrative_units_interfaces;

// 	public class address__administrative_units_Serviceslmpl implements address__administrative_units_interfaces{
	    
// 		private JdbcTemplate jdbcTemp;
	
// 	    public address__administrative_units_Serviceslmpl(DataSource dataSource) {
// 			jdbcTemp = new JdbcTemplate(dataSource);
// 		}
	
// 	    @Override
// 		public List<address__administrative_units> address__administrative_units_List() {
// 			List<address__administrative_units> list = jdbcTemp.query("SELECT * FROM address__administrative_units ", new RowMapper<address__administrative_units>() {
	
// 				@Override
// 				public address__administrative_units mapRow(ResultSet rs, int rowNum) throws SQLException {
// 					address__administrative_units emp = new address__administrative_units();
// 					emp.setName(rs.getString("name"));
// 					emp.setId(rs.getInt("code"));
// 					return emp;
// 				}
// 			});
	
// 			return list;
// 		}
	
// 	}