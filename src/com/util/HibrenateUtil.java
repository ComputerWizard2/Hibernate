package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * hibernate�Ĺ�����
 * ���ڹ���sessionFactoy �Լ���ȡsession
 * @author Administrator
 *
 */

public class HibrenateUtil {
	//�������ö������ڶ�ȡhibernate �������ļ�
	static Configuration cfg=null;
	//SessionFactory 
	static SessionFactory sessionFactory =null;
	static{
		//1. ʹ��Configuraation ��ȡ�����ļ���Ĭ�϶�ȡ����
		//Ĭ�ϵĶ�ȡ����src�ȵĽ���hibernate.cfg.xml���ļ�
		cfg=new Configuration();
		cfg.configure();
		//2. ����SessionFactory
		sessionFactory=cfg.buildSessionFactory();
	}
	/**
	 * �ṩ��ȡsession �ķ���
	 * 
	 */
	public static Session getSession ()
	{
		return sessionFactory.getCurrentSession();
		
	}
}
