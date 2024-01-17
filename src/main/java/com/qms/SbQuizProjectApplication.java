package com.qms;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.qms.controller.qmsController;
import com.qms.dao.qmsDAO;
import com.qms.model.Quiz;

@SpringBootApplication
public class SbQuizProjectApplication {

	static qmsDAO dao=new qmsDAO();
	   public  Quiz menu()
	   {
	       Scanner sc=new Scanner(System.in);
	       System.out.println("Enter Id, Title, category, No of ques, Marks, Time");
	      
	       return new Quiz(sc.nextInt(),sc.next(),sc.next(),sc.nextInt(),sc.nextInt(),sc.next());
	   }

	public static void main(String[] args) {
		SpringApplication.run(SbQuizProjectApplication.class, args);
		
		SbQuizProjectApplication obj = new SbQuizProjectApplication();
	       Quiz bean =obj.menu();
	         
	          
	           qmsController control=new qmsController();
	           control.performInsert(bean);
	         

	}

}
