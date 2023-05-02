package com.companyname.salaryslip.views;

import java.util.Scanner;
import com.companyname.salaryslip.model.EmpModel;

public class Empview {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Employee ID : ");
		int empID = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Employee name : ");
		String empName = scanner.nextLine();
		System.out.println("Enter Employee Salary : ");
		double empSalary = scanner.nextDouble();
		EmpModel ram = new EmpModel(empID, empName, empSalary);
		
		//HashCode
				System.out.println(ram);
				// internally it will call toString()

				//System.out.println(ram.toString());

//				System.out.println("Employee Id : " + ram.getEmpId());
//				System.out.println("Employee Name : " + ram.getName());
//				System.out.println("Employee Basic Salary : " + ram.getSalary());
//				System.out.println("Employee Net Payable Salary : " + ram.netSalary());
				
				scanner.close();
	}
}