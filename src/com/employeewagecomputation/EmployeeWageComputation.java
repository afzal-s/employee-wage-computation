package com.employeewagecomputation;

import java.util.Random;

public class EmployeeWageComputation {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_WAGE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HOURS_IN_MONTH = 100;

	public static void main(String[] args) {
		int totalEmpHrs = 0, totalEmpWage = 0, totalWorkingDays = 0;

		while (totalEmpHrs <= MAX_HOURS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
			int empHrs = 0;
			totalWorkingDays++;

			Random num = new Random();
			int empCheck = num.nextInt(3);

			switch (empCheck) {
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
			}

			totalEmpHrs = totalEmpHrs + empHrs;
			System.out.println("Days:" + totalWorkingDays + " Employe Hour:" + empHrs);
		}

		totalEmpWage = totalEmpHrs * EMP_WAGE_PER_HOUR;
		System.out.println("Total Employee Wage: " + totalEmpWage);
	}

}
