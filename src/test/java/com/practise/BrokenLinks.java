package com.practise;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.blazeflight.ReusableMethod;

public class BrokenLinks extends ReusableMethod{

	public static void main(String[] args) throws IOException {
		
		
		 getdriver();
		 url("https://www.facebook.com/");
		 
		 List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		 int size = alllinks.size();
		 System.out.println("Total links"+size);
		 
		 int count = 0;
		 for (int i = 0; i <alllinks.size(); i++) {
			 
			 WebElement link = alllinks.get(i);
			 String attribute = link.getAttribute("href");
			 URL url = new URL(attribute);
			
			URLConnection openConnection = url.openConnection();
			
			HttpsURLConnection connection = (HttpsURLConnection) openConnection;
			
			int responseCode = connection.getResponseCode();
			
			if (responseCode!=200) {
				count++;
				System.out.println("links"+attribute);
			
			}
			
		}
		 System.out.println("Broken links"+count);
	}

}
