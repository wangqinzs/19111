package com.st.bean;

import java.util.List;

public class BuMen {
@Override
	public String toString() {
		return "BuMen [name=" + name + ", boss=" + boss + ", userlist=" + userlist + "]";
	}
private String name;//部门
private User boss;//经理
private List userlist;//员工列表
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public User getBoss() {
	return boss;
}
public void setBoss(User boss) {
	this.boss = boss;
}
public List getUserlist() {
	return userlist;
}
public void setUserlist(List userlist) {
	this.userlist = userlist;
}

}
