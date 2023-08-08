/*
 * Write a program to calculate an employee's salary based on the following criteria : 
 * 1. Accept the basic payment in the range of 4500 and 6500
 * 2. Calculate the DA-2% of basic, TA-1% of basic, hra-3% of basic.
 * 3. The employee is eligible for 0.5% of PF
 * 4. If the salary of an employee is more than 10000, he is eligible for 1000 rs deduction
 * 	  in account of professional tax.
 * 5. Also calculate the retrement date on the basis of age which is 55 years as the 
 * 	  standard of company.
 */

package assignment2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Assignment2 
{

	public static void main(String[] args) 
	{
		String name, address, dob;
		int age, retirementAge = 55;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		name = sc.nextLine();
		System.out.println("Enter the address : ");
		address = sc.nextLine();
		System.out.println("Enter your date of birth in yyyy-mm-dd format : ");
		dob = sc.nextLine();
		
		LocalDate birthDate = LocalDate.parse(dob);
		LocalDate todaysDate = LocalDate.now();
		age = Period.between(birthDate, todaysDate).getYears(); 
		LocalDate retirementDate = birthDate.plusYears(retirementAge);
		if(age < 18)
		{
			System.out.println("You are not eligible !");
			return;
		}
		
		System.out.println("Enter your salary details : ");
		float da_percent = 2f;
		float ta_percent = 1f;
		float hra_percent = 3f;
		float pf_percent = 0.5f;
		float professionalTax = 1000;
		float basicPayment;
		float totalSalary;
		System.out.println("Enter the basic payment between 4500 and 6500 : ");
		basicPayment = sc.nextFloat();
		if(basicPayment<4500 || basicPayment>6500)
		{
			if(basicPayment < 4500)
			{
				System.out.println("Basic Payment is low than the specified range !");
				return;
			}
			if(basicPayment > 6500)
			{
				System.out.println("Basic Payment is exceeding the specified range !");
				return;
			}
		}
		float DA = basicPayment * (da_percent/100);
		float TA = basicPayment * (ta_percent/100);
		float HRA = basicPayment * (hra_percent/100);
		float PF = basicPayment * (pf_percent/100);
		totalSalary = basicPayment + DA + TA + HRA - PF;
		if(totalSalary > 10000)
		{
			totalSalary -= professionalTax;
		}
		System.out.println("DA(Dearness Allowance) : "+DA);
		System.out.println("TA(Travelling Allowance) : "+TA);
		System.out.println("HRA(House Rent Allowance) : "+HRA);
		System.out.println("PF(Provident Fund) : "+PF);
		System.out.println("Total Salary : "+totalSalary);
	
		System.out.println("\n\n\n");
		System.out.println("----------------------------------------------");
		System.out.println("\tEmployee Details");
		System.out.println("\tName : "+name);
		System.out.println("\tAddress : "+address);
		System.out.println("\tDate Of Birth : "+birthDate);
		System.out.println("\tAge : "+age);
		System.out.println("\tRetirement Date : "+retirementDate);
		System.out.println("\tSalary : "+totalSalary);
		System.out.println("----------------------------------------------");
		

	}

}
