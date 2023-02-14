package com.stack;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMapOp {

	public static void main(String[] args) {

		
			Map<Integer,String>mp=new HashMap<Integer, String>();
			mp.put(1111, "Manoj");
			mp.put(1112, "Spoorati");
			System.out.println(mp);
			
			//get the employee name whose id is 1111
			System.out.println("Employee name="+mp.get(1111));
			mp.remove(1111);
			System.out.println(mp);
			

	}

}
