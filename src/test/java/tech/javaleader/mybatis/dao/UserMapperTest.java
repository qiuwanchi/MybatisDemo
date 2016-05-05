package tech.javaleader.mybatis.dao;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;

import tech.javaleader.mybatis.entity.User;

public class UserMapperTest {

	Logger logger = Logger.getLogger(this.getClass());
	
	@Test
	public void testGetUserById() throws IOException {
		String resource = "mybatis-config.xml";
		Reader reader = Resources.getResourceAsReader(resource);
		SqlSessionFactory factory =new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = factory.openSession();
		
		User user = session.selectOne("tech.javaleader.mybatis.dao.UserMapper.getUserById", 1L);
		
		logger.debug(user);
		
		session.close();
		
	}
	
	@Test
	public void testGetUserById2() throws IOException {
		String resource = "mybatis-config.xml";
		Reader reader = Resources.getResourceAsReader(resource);
		SqlSessionFactory factory =new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = factory.openSession();
		
		UserMapper userMapper = session.getMapper(UserMapper.class);
		
		User user = userMapper.getUserById(1);
		
		logger.debug(user);
		
		session.close();
		
	}

	
	@Test
	public void testInsertUser() throws IOException {
		String resource = "mybatis-config.xml";
		Reader reader = Resources.getResourceAsReader(resource);
		SqlSessionFactory factory =new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = factory.openSession(true);
		
		UserMapper userMapper = session.getMapper(UserMapper.class);
		
		User user = new User();
		user.setUserName("qiuwanchi");
		user.setPassword("password");
		user.setEmail("email");
		
		userMapper.insertUser(user);
		
		session.close();
		logger.debug(user);
		
	}

}
