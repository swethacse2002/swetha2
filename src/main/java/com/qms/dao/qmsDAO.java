package com.qms.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.qms.model.Quiz;

@Repository
public class qmsDAO {

	static ArrayList<Quiz> list = new ArrayList<Quiz>();

	public static boolean insert(Quiz bean) {
		list = new ArrayList<Quiz>();

		return list.add(bean);

	}

	public static ArrayList<Quiz> view() {
		return list;
	}
}

//	ArrayList<Quiz> list=new ArrayList<Quiz>();
//	public boolean addQuiz(Quiz bean) {
//		
//		list.add(bean);
//		return true;
//	}
//
//
//}
