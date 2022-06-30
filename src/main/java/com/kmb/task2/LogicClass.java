package com.kmb.task2;

import java.util.Hashtable;
import java.util.Map;

import org.json.simple.JSONObject;

public class LogicClass {
public static JSONObject EmployeeData(int empId) {
	
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
	//out.println(jobj);
		}
	}
	return null;
}
}
