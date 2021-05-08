/**
 * 
 */
package com.partha.vaccine.propreader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Partha Pratim Das<partha.783380@gmail.com>
 */
public class PropertyReader {

	public static String getProp(String key) throws IOException {
	
		FileReader reader=new FileReader("app.prop");  
	      
	    Properties p=new Properties();  
	    p.load(reader);  
	      
	    return p.getProperty(key);
	    
	}

}
