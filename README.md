# Hibernate
使用了Hibernate进行方法的简单测试
- 主要使用了hibernate 对数据库进行增删改查的相关的操作，
- hibernate 进行对数据库的方式主要有四种：
- 基本操作
sava() 数据的插入的操作
get(及时加载) 和 load（延时加载）
update (更新操作)
DELETE (删除操作)
clear（清空缓存） 这里扩展一下（mybatis中的清空缓存的方式：flushCache="true" useCache="false"）
flush 将缓存中数据强行刷入到数据库中
- HQL 基本操作
主要使用了query的一个对象，而HSQL和sql差不多的值不够他将表的字段和表的名都替换为了实体类和实体类的属性
-criteria通过session获取当前的critria 的对象封装了一系列的方法来操作数据
- sqlquery 来操作数据通过原生的sql来进行数据的操作
