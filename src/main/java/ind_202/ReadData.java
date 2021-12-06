package ind_202;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ReadData implements ReadFiles{
static HashMap<String, items> items = new HashMap<String, items>();

	
	public void readFile(String filePath) {
		String line = "";
		try {

			BufferedReader br = new BufferedReader(new FileReader(filePath));
			br.readLine();
			while ((line = br.readLine()) != null)
			{
				String[] dataset = line.split(",");
				int quant = Integer.parseInt(dataset[2]);//
				double price = Double.parseDouble(dataset[3]);
				items newDataitem = new items(dataset[0], dataset[1], quant, price);
				items.put(dataset[1], newDataitem);
				//System.out.println(dataset[1]);

			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
