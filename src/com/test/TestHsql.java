package com.test;

import com.dao.HsqlMthod;

public class TestHsql {
	public static void main(String[] args) {
		HsqlMthod hsqlMthod =new HsqlMthod();
		//查询全部的方法
		//hsqlMthod.select();
		//条件查询
		//hsqlMthod.selectwhere();
		//模糊查询
		//hsqlMthod.selectLike();
		//分页查询
		//hsqlMthod.selectByPage();
		//聚合函数
		//hsqlMthod.selectCount();
		//hsqlMthod.selectColumn();
		hsqlMthod.update();
	}
	
}
