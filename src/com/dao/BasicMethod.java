package com.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Student;
import com.util.HibrenateUtil;

public class BasicMethod {
		
	//�������ݵķ���
public void update (){
	Session session =HibrenateUtil.getSession();
	Transaction transaction =session.beginTransaction();
	Student student =new Student();
	

	Serializable save = session.save(student);
	transaction.commit();
	session.close();
	
}

	//��ʱ��ѯ����
	public void  testGet(){
		Session session =HibrenateUtil.getSession();
		Transaction transaction =session.beginTransaction();
		int id =1;
		Student student = session.get(Student.class, id);
		System.out.println(student);
		transaction.commit();
		session.close();
		
	}
	//��ʱ��ѯ
	public void testLoad(){
		
		Session session =HibrenateUtil.getSession();
		
		Transaction transaction =session.beginTransaction();
		Student load = session.load(Student.class, 1);	
		
		System.out.println(load);
		transaction.commit();
		session.close();
		
	}
	//���ø���
	public void testUpload(){
		Session session =HibrenateUtil.getSession();
		
		Transaction transaction =session.beginTransaction();
		//һ���Ȳ�ѯһ�£������ø��µ�ֵ
		Student student = session.get(Student.class, 1);
		student.setName("С��");
		session.update(student);
		transaction.commit();
		session.close();
		
	}
	public void  testDelete(){
		Session session =HibrenateUtil.getSession();
		
		Transaction transaction =session.beginTransaction();
		Student student =new  Student();
		student.setId(1);
		session.delete(student);
		transaction.commit();
		session.close();
		
				
		
	}
	//clear�����������ķ���
	public void testClear(){
	Session session =HibrenateUtil.getSession();
	Transaction transaction =session.beginTransaction();
		Student student = session.get(Student.class, 2);
		System.out.println(student);
		//session.clear();
		Student student2 = session.get(Student.class, 2);
		System.out.println(student2);
		transaction.commit();
		session.close();
		
	}
public void testFlush(){
	Session session =HibrenateUtil.getSession();
	Transaction transaction =session.beginTransaction();
	Student student = session.get(Student.class, 2);
	System.out.println(student);
	//student.setName("С��");
	
	session.flush();
	Student student1 = session.get(Student.class, 1);
	System.out.println(student1);
}
	
}
