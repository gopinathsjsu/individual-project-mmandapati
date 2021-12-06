package ind_202;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class CardInput {
	static Set<String> cards = new HashSet<String>();
	
	public void readCarddata(String filePath) {
		String line = "";
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			br.readLine();
			while ((line = br.readLine()) != null) 
			{
				String[] card = line.split(",");
				cards.add(card[0]);
				//System.out.println("card data:"+card[0]);
	
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	
	}	
	
}
