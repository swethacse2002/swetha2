package com.qms;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.qms.dao.qmsDAO;
import com.qms.model.Quiz;

@SpringBootTest
class SbQuizProjectApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	 qmsDAO dao;
	Quiz bean=new Quiz(101,"English","Grammar",12,34,"ONE");
	
	@Test
   void testInsert() {
       dao = new qmsDAO();
       boolean expectedValue = true;
       boolean actualValue = dao.insert(bean);
       assertEquals(actualValue, expectedValue);
   }

}
