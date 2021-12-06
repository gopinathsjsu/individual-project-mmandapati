package ind_202;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;

public class CalPrice implements Handler{
	private Handler nextStep;

	public void setHandler(Handler nextHandler) {
		this.nextStep = nextHandler;

	}

	public void check(String filePath) {
		double total=0;
		List<List<String>> inputList = ScanInputFile.inputList;
		try (FileWriter fw = new FileWriter("output.txt")) {

			String output = "";
			
			 fw.write("Total amount to be paid"+ "\n");

			for (List<String> item : inputList) {
				String itemName = item.get(0);
				int itemQuantity = Integer.parseInt(item.get(1));
				double price = itemQuantity * ReadData.items.get(itemName).price;

				//System.out.println("Price"+price);
				total+=price;

				
			}
			output = String.valueOf(total);
		      fw.write(output);
		      System.out.println("Amount is successfully calculated, Please view output.txt file");
		      fw.close();
		} catch (IOException e) {
			System.out.println("file not found output");
		}
	}

}
