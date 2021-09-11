package com.employeewagecomputation;

import java.util.Random;

public class EmployeeWageComputation {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_WAGE_PER_HOUR = 20;

	public static void main(String[] args) {
		int empHrs = 0;
		int empWage = 0;

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

		empWage = empHrs * EMP_WAGE_PER_HOUR;
		System.out.println("Employe Wage: " + empWage);
	}

}
