package com.woniu.a_spring;

public class DeptService {
	private DeptDAO deptDAO;
	
	public DeptService() {
		
	}
	
	public DeptService(DeptDAO deptDAO) {
		this.deptDAO = deptDAO;   	
	}
	
	public void setDeptDAO(DeptDAO deptDAO) {
		this.deptDAO = deptDAO;      
		System.out.println("DeptService.setDeptDAO()");
	}
	public void list() {
		System.out.println("DeptService.list()");
	}
}
