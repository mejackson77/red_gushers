package myFirstBot;

import java.util.Scanner;

public class birthYearCalculator {

	public static void main(String[] args) {

		Scanner birthYearVerification = new Scanner(System.in);

		System.out.println("this calculater can tell you what decade you were born in");
		System.out.println("Please enter your age");

		int userEnteredNumber = birthYearVerification.nextInt();

		if (userEnteredNumber > 90 && userEnteredNumber < 100) {
			System.out.println("You were born in the 1920's. Yikes");
		}else if (userEnteredNumber > 80 && userEnteredNumber < 90) {
			System.out.println("You were born in the 1930's. Pretty old there bud");
		}else if (userEnteredNumber > 70 && userEnteredNumber < 80) {
			System.out.println("you were born in the 1940's. Are you rich yet?");
		}else if (userEnteredNumber > 60 && userEnteredNumber < 70) {
			System.out.println("you were born in the 1950's. Please tell me you're retired");
		}else if (userEnteredNumber > 50 && userEnteredNumber < 60) {
			System.out.println("you were born in the 1960's.");
		}else if (userEnteredNumber > 40 && userEnteredNumber < 50) {
			System.out.println("you were born in the 1970's. Ditch the fro bro");
		}else if (userEnteredNumber > 30 && userEnteredNumber < 40) {
			System.out.println("you were born in the 1980's. Blah");
		}else if (userEnteredNumber >= 20 && userEnteredNumber < 30) {
			System.out.println("you were born in the 1990's. Lit Bro!!");
		}else if (userEnteredNumber > 10 && userEnteredNumber < 20) {
			System.out.println("you were born in the 2000's. Generation Z. Eww");
		}else if (userEnteredNumber > 0 && userEnteredNumber < 10) {
				System.out.println("you were born in the 2010's. Dont dissapoint us");
		}else {
			System.out.println("Yuu sure you're human!!!");
		}

		
		
		
		
		
		
		
		
		
		
		
		}

	}

