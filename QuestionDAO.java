package com.infinite.hibweb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class QuestionDAO {

	SessionFactory sessionFactory;
	
	 public String addQuestion(Question question){
		 sessionFactory = SessionHelper.getConnection();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(question);
			transaction.commit();
			return "Question Added Successsfully...";
	 }
}
