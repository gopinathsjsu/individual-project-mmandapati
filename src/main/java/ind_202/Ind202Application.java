package ind_202;

import java.util.*;

import java.io.BufferedReader;  
import java.io.FileReader;
import java.io.IOException;  



public class Ind202Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input file name that needs to be tested:");
		String filepath = sc.nextLine();
		sc.close();
		//System.out.println("filepath: "+filepath);
		CardInput carddata = new CardInput();
		carddata.readCarddata("Cards - Sheet1.csv");
		checkQuant checkquant= new checkQuant();
    	CalPrice calprice= new CalPrice();
    	//CheckCap checkcap = new CheckCap();
    	checkquant.setHandler(calprice);
    	checkquant.check(filepath);
    	//System.out.println("Hello world");

    	System.out.println("Cards present and added are:");
    	CardInput.cards.forEach((element) -> { System.out.println(element); });
    	
    	
		

	}

}
