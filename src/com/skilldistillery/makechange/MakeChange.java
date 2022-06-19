package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter item price...");
		
		double price = sc.nextDouble();
		
		System.out.println("Please enter amount tendered...");
		
		double tendered = sc.nextDouble();
		
		if (tendered < price) {
			System.out.println("Tendered amount is less than price.");
		}
		else if (tendered == price) {
			System.out.println("Exact price tendered; no change required");
			
		}
		else if (tendered > price) {
			getChange(price, tendered);
		}
sc.close();
	}
	public static double getChange(double price, double tendered) {
		double changeTotal = tendered - price;
		int dollars = (int) changeTotal;
		double cents = Math.floor((changeTotal - dollars) * 100);
			
		double twentyCount = 0;
		double tenCount = 0;
		double fiveCount = 0;
		double oneCount = 0;
		double quarterCount= 0;
		double dimeCount = 0;
		double nickelCount = 0;
		double pennyCount = 0;
		
		//while (changeTotal > 0) {
			if (dollars / 20 > 0) {
				twentyCount= dollars/20;
				System.out.println(twentyCount + ": " + "$20(s)");
			
				dollars %= 20;
			}
			 if (dollars/ 10 > 0) {
				tenCount = dollars/10;
				System.out.println(tenCount + ": " + "$10(s)");
				dollars %= 10;
			}
			 if (dollars / 5 > 0) {
				fiveCount = dollars/5;
				System.out.println(fiveCount + ": " + "$5(s)");
				dollars %= 5;
			}
			 if (dollars / 1 > 0) {
				oneCount = dollars/1;
				System.out.println(oneCount + ": " + "$1(s)");
				dollars %= 1;
			}
			 if ((int)(cents / 25) > 0) {
				quarterCount = (int)cents/ 25;
				System.out.println(quarterCount + ": " + "quarter(s)");
				cents %=25;
			}
		     if ((int)(cents / 10) > 0) {
				dimeCount = (int)cents/ 10;
				System.out.println(dimeCount + ": " + "dime(s)");
				cents %= 10;
			}
			 if ((int)(cents / 5) > 0) {
				nickelCount = (int)cents/ 5;
				System.out.println(nickelCount + ": " + "nickel(s)");
				cents %= 5;
			}
		     if ((int)(cents / 1) > 0) {
				pennyCount = (int)cents/ 1;
				System.out.println(pennyCount + ": " + "penny(ies)");
				cents %=  1;
			}
		
		
		//}
	return changeTotal;
	}
}
