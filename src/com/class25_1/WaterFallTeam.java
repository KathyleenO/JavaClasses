package com.class25_1;

import com.class25.Employee;

public class WaterFallTeam extends Employee {

	public static void main(String[] args) {
		

		
		WaterFallTeam team=new WaterFallTeam();
		team.companyName="Syntax";   //PUBLIC CAN ACCESS
		team.employeedID=101;//accessing protected 
		//team.salary  DEAAULT NOT AVAILABLE
		//team.employeeSSN private NOT AVAIABLE
		
	}

}
