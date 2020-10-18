package assignment_4;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		System.out.println("enter weight");
		Scanner scan = new Scanner(System.in);
		int weight = scan.nextInt();
		System.out.println("enter your height in feetfollowed by space and inches");
		int heightf = scan.nextInt();
		int heighti = scan.nextInt();
		double weightInKg = weight*10/22;
		double heightInM = (heightf*12+heighti)*0.0254;
		double bmi=weightInKg/(heightInM*heightInM);
		String risk = (bmi>=18.5) ? (bmi>=25) ? (bmi>=30) ? "Obese" : "Overweight" : "Normal Weight" : "Underweight";
		System.out.println("Your weight in pounds: "+weight);
		System.out.println("Your height in feet and inches "+heightf+" "+heighti);
		System.out.println("Your BMI is "+bmi);
		System.out.println("Your risk factor is "+risk);


		}	
		}