package com.kmb.task2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Hashtable;
import java.util.Map;

import org.json.simple.JSONObject;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EmpDetails extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public EmpDetails() {
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("application/json");
		int empId = Integer.parseInt(request.getParameter("empId"));
		//LogicClass.EmployeeData(empId);
	
		Hashtable<Integer, Employee> ht = new Hashtable<>();

		Employee obj = new Employee(101, "sathish", 22000, 2001);
		Employee obj1 = new Employee(102, "raina", 22500, 2002);
		Employee obj2 = new Employee(103, "vishal", 22600, 2003);
		ht.put(101, obj);
		ht.put(102, obj1);
		ht.put(103, obj2);
		JSONObject jobj=new JSONObject();
		//System.out.println(ht);
		for (Map.Entry<Integer, Employee> entry : ht.entrySet()) {
			int key = entry.getKey();
			//Employee b = entry.getValue();
	if(key==empId) {
		Employee b1=ht.get(empId);
		
		jobj.put("ID", b1.empId);
		jobj.put("NAME", b1.empName);
		jobj.put("SALARY", b1.empSal);
		jobj.put("DEPT_CODE", b1.DeptCode);
		System.out.println(jobj);
		out.println(jobj);
			}
		}
	}
}
