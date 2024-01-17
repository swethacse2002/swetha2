package com.qms.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qms.dao.qmsDAO;
import com.qms.model.Quiz;
//import com.service.Service;

@RestController
public class qmsController {

	@Autowired
	qmsDAO dao;

	public void performInsert(Quiz bean) {
		dao.insert(bean);
		System.out.println("Inserted");
		ArrayList<Quiz> list = dao.view();
		System.out.println(list);
	}
}

//@RestController
//@CrossOrigin(origins = "http://localhost:4200")
//@RequestMapping("/productRest/api")
//public class qmsController {
//	
//	@Autowired
//	Service service;
//	
//	@PostMapping("/quiz")
//	public boolean performInsert(@RequestBody Quiz bean) {
//		return service.addQuiz(bean);
//	}
//}
