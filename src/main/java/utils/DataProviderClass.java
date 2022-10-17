package utils;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

	@DataProvider
	public Object[][] bookNamesDataProvider(){
		
		Object[][] data = new Object[2][2];
		data[0][0] = "The forest";
		data[0][1] = "book2.jpg";
		
		data[1][0] = "Life in the garden";
		data[1][1] = "book4.jpg";
		
		return data;
	}
	
	
}
