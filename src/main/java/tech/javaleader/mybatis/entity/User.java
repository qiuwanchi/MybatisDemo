package tech.javaleader.mybatis.entity;

public class User {
	
	private long id;
	private String userName;
	private String password;
	private String email;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		sb.append("id=").append(id)
		.append(",userName=").append(userName)
		.append(",password=").append(password)
		.append(",email=").append(email);
		sb.append("]");
		return sb.toString();
	}
}
