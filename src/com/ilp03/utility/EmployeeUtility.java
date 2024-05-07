package com.ilp03.utility;

import java.util.Scanner;

import com.ilp03.service.EmployeeService;
import com.ilp03.service.EmployeeServiceImpl;

public class EmployeeUtility {

	public static void main(String[] args) {
		boolean continueQuerying = true;
		Scanner scanner = new Scanner(System.in);
		EmployeeService employeeservice = new EmployeeServiceImpl();
		while (continueQuerying) {
			System.out.println("*****Employee Health And Wellness Program*****"+"\n");
			System.out.println("Choose an option:");
            System.out.println("1. Insert values into employees, 2. Get values from employees,3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
            case 1:
            	
                employeeservice.insertIntoEmployees();
                break;
            case 2:
            	
                employeeservice.getEmployees();
                break;
            case 3:
                continueQuerying = false;
                break;
            default:
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
        }
    }

	}

}
