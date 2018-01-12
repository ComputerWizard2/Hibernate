package com.test;

import com.dao.BasicMethod;

public class TestHibernate {
	public static void main(String[] args) {
		
		BasicMethod basic =new BasicMethod();
		//插入操作
		basic.update();
		//查询操作
		//basic.testGet();
		//延迟查询
		//basic.testLoad();
		//更新操作
		//basic.testUpload();
		//删除操作
		//basic.testDelete();
		//缓存的使用
		 //basic.testClear();
		//flush 的方法的
		//basic.testFlush();
	}
}
