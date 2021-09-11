package com.employeewagecomputation;

import java.util.Random;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		int IS_FULL_TIME = 1;
		int EMP_WAGE_PER_HOUR = 20;

		int empHrs = 0;
		int empWage = 0;

		Random num = new Random();
		int empCheck = num.nextInt(2);

		if (empCheck == IS_FULL_TIME) {
			empHrs = 8;
		} else {
			empHrs = 0;
		}

		empWage = empHrs * EMP_WAGE_PER_HOUR;
		System.out.println("Employe Wage: " + empWage);
	}

}
