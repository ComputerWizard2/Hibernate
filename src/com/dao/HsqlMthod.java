package com.dao;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.omg.CORBA.PUBLIC_MEMBER;

import com.model.Student;
import com.util.HibrenateUtil;

public class HsqlMthod {
	
	public void select(){
		Session session = HibrenateUtil.getSession();
		Transaction transaction =session.beginTransaction();
		String sql ="from Student";
		Query query =session.createQuery(sql);
		List list = query.list();
		System.out.println(list);
		transaction.commit();
		session.close();
	}
	public void selectwhere(){
		Session session = HibrenateUtil.getSession();
		Transaction transaction =session.beginTransaction();
		String sql ="from Student where name =? and score = ?";
		Query query =session.createQuery(sql);
		query.setParameter(0, "С��");
		query.setParameter(1, 223f);
		List resultList = query.getResultList();
		System.out.println(resultList);
		transaction.commit();
		session.close();
	}
	/**
	 * ģ����ѯ
	 */
	public void selectLike(){
		Session session = HibrenateUtil.getSession();
		Transaction transaction =session.beginTransaction();
		String sql = "from Student where name  like concat ('%',?,'%')";
		Query query =session.createQuery(sql);
		query.setParameter(0, "��");
		List<Student> list =query.list();
		System.out.println(list);
		transaction.commit();
		session.close();
	}
	/**
	 * ��ҳ��ѯ
	 */
	public void selectByPage(){
		Session session = HibrenateUtil.getSession();
		Transaction transaction =session.beginTransaction();
		String sql ="from Student";
		Query query =session.createQuery(sql);
		query.setFirstResult(0);
		query.setMaxResults(2);
		System.out.println(query.list());
		transaction.commit();
		session.close();
		
	}
	/**
	 * �ۺϺ���
	 */
	public  void  selectCount(){
		Session session =HibrenateUtil.getSession();
		Transaction transaction =session.beginTransaction();
		String sql ="select count(*) from Student where score =?";
		Query query = session.createQuery(sql);
		query.setParameter(0, 223f);
		//�ͷ���һ�����ʹ���������
		Object uniqueResult = query.uniqueResult();
		System.err.println(uniqueResult);
		transaction.commit();
		session.close();
		
	}
	//��ѯ����
	public void  selectColumn(){
		Session session =HibrenateUtil.getSession();
		Transaction transaction =session.beginTransaction();
		String sql ="select name,score,sex from Student";
		Query query = session.createQuery(sql);
		List<Object[]> list = query.list();
		for (Object[] object : list) {
			System.out.println(Arrays.toString(object));
			
		}
	
		
		
		
	}
	
	//ɾ�����޸�
	public void update(){
		Session session =HibrenateUtil.getSession();
		Transaction transaction =session.beginTransaction();
		String sql ="update Student set name = ? where id =?";
		Query query =session.createQuery(sql);
		query.setParameter(0, "��������");
		query.setParameter(1, 3);
		System.out.println(query.executeUpdate());
		transaction.commit();
		session.close();
		
	}
}
