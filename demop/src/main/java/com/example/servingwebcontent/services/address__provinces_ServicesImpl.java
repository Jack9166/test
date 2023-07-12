
	// package com.example.servingwebcontent.services;
	// import java.sql.ResultSet;
	// import java.sql.SQLException;
	// import java.util.List;
	
	// import javax.sql.DataSource;
	
	// import org.springframework.jdbc.core.JdbcTemplate;
	// import org.springframework.jdbc.core.RowMapper;
	
	// import com.example.servingwebcontent.interfaces.address__provinces_Interface;
	// import com.example.servingwebcontent.models.address__provinces;
	// public class address__provinces_ServicesImpl implements address__provinces_Interface{
	    
	// 	private JdbcTemplate jdbcTemp;
	
	//     public address__provinces_ServicesImpl(DataSource dataSource) {
	// 		jdbcTemp = new JdbcTemplate(dataSource);
	// 	}
	
	//     @Override
	// 	public List<address__provinces> address__provinces_List() {
	// 		List<address__provinces> list = jdbcTemp.query("SELECT * FROM address__provinces ", new RowMapper<address__provinces>() {
	
	// 			@Override
	// 			public address__provinces mapRow(ResultSet rs, int rowNum) throws SQLException {
	// 				address__provinces emp = new address__provinces();
	// 				emp.setName(rs.getString("name"));
	// 				emp.setId(rs.getInt("code"));
	// 				return emp;
	// 			}
	// 		});
	
	// 		return list;
	// 	}
	
	// }