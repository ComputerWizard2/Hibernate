package com.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.model.Student;
import com.util.HibrenateUtil;

public class CriteriaDao {
	public void  select(){
		Session session =HibrenateUtil.getSession();
		Transaction transaction =session.beginTransaction();
		Criteria criteria =session.createCriteria(Student.class);
		//添加查询条件
		criteria.add(Restrictions.eq("name", "小花"));
		criteria.add(Restrictions.lt("score",550f ));
		List<Student> list =criteria.list();
		System.out.println(list);
		transaction.commit();
		session.close();
		
	}
}
