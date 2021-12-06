package ind_202;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ScanInputFile implements ReadFiles{
static List<List<String>> inputList =  new ArrayList<>();
	
	public void readFile(String filePath) {
		String line = "";
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			br.readLine();
			while ((line = br.readLine()) != null)
			{
				String[] testdata = line.split(",");
				ArrayList<String> temp = new ArrayList<String>();
				temp.add(testdata[0]);
				temp.add(testdata[1]);
				temp.add(testdata[2]);
				if(!CardInput.cards.contains(testdata[2])) {
					//System.out.println("inserting the new card details");
				CardInput.cards.add(testdata[2]);
				
				}
				inputList.add(temp);

			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
