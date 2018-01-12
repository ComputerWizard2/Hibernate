package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * hibernate的工具类
 * 用于龚建sessionFactoy 以及获取session
 * @author Administrator
 *
 */

public class HibrenateUtil {
	//初见配置对象，用于读取hibernate 的配置文件
	static Configuration cfg=null;
	//SessionFactory 
	static SessionFactory sessionFactory =null;
	static{
		//1. 使用Configuraation 读取配置文件，默认读取的是
		//默认的读取的是src先的叫做hibernate.cfg.xml的文件
		cfg=new Configuration();
		cfg.configure();
		//2. 创建SessionFactory
		sessionFactory=cfg.buildSessionFactory();
	}
	/**
	 * 提供获取session 的方法
	 * 
	 */
	public static Session getSession ()
	{
		return sessionFactory.getCurrentSession();
		
	}
}
