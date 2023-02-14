package com.branch;

import java.util.Scanner;

public class Months {

	public static void main(String[] args) {
		
		String month;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER MONTH OF THE YEAR");
		month=sc.next();
		switch(month) {
		case "january": System.out.println("FIRST MONTH OF THE YEAR");
		break;
		case "february" : System.out.println("SECOND MONTH OF THE YEAR");
		break;
		case "march":System.out.println("THIRD MONTH OF THE MONTH");
		break;
		case "april":System.out.println("FOURTH MONTH OF THE YEAR");
		break;
		case "may":System.out.println("FIFTH MONTH OF THE YEAR");
		break;
		case "june":System.out.println("SIXTH MONTH OF THE YEAR");
		break;
		case "july":System.out.println("SEVENTH MONTHOF THE YEAR");
		break;
		case "august": System.out.println("EIGHTH MONTH OF THE YEAR");
		break;
		case "september":System.out.println("ninth month of the year");
		break;
		case "october":System.out.println("TENTH MONTH OF THE YEAR");
		break;
		case "november":System.out.println("ELEVENTH MONTH OF THE YEAR");
		break;
		case "december":System.out.println("TWELVETH MONTH OF THE YEAR");
		break;
		default : System.out.println("invalid");
		}

		

	}

}
