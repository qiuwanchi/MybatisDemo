package tech.javaleader.mybatis.dao;

import tech.javaleader.mybatis.entity.User;

public interface UserMapper {

	public User getUserById(long id);
	
	public int insertUser(User user);
}
