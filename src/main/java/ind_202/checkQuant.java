package ind_202;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;


public class checkQuant implements Handler{
	private Handler nextStep;
	public void setHandler(Handler nextHandler) {
		this.nextStep = nextHandler;
	}
	
	public void check(String filePath) {
		// Reading the Dataset file
		ReadData  rd = new ReadData();
		rd.readFile("Dataset.csv");
		HashMap<String, items> dbitems = rd.items;
		
		// Reading the Input file
		ScanInputFile r1 = new ScanInputFile();
		r1.readFile(filePath);
		List<List<String>> inputdata = r1.inputList;

		boolean flag=false;
		boolean essentialflag=false;
		boolean luxuryflag=false;
		boolean miscflag=false;
		String lowQuantflag="";
		
		//Fetching the cap details for all categories
		Capinfo cap = Capinfo.getInstance();
		HashMap<String, Integer> category = cap.capCategory;
		int ess = category.get("Essentials");
		int lux = category.get("Luxury");
		int misc = category.get("Misc");
		int totaless = 0;
		int totallux = 0;
		int totalmisc = 0;
		
		for (List<String> item: inputdata) {
			int quantity = Integer.parseInt(item.get(1));
			String itemName = item.get(0);
			String cardNumber = item.get(2);
			
			//Validating the Quantities 
			if(dbitems.get(itemName).quantity<quantity) {
				flag= true;
				lowQuantflag+= "Invalid quantity for "+itemName+" "+ item.get(1)+"\n";
			}
			
			//validating the cap for categories
			switch(dbitems.get(itemName).category) {
			case "Essential":

				totaless = totaless + quantity;
				
				if(totaless>ess) {
					flag=true;
					essentialflag=true;
				}
				break;
				
			case "Luxury":

				totallux = totallux + quantity;
				
				if(totallux>lux) {
					flag=true;
					luxuryflag=true;
				}
				break;
				
			case "Misc":
			
				totalmisc = totalmisc + quantity;
				
				if(totalmisc>misc) {
					flag=true;
					miscflag=true;
				}
				break;
			default:
				break;
			}
		}
		
		if(flag) {
			try {
			      FileWriter myWriter = new FileWriter("errors.txt");
			      myWriter.write("Please correct quantities "+ "\n");
			      myWriter.write(lowQuantflag);
			      if(lowQuantflag.equals("")) {
			    	  if(essentialflag)
			    	  myWriter.write("Entered Essentials are out of capacity"+ "\n");
			    	  if(luxuryflag)
				    	  myWriter.write("Entered Luxury items are out of capacity"+ "\n");
			    	  if(miscflag)
				    	  myWriter.write("Entered Misc items are out of capacity"+ "\n");
			      }
			      myWriter.close();
			      System.out.println("Cannot complete the payment due to incorrect Quantities, check the error.txt file");
			    } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
			return;
		}
//		System.out.println("Entered to next step");
		nextStep.check(filePath);
		
	}


}
