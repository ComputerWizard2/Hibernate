package com.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Student;
import com.util.HibrenateUtil;

public class BasicMethod {
		
	//插入数据的方法
public void update (){
	Session session =HibrenateUtil.getSession();
	Transaction transaction =session.beginTransaction();
	Student student =new Student();
	

	Serializable save = session.save(student);
	transaction.commit();
	session.close();
	
}

	//及时查询数据
	public void  testGet(){
		Session session =HibrenateUtil.getSession();
		Transaction transaction =session.beginTransaction();
		int id =1;
		Student student = session.get(Student.class, id);
		System.out.println(student);
		transaction.commit();
		session.close();
		
	}
	//延时查询
	public void testLoad(){
		
		Session session =HibrenateUtil.getSession();
		
		Transaction transaction =session.beginTransaction();
		Student load = session.load(Student.class, 1);	
		
		System.out.println(load);
		transaction.commit();
		session.close();
		
	}
	//设置更新
	public void testUpload(){
		Session session =HibrenateUtil.getSession();
		
		Transaction transaction =session.beginTransaction();
		//一般先查询一下，再设置更新的值
		Student student = session.get(Student.class, 1);
		student.setName("小花");
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
	//clear清除二级缓存的方法
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
	//student.setName("小花");
	
	session.flush();
	Student student1 = session.get(Student.class, 1);
	System.out.println(student1);
}
	
}
