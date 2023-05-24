package javaprograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

	public static void main(String[] args) throws IOException {
		
		String fileLocation ="C:\\AutomationCyber\\Workspace\\JavaExamples\\Myprop\\AppData.properties";
		
		FileInputStream fis=new FileInputStream(fileLocation);
		Properties prop=new Properties();
		prop.load(fis);
		
	System.out.println(prop.get("username"));
	System.out.println(prop.get("password"));
	System.out.println(prop.get("mobile"));
		
		

	}

}
