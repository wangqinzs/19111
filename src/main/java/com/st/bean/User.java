package com.st.bean;

public class User {
	public User() {
		super();
	}

	private String username;
	private String sex;
	private int age;

	@Override
	public String toString() {
		return "User [username=" + username + ", sex=" + sex + ", age=" + age + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}
