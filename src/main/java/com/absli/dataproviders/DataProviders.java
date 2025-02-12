package com.absli.dataproviders;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;

import org.testng.annotations.DataProvider;

import com.absli.utils.PropertiesUtils;

import Utils.ExcelUtils;

public class DataProviders {
	
	//Properties prop = new Properties();
	PropertiesUtils prop = new PropertiesUtils();
	
	@DataProvider(name = "dataSignInProvider")
	public Iterator<Object[]> getSignInTestData(Method method) throws IOException {
		ArrayList<Object[]> testData = new ExcelUtils().getLoginDataFromExcel(prop.getProperties("testExcelSheet"),
				method.getName(), prop.getProperties("loginSheetName"));
		return testData.iterator();
	}


	@DataProvider(name = "dashboardDataProvider")
	public Iterator<Object[]> getDashboardTestData(Method method) throws IOException {
		ArrayList<Object[]> testData = new ExcelUtils().getDashboardDataFromExcel(prop.getProperties("testExcelSheet"),
				method.getName(), prop.getProperties("dashboardSheetName"));
		return testData.iterator();
	}


	@DataProvider(name = "customerProfileDataProvider")
	public Iterator<Object[]> getCustomerProfileTestData(Method method) throws IOException {
		ArrayList<Object[]> testData = new ExcelUtils().getcustomerProfileDataExcel(prop.getProperties("testExcelSheet"),
				method.getName(), prop.getProperties("customerProfileSheetName"));
		return testData.iterator();
	}
	

	@DataProvider(name = "viewQuoteDataProvider")
	public Iterator<Object[]> getViewQuoteTestData(Method method) throws IOException {
		ArrayList<Object[]> testData = new ExcelUtils().getviewQuoteDataExcel(prop.getProperties("testExcelSheet"),
				method.getName(), prop.getProperties("viewQuoteSheetName"));
		return testData.iterator();
	}

	@DataProvider(name = "planInfoDataProvider")
	public Iterator<Object[]> getplanInfoTestData(Method method) throws IOException {
		ArrayList<Object[]> testData = new ExcelUtils().getPlanInfoDataExcel(prop.getProperties("testExcelSheet"),
				method.getName(), prop.getProperties("planInfoSheetName"));
		return testData.iterator();
	}
	
	
	
	@DataProvider(name = "HealthAndPureTermsDataProvider")
	public Iterator<Object[]> getHealthAndPureTermsDataExcel(Method method) throws IOException {
		ArrayList<Object[]> testData = new ExcelUtils().getHealthAndPureTermsDataExcel(prop.getProperties("testExcelSheet"),
				method.getName(), prop.getProperties("HealthAndPureTermsSheetName"));
		return testData.iterator();
	}
	
	


	@DataProvider(name = "bankDetailDataProvider")
	public Iterator<Object[]> getbankDetailTestData(Method method) throws IOException {
		ArrayList<Object[]> testData = new ExcelUtils().getBankDetailsDataExcel(prop.getProperties("testExcelSheet"),
				method.getName(), prop.getProperties("bankDetailSheetName"));
		return testData.iterator();
	}
	

	@DataProvider(name = "AddNomineePageDataProvider")
	public Iterator<Object[]> getAddNomineePageDataExcel(Method method) throws IOException {
		ArrayList<Object[]> testData = new ExcelUtils().getAddNomineePageDataExcel(prop.getProperties("testExcelSheet"),
				method.getName(), prop.getProperties("AddNomineePageSheetName"));
		return testData.iterator();
	}
	

	@DataProvider(name = "AddressDataProvider")
	public Iterator<Object[]> getAddressTestData(Method method) throws IOException {
		ArrayList<Object[]> testData = new ExcelUtils().getAddressDataExcel(prop.getProperties("testExcelSheet"),
				method.getName(), prop.getProperties("AddressSheetName"));
		return testData.iterator();
	}
	
	
	
	
	
	
	@DataProvider(name = "PersonalInfoPageDataProvider")
	public Iterator<Object[]> getPersonalInfoDataExcel(Method method) throws IOException {
		ArrayList<Object[]> testData = new ExcelUtils().getPersonalInfoDataExcel(prop.getProperties("testExcelSheet"),
				method.getName(), prop.getProperties("PersonalInfoPageSheetName"));
		return testData.iterator();
	}
	
	

	@DataProvider(name = "HealthDetailDataProvider")
	public Iterator<Object[]> getHealthDetailDataExcel(Method method) throws IOException {
		ArrayList<Object[]> testData = new ExcelUtils().getHealthDetailDataExcel(prop.getProperties("testExcelSheet"),
				method.getName(), prop.getProperties("HealthDetailpageSheetName"));
		return testData.iterator();
	}
	@DataProvider(name = "HealthDetailDataProviderNew")
	public Iterator<Object[]> getHealthDetailDataExcelNew(Method method) throws IOException {
		ArrayList<Object[]> testData = new ExcelUtils().getHealthDetailDataExcelNew(prop.getProperties("testExcelSheet"),
				method.getName(), prop.getProperties("HealthDetailpageSheetName"));
		return testData.iterator();
	}
	
	@DataProvider(name = "ReviewAndAcceptDataProvider")
	public Iterator<Object[]> getReviewAndAcceptDataExcel(Method method) throws IOException {
		ArrayList<Object[]> testData = new ExcelUtils().getReviewAndAcceptDataExcel(prop.getProperties("testExcelSheet"),
				method.getName(), prop.getProperties("ReviewAndAcceptPageSheetName"));
		return testData.iterator();
	}
	@DataProvider(name = "PaymentPageDataProvider")
	public Iterator<Object[]> getPaymentPageDataExcel(Method method) throws IOException {
		ArrayList<Object[]> testData = new ExcelUtils().getPaymentPageDataExcel(prop.getProperties("testExcelSheet"),
				method.getName(), prop.getProperties("PaymentPageSheetName"));
		return testData.iterator();
	}
	
	@DataProvider(name = "DocumentsDataProvider")
	public Iterator<Object[]> getDocumentsDataExcel(Method method) throws IOException {
		ArrayList<Object[]> testData = new ExcelUtils().getDocumentsDataExcel(prop.getProperties("testExcelSheet"),
				method.getName(), prop.getProperties("DocumentsSheetName"));
		return testData.iterator();
	}
	@DataProvider(name = "IARDataProvider")
	public Iterator<Object[]> getIARDataExcel(Method method) throws IOException {
		ArrayList<Object[]> testData = new ExcelUtils().getIARDataExcel(prop.getProperties("testExcelSheet"),
				method.getName(), prop.getProperties("IARSheetName"));
		return testData.iterator();
	}
	@DataProvider(name = "ProposerNotInsuredDataProvider")
	public Iterator<Object[]> getProposerNotInsuredDataExcel(Method method) throws IOException {
		ArrayList<Object[]> testData = new ExcelUtils().getProposerNotInsuredDataExcel(prop.getProperties("testExcelSheet"),
				method.getName(), prop.getProperties("ProposerNotInsuredSheetName"));
		return testData.iterator();
	}


	@DataProvider(name = "JointLifeDataProvider")
	public Iterator<Object[]> getJointLifeDataExcel(Method method) throws IOException {
		ArrayList<Object[]> testData = new ExcelUtils().getJointLifeDataExcel(prop.getProperties("testExcelSheet"),
				method.getName(), prop.getProperties("JointLifeSheetName"));
		return testData.iterator();
	}
	
	@DataProvider(name = "JointLifeDataProvider2")
	public Iterator<Object[]> getJointLifeDataExcel2(Method method) throws IOException {
		ArrayList<Object[]> testData = new ExcelUtils().getJointLifeDataExcel2(prop.getProperties("testExcelSheet"),
				method.getName(), prop.getProperties("JointLifeSheetName2"));
		return testData.iterator();
	}


	
}
