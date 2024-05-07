package com.ilp03.service;

import java.sql.Connection;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import com.ilp03.dao.EmployeeDAO;
import com.ilp03.entity.ParticipationRecords;

public class EmployeeServiceImpl implements EmployeeService {

	public void getEmployees() {
		try {
			Connection connection = EmployeeDAO.getConnection();
			Scanner scanner = new Scanner(System.in);
			System.out.println(
					"Enter the name of health activity (Yoga Class, Running Club, Power Zumba, Meditation, Pranayama):");
			String healthActivity = scanner.nextLine();

			System.out.println("Enter the location(Trivandrum, Ernakulam, Palakkad, Kollam, Thrissur)");
			String location = scanner.nextLine();
			ArrayList<ParticipationRecords> recordList = EmployeeDAO.getEmployeesBasedOnActivityAndLocation(connection,
					healthActivity, location);
			System.out.println("-------------------------------------------------------------------" + "\n");
			System.out.println(
					"First Name" + "\t" + "Last Name" + "\t" + "Address" + "  \t" + "Gender" + "\t" + "Status");
			for (ParticipationRecords records : recordList) {

				System.out.println(records.getEmployee().getFirstName() + "       \t"
						+ records.getEmployee().getLastName() + "       \t" + records.getEmployee().getAddress()
						+ "    \t" + records.getEmployee().getGender() + "     \t" + records.getStatus());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("-------------------------------------------------------------------" + "\n");
	}

	public void insertIntoEmployees() {
		try {
			Connection connection = EmployeeDAO.getConnection();
			Scanner scanner = new Scanner(System.in);
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

			System.out.println("Enter employee first name:");
			String firstName = scanner.nextLine();

			System.out.println("Enter employee last name:");
			String lastName = scanner.nextLine();

			System.out.println("Enter employee address:");
			String address = scanner.nextLine();

			System.out.println("Enter employee gender (M/F):");
			String gender = scanner.nextLine();

			System.out.println("Enter created by");
			int created_by = scanner.nextInt();
			System.out.println("Enter updated by");
			int updated_by = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter created date and time in the format yyyy-MM-dd HH:mm:ss:");
			String createdDate = scanner.nextLine();
			LocalDateTime dateTimeCreate = LocalDateTime.parse(createdDate, formatter);

			System.out.println("Enter updated date and time in the format yyyy-MM-dd HH:mm:ss:");
			String updatedDate = scanner.nextLine();
			LocalDateTime dateTimeUpdate = LocalDateTime.parse(updatedDate, formatter);

			EmployeeDAO.insertValuesToEmployees(connection, firstName, lastName, address, gender, created_by,
					updated_by, dateTimeCreate, dateTimeUpdate);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
