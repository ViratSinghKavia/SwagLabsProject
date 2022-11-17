package com.swaglabs.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.swaglabs.pageObjects.LoginPage;
import com.swaglabs.utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass {
	
	@Test(dataProvider ="LoginData")
	public void loginDDT(String user, String pwd) {
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUsername(user);;
		lp.setPassword(pwd);
		
		
	}
	
	
	String [][] getData() throws IOException {
		
		String path ="C:\\Users\\91916\\eclipse-workspace\\SwagLabsProject\\src\\test\\java\\com\\swaglabs\\testData\\LoginData.xlsx" ;
		
		int rownum = XLUtils.getRowCount(path, "Sheet1");
		
		int colcount = XLUtils.getCellCount(path, "Sheet1", 1);
		
		String logindata[][] = new String [rownum][colcount];
		
		for(int i=1;i<=rownum;i++) {
			
			
			for (int j=0;j<colcount;j++) {
				
				logindata[i-1][j] = XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
	return logindata;
		
	}
	
	
	
	

}
