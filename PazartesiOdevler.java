package com.turkcell;

import java.util.Scanner;

public class PazartesiOdevler {
	
	// sayı alma method
	public static int scannerNumber() {
		Scanner scn = new Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");
		return scn.nextInt();
	}
	
	// kelime alma method
	public static String scannerString() {
		Scanner scn = new Scanner(System.in);
		System.out.print("Bir kelime giriniz: ");
		return scn.nextLine();
	}
	
	// mükemmel sayı method
	public static void isPerfectNum(int num) {
		int total = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				total += i;
			}
		}
		if (total == num)
			System.out.println("Girdiğiniz sayı mükemmel");
		else
			System.out.println("Girdiğiniz sayı mükemmel değil");
	}
	
	// palindrom method
	public static void palindrom(String text) {
		text = text.replace(" ", "");
		String textReverse = "";
		for (int i = text.length() - 1; i >= 0; i--) {
			textReverse += text.charAt(i);
		}
		String p = text.equals(textReverse) == true ? "Palindrom kelime :)" : "Palndrom değil.";
		System.out.println(p);
	}
	
	// asal sayı method iterative
	public static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	// asal sayı method recursive 
	public static boolean isPrimeRecursive(int num, int i) {
		if (num < 2) {
			return false;
		}
		
		if (i == 1) {
			return true;
		} else {
			if (num % i == 0) {
				return false;
			} else {
				isPrimeRecursive(num, i - 1);
			}
		}
		return true;
	}
	
	// fibonacci method iterative
	public static void fibonacci(int num) {
		int temp1 = 1;
		int temp2 = 1;
		int temp3 = 0;
		for (int i = 1; i <= num; i++) {
			System.out.print(temp1 + " ");
			temp3 = temp1 + temp2;
			temp1 = temp2;
			temp2 = temp3;
			
		}
	}
	
	// fibonacci method recursive
	public static void fibonacciRecursive(int num, int t1, int t2, int t3) {
		if (num == 0) {
			System.out.println("Fibonacci :)");
		} else {
			System.out.print(t1 + " ");
			t3 = t1 + t2;
			t1 = t2;
			t2 = t3;
			fibonacciRecursive(num - 1, t1, t2, t3);
		}
	}
	
	public static void main(String[] args) {
		
		// Mükemmel sayı
		isPerfectNum(scannerNumber());
		
		// Palindrom
		palindrom(scannerString());
		
		// Asal Sayı
		// -->iterative ****
		String asal = isPrime(scannerNumber()) == true ? "Asal sayı" : "Asal sayı değil";
		System.out.println(asal);
		// -->recursive ****
		int number = scannerNumber();
		String asalRecursive = isPrimeRecursive(number, number / 2) == true ? "Asal sayı" : "Asal sayı değil";
		System.out.println(asalRecursive);
		
		// Fibonacci
		// -->iterative ****
		fibonacci(scannerNumber());
		// -->recursive ****
		fibonacciRecursive(scannerNumber(), 1, 1, 0);
	}
	
}
