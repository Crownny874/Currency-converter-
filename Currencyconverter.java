import java.util.*;
public class Currencyconverter {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
			System.out.println("Enter The Following Number \n1. Dollar to Naira	\n2. Naira To Dollar \n3. Naira To Euro \n4. Euro To Naira");
		    double num = sc.nextInt();
			  if(num == 1) {
				 DollarToNaira();
			  }
			  else if(num == 2) {
				  NairaToDollar();
			  }
			  else if(num == 3) {
				 NairaToEuro();
			  }
			  else if(num == 4) {
				  EuroToNaira();
			  }
			 }
public static void DollarToNaira() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Dollar Amount: $");
	int num = sc.nextInt();
	
	if(num != -1) {
		double naira = 427.2519;
     double total = num*naira;
	 System.out.println("#"+total);
	 }
	}
public static void NairaToDollar() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Naira Amount: #");
	double num = sc.nextInt();

	if(num != -1) {
		double dollar = 427.2519;
		double total = num/dollar;
		System.out.println("$"+total);
	}
}
public static void NairaToEuro() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Naira Amount: #");
	double num = sc.nextInt();

	if(num != -1) {
		double naira = 431.1577;
		double total = num/naira;
		System.out.println("€"+total);
	}
}
public static void EuroToNaira() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Euro Amount: €");
	double num = sc.nextInt();

	if(num != -1) {
		double euro = 431.1577;
		double total = num*euro;
		System.out.println("#"+total);
	}
	}
}
		