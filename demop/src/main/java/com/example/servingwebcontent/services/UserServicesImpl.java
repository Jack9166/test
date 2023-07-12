// package com.example.servingwebcontent.services;

// import java.util.List;

// import javax.sql.DataSource;

// import org.springframework.stereotype.Service;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.jdbc.core.JdbcTemplate;

// import com.example.servingwebcontent.interfaces.UserInterface;
// import com.example.servingwebcontent.models.User;
// import com.example.servingwebcontent.models.UserMapper;
// @Service
// public class UserServicesImpl implements UserInterface {

//     private JdbcTemplate jdbcTemp;

//   @Autowired
//   private UserMapper userMapperMaster;
//   private String sql ="SELECT * FROM users";
//     public UserServicesImpl(DataSource dataSource) {
// 			jdbcTemp = new JdbcTemplate(dataSource);
// 	}
    
//     @Override
//     public List<User> userList() {
//         List<User> list = jdbcTemp.query(sql,  userMapperMaster);

//         return list;
//     }
// }
