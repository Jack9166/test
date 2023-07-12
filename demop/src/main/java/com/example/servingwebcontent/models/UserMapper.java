// package com.example.servingwebcontent.models;

// import java.sql.ResultSet;
// import java.sql.SQLException;
// import org.springframework.jdbc.core.RowMapper;
// import org.springframework.stereotype.Repository;

// @Repository
// public class UserMapper implements RowMapper<User> {
//     @Override
//     public User mapRow(ResultSet rs, int rowNum) throws SQLException {
//         User emp = new User();
//         emp.setName(rs.getString("name"));
//         emp.setEmail(rs.getString("email"));
//         emp.setUserId(rs.getInt("id"));
//         return emp;
//     }
// }
