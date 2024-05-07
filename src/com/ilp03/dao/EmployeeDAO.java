package com.ilp03.dao;

import java.sql.Timestamp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;

import com.ilp03.entity.Employees;
import com.ilp03.entity.ParticipationRecords;

public class EmployeeDAO {
	
	public static Connection getConnection() {
		String connectionString = "jdbc:mysql://localhost:3306/employeewellness_db?useSSL=false";
		String userName = "root";
		String password = "Jaymolk@12345";

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(connectionString, userName, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	public static void closeConnection(Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static ArrayList<ParticipationRecords> getEmployeesBasedOnActivityAndLocation(Connection connection,
			String activityName, String locationName) {
		ArrayList<ParticipationRecords> recordList = new ArrayList<ParticipationRecords>();
		try {
			PreparedStatement statement;
			statement = connection.prepareStatement(
					"select e.employee_firstname, e.employee_lastname, e.address, e.gender,pr.status from employees e inner join participation_records pr on e.id= pr.employee_id inner join health_activities ha on ha.id = pr.activity_id inner join location l on l.id = pr.location_id where ha.activity_name = ? and l.location_name = ?");
			statement.setString(1, activityName);
			statement.setString(2, locationName);
			ResultSet resultset = statement.executeQuery();
			while (resultset.next()) {
				String employeeFirstName = resultset.getString("employee_firstname");
				String employeeLastName = resultset.getString("employee_lastname");
				String address = resultset.getString("address");
				// String gender = resultset.getString("gender");
				Employees.Gender gender = Employees.Gender.valueOf(resultset.getString("gender"));
				ParticipationRecords.Status status = ParticipationRecords.Status.valueOf(resultset.getString("status"));
				Employees employee = new Employees();
				employee.setFirstName(employeeFirstName);
				employee.setLastName(employeeLastName);
				employee.setAddress(address);
				employee.setGender(gender);
				ParticipationRecords participationrecords = new ParticipationRecords();
				participationrecords.setStatus(status);
				participationrecords.setEmployee(employee);
				recordList.add(participationrecords);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return recordList;
	}

	public static void insertValuesToEmployees(Connection connection, String firstName, String lastName, String address,
			String gender, int created_by, int updated_by, LocalDateTime createdDate, LocalDateTime updatedDate) {
		try {
			PreparedStatement statement = connection.prepareStatement(
					"insert into  employees (employee_firstname, employee_lastname, address, gender, created_by, updated_by, created_date, updated_date) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
			statement.setString(1, firstName);
			statement.setString(2, lastName);
			statement.setString(3, address);
			statement.setString(4, gender);
			statement.setInt(5, created_by);
			statement.setInt(6, updated_by);
			statement.setTimestamp(7, Timestamp.valueOf(createdDate));
			statement.setTimestamp(8, Timestamp.valueOf(updatedDate));
			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("Employee data inserted successfully!");
			} else {
				System.out.println("Failed to insert employee data.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
