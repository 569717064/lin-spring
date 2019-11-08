package com.woniu.a_spring;

public class DAOFactory {
	public static DeptDAO getDeptDAO() {
		return new DeptDAO();
	}
}
