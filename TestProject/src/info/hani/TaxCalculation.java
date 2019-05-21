package info.hani;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaxCalculation {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Actual Amount");
		int amount = Integer.parseInt(bufferedReader.readLine());
		
		System.out.println("Enter Interst");
		double interst = Double.parseDouble(bufferedReader.readLine());
		
		System.out.println("Enter The Duration");
		double duration = Double.parseDouble(bufferedReader.readLine());
		
		Double Interest = (amount*interst*duration)/100;
		System.out.println("Total Amount :"+ Interest);

	}

}
