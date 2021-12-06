package ind_202;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Capinfo {
	private static Capinfo capinfo = null;
	static HashMap<String, items> items = new HashMap<String, items>();
	static HashMap<String,Integer> capCategory = new HashMap<String,Integer>();
	private Capinfo() {
		capCategory.put("Essentials",5);
		capCategory.put("Luxury",3);
		capCategory.put("Misc",6);
		
	}

	public static Capinfo getInstance() {
		if (capinfo != null)
			return capinfo;
		else {
			capinfo = new Capinfo();
			return capinfo;
		}
	}

}
