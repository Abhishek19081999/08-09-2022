package com.loop.bll;
import java.util.Scanner;
public class CountDigits {

	 public static int countDigits(int n) {
		 int count=0;
		 while(n!=0) {
			 n/=10;
			 ++count;
		 }
		 return count;
		
		 }
	 
	 public static void main(String args[]) {
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("Enter a positive number: ");
		 int n=scanner.nextInt();
		 
		 System.out.println("Number of digits: "+countDigits(n));
		 
		 scanner.close();
	 }

}
