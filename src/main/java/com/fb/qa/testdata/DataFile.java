package com.fb.qa.testdata;

import com.fb.qa.util.Xls_Reader;

public class DataFile {
	Xls_Reader d = new Xls_Reader("C:\\QA\\Testing\\NikulTest.xlsx");
	
	
	public String email = d.getCellData("Data1", "UserName", 6);
	public String password = d.getCellData("Data1", "Password", 6);
	public String EmptyEmailErr = d.getCellData("Data1", "Email Error", 6);
	public String EmptyPassErr = d.getCellData("Data1", "Password Error", 6);

//Forget Password button
	public String forgetPassEmail = d.getCellData("Data1", "UserName", 8);
	public String wrongEmailErr = d.getCellData("Data1", "Email Error", 8);
	public String emptyEmailErr = d.getCellData("Data1", "Email Error", 9);
}
