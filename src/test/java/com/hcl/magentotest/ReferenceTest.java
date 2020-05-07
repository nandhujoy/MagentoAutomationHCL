package com.hcl.magentotest;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hcl.utilities.ExcelUtils;

public class ReferenceTest {
	
	
	@DataProvider
	public String[][] validData() throws IOException
	{
		String[][] main=ExcelUtils.getSheetIntoArray("testdata/MagentoData.xlsx","InvalidCredentialData");
	return main;
	}
	
	//peter,peter123
	//john,john123
	//mark,mark123
	
	@Test(dataProvider="validData")
	public void validTest(String username,String password,String expectedValue)
	{
		System.out.println(username+password);
	}

}
