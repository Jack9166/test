package com.example.servingwebcontent.controllers;

import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

// import com.example.servingwebcontent.models.User;
import com.example.servingwebcontent.models.address__administrative_regions;
import com.example.servingwebcontent.models.address__administrative_units;
// import com.example.servingwebcontent.interfaces.UserInterface;
// import com.example.servingwebcontent.interfaces.address__administrative_regions_interfaces;
// import com.example.servingwebcontent.interfaces.address__administrative_units_interfaces;
import com.example.servingwebcontent.models.address__districts;
// import com.example.servingwebcontent.interfaces.address__districts_interfaces;

import com.example.servingwebcontent.models.address__provinces;
import com.example.servingwebcontent.models.address__wards;
// import com.example.servingwebcontent.interfaces.address__provinces_Interface;
import com.example.servingwebcontent.interfaces.address__wards_interfaces;

@Controller
public class MyController {
// @Autowired
// @Qualifier("UserServiceslmpl")
// 	private UserInterface userInterface;

// 	@RequestMapping(value = "/api/index", method = RequestMethod.GET)
// 	@ResponseBody
// 	public ResponseEntity<List<User>> listEmployee(ModelAndView model) throws IOException {
// 		List<User> listUsers = userInterface.userList();
// 		return ResponseEntity.status(HttpStatus.ACCEPTED).body(listUsers);
// 		// return listUsers;
// 	}

	// @Autowired
	// private address__provinces_Interface address__provinces_Interface;

	// @RequestMapping(value = "/api/get/address__provinces", method = RequestMethod.GET)
	// @ResponseBody
	// public ResponseEntity<List<address__provinces>> list_provinces(ModelAndView model) throws IOException {

	// 	List<address__provinces> list_provinces = address__provinces_Interface.
	// 	address__provinces_List();
	// 	return ResponseEntity.status(HttpStatus.ACCEPTED).body(list_provinces);
	// }

	// @Autowired
	// private address__districts_interfaces address__districts_Interface;

	// @RequestMapping(value = "/api/get/address__districts", method = RequestMethod.GET)
	// @ResponseBody
	// public ResponseEntity<List<address__districts>> list_address__districts(ModelAndView model) throws IOException {

	// 	List<address__districts> list_address__districts = address__districts_Interface.address__districts_List();
	// 	return ResponseEntity.status(HttpStatus.ACCEPTED).body(list_address__districts);
	// }

	@Autowired
	private address__wards_interfaces address__wards_interfaces;

	@RequestMapping(value = "/api/get/address__wards", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<address__wards>> address__wards_List(ModelAndView model) throws IOException {

		List<address__wards> list_setting__categories = address__wards_interfaces.address__wards_List();
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(list_setting__categories);
	}

	// @Autowired
	// private address__administrative_units_interfaces address__administrative_units_interfaces;

	// @RequestMapping(value = "/api/get/address__administrative_units", method = RequestMethod.GET)
	// @ResponseBody
	// public ResponseEntity<List<address__administrative_units>> list_address__administrative_units(ModelAndView model) throws IOException {

	// 	List<address__administrative_units> list_setting__categories = address__administrative_units_interfaces.address__administrative_units_List();
	// 	return ResponseEntity.status(HttpStatus.ACCEPTED).body(list_setting__categories);
	// }

	// @Autowired
	// private address__administrative_regions_interfaces address__administrative_regions_interfaces;

	// @RequestMapping(value = "/api/get/address__administrative_regions", method = RequestMethod.GET)
	// @ResponseBody
	// public ResponseEntity<List<address__administrative_regions>> list_address__administrative_regions(ModelAndView model) throws IOException {

	// 	List<address__administrative_regions> list_setting__categories = address__administrative_regions_interfaces.address__administrative_regions_List();
	// 	return ResponseEntity.status(HttpStatus.ACCEPTED).body(list_setting__categories);
	// }
}