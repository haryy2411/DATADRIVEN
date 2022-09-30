package com.blazeecommerce;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.blazeflight.ReusableMethod;

public class Store extends ReusableMethod {
	@BeforeClass
	public void before() throws IOException {
		
		getdriver();
		String url = getpropertyfilevalue("url");
		url(url);
		implicitwait();
		
	}
	@Test
	public void tc01() throws IOException, InterruptedException {
		
		POM pom = new POM();
		
		pom.getStore_login_pojo().Store_login(getpropertyfilevalue("username"), getpropertyfilevalue("password"));
		
		pom.getAddcart().AddMacbook();
		
		pom.getPlaceOrder_pojo().PlaceOrder(Getsheet("blaze", 1, 0), Getsheet("blaze", 1, 1), Getsheet("blaze", 1, 2), Getsheet("blaze", 1, 3),
				Getsheet("blaze", 1, 4), Getsheet("blaze", 1, 5));

	}

}
