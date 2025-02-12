package Utils;

import java.util.ArrayList;

public class ExcelUtils {


	public ArrayList<Object[]> getLoginDataFromExcel(String testExcelSheet, String testName, String loginSheetName) {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		ArrayList<String> myColumnData = new ArrayList<String>();
		Xls_reader reader = null;

		try {
			reader = new Xls_reader(System.getProperty("user.dir") + testExcelSheet);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Sign in Sheet row count ---------" + reader.getRowCount(loginSheetName));
		System.out.println(" ******* current test running method  *********" + testName);
		System.out.println("**** column count  ********" + reader.getColumnCount(loginSheetName));

		for (int rowCount = 3; rowCount <= reader.getRowCount(loginSheetName); rowCount++) {
			String currentTestMethod = reader.getCellData(loginSheetName, "testCaseName", rowCount);
			String enableFlag = reader.getCellData(loginSheetName, "flag", rowCount);
			if (currentTestMethod.equalsIgnoreCase(testName)) {
				String username = reader.getCellData(loginSheetName, "username", rowCount);
				String password = reader.getCellData(loginSheetName, "password", rowCount);
				String ErrorMSG = reader.getCellData(loginSheetName, "ErrorMSG", rowCount);
				String ErrorMSGPassword = reader.getCellData(loginSheetName, "ErrorMSGPassword", rowCount);

				Object ob[] = {username.trim(), password.trim(), ErrorMSG.trim(), ErrorMSGPassword.trim()};
				myData.add(ob);
			}
		}
		System.out.println("mydata rows value **********" + myData);
		return myData;
	}


	/**
	 * get Dashboard data provider -- add the columns here
	 */
	public ArrayList<Object[]> getDashboardDataFromExcel(String testExcelSheet, String testName, String SheetName) {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		ArrayList<String> myColumnData = new ArrayList<String>();
		Xls_reader reader = null;

		try {
			reader = new Xls_reader(System.getProperty("user.dir") + testExcelSheet);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("dashboard Sheet row count ---------" + reader.getRowCount(SheetName));
		System.out.println(" ******* current test running method  *********" + testName);
		System.out.println("**** column count  ********" + reader.getColumnCount(SheetName));

		for (int rowCount = 3; rowCount <= reader.getRowCount(SheetName); rowCount++) {
			String currentTestMethod = reader.getCellData(SheetName, "testCaseName", rowCount);
			String enableFlag = reader.getCellData(SheetName, "flag", rowCount);
			if (currentTestMethod.equalsIgnoreCase(testName)) {
				String username = reader.getCellData(SheetName, "username", rowCount);
				String password = reader.getCellData(SheetName, "password", rowCount);
				String leadID = reader.getCellData(SheetName, "leadID", rowCount);
				String mobileNumber = reader.getCellData(SheetName, "mobileNumber", rowCount);
				String panNumber = reader.getCellData(SheetName, "panNumber", rowCount);
				String day = reader.getCellData(SheetName, "day", rowCount);
				String month = reader.getCellData(SheetName, "month", rowCount);
				String year = reader.getCellData(SheetName, "year", rowCount);


				Object ob[] = {username.trim(), password.trim(), leadID.trim(), mobileNumber.trim(),
						panNumber.trim(), day.trim(), month.trim(), year.trim()};
				myData.add(ob);
			}
		}
		System.out.println("mydata rows value **********" + myData);
		return myData;
	}


	/**
	 * Customer profile data provider -- add the columns here
	 */
	public ArrayList<Object[]> getcustomerProfileDataExcel(String testExcelSheet, String testName, String SheetName) {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		ArrayList<String> myColumnData = new ArrayList<String>();
		Xls_reader reader = null;

		try {
			reader = new Xls_reader(System.getProperty("user.dir") + testExcelSheet);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("cusotmer profile Sheet row count ---------" + reader.getRowCount(SheetName));
		System.out.println(" ******* current test running method  *********" + testName);
		System.out.println("**** column count  ********" + reader.getColumnCount(SheetName));

		for (int rowCount = 3; rowCount <= reader.getRowCount(SheetName); rowCount++) {
			String currentTestMethod = reader.getCellData(SheetName, "testCaseName", rowCount);
			String enableFlag = reader.getCellData(SheetName, "flag", rowCount);
			if (currentTestMethod.equalsIgnoreCase(testName)) {
				String username = reader.getCellData(SheetName, "username", rowCount);
				String password = reader.getCellData(SheetName, "password", rowCount);
				String leadID = reader.getCellData(SheetName, "leadID", rowCount);
				String mobileNumber = reader.getCellData(SheetName, "mobileNumber", rowCount);
				String panNumber = reader.getCellData(SheetName, "panNumber", rowCount);
				String ErrorMSGPan = reader.getCellData(SheetName, "ErrorMSGPan", rowCount);
				String panName = reader.getCellData(SheetName, "panName", rowCount);
				String panGender = reader.getCellData(SheetName, "panGender", rowCount);
				String editPanName = reader.getCellData(SheetName, "editPanName", rowCount);
				String day = reader.getCellData(SheetName, "day", rowCount);
				String month = reader.getCellData(SheetName, "month", rowCount);
				String year = reader.getCellData(SheetName, "year", rowCount);
				String titleName = reader.getCellData(SheetName, "titleName", rowCount);
				String DOBErrorMSG = reader.getCellData(SheetName, "DOBErrorMSG", rowCount);
				String MobileErrorMSG = reader.getCellData(SheetName, "MobileErrorMSG", rowCount);
				String LeadIDErrorMSG = reader.getCellData(SheetName, "LeadIDErrorMSG", rowCount);


				Object ob[] = {username.trim(), password.trim(), leadID.trim(), mobileNumber.trim(),
						panNumber.trim(), ErrorMSGPan.trim(), panName.trim(), panGender.trim(), editPanName.trim(), day.trim(), month.trim(), year.trim(), titleName.trim(), DOBErrorMSG.trim(), MobileErrorMSG.trim(), LeadIDErrorMSG.trim()};
				myData.add(ob);
			}
		}
		System.out.println("mydata rows value **********" + myData);
		return myData;
	}


	public ArrayList<Object[]> getviewQuoteDataExcel(String testExcelSheet, String testName, String SheetName) {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		ArrayList<String> myColumnData = new ArrayList<String>();
		Xls_reader reader = null;

		try {
			reader = new Xls_reader(System.getProperty("user.dir") + testExcelSheet);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("view Quote Sheet row count ---------" + reader.getRowCount(SheetName));
		System.out.println(" ******* current test running method  *********" + testName);
		System.out.println("**** column count  ********" + reader.getColumnCount(SheetName));

		for (int rowCount = 3; rowCount <= reader.getRowCount(SheetName); rowCount++) {
			String currentTestMethod = reader.getCellData(SheetName, "testCaseName", rowCount);
			String enableFlag = reader.getCellData(SheetName, "flag", rowCount);
			if (currentTestMethod.equalsIgnoreCase(testName)) {
				String username = reader.getCellData(SheetName, "username", rowCount);
				String password = reader.getCellData(SheetName, "password", rowCount);
				String leadID = reader.getCellData(SheetName, "leadID", rowCount);
				String mobileNumber = reader.getCellData(SheetName, "mobileNumber", rowCount);
				String panNumber = reader.getCellData(SheetName, "panNumber", rowCount);
				String day = reader.getCellData(SheetName, "day", rowCount);
				String month = reader.getCellData(SheetName, "month", rowCount);
				String year = reader.getCellData(SheetName, "year", rowCount);
				String quoteAmount = reader.getCellData(SheetName, "quoteAmount", rowCount);
				String planOptions = reader.getCellData(SheetName, "planOptions", rowCount);
				String smokerNonSmoker = reader.getCellData(SheetName, "smokerNonSmoker", rowCount);
				String pptOption = reader.getCellData(SheetName, "pptOption", rowCount);
				String term = reader.getCellData(SheetName, "term", rowCount);
				String paymode = reader.getCellData(SheetName, "paymode", rowCount);
				String AciSumAssured = reader.getCellData(SheetName, "AciSumAssured", rowCount);
				String Rideramount = reader.getCellData(SheetName, "Rideramount", rowCount);
				String level = reader.getCellData(SheetName, "level", rowCount);


				Object ob[] = {username.trim(), password.trim(), leadID.trim(), mobileNumber.trim(),
						panNumber.trim(), day.trim(), month.trim(), year.trim(), quoteAmount.trim(), planOptions.trim(), smokerNonSmoker.trim(), pptOption.trim(),
						term.trim(), paymode.trim(), AciSumAssured.trim(), Rideramount.trim(), level.trim()};
				myData.add(ob);
			}
		}
		System.out.println("mydata rows value **********" + myData);
		return myData;
	}


	/**
	 * Plan Info data provider -- add the columns here
	 */
	public ArrayList<Object[]> getPlanInfoDataExcel(String testExcelSheet, String testName, String SheetName) {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		ArrayList<String> myColumnData = new ArrayList<String>();
		Xls_reader reader = null;

		try {
			reader = new Xls_reader(System.getProperty("user.dir") + testExcelSheet);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Plan Info Sheet row count ---------" + reader.getRowCount(SheetName));
		System.out.println(" ******* current test running method  *********" + testName);
		System.out.println("**** column count  ********" + reader.getColumnCount(SheetName));

		for (int rowCount = 3; rowCount <= reader.getRowCount(SheetName); rowCount++) {
			String currentTestMethod = reader.getCellData(SheetName, "testCaseName", rowCount);
			String enableFlag = reader.getCellData(SheetName, "flag", rowCount);
			if (currentTestMethod.equalsIgnoreCase(testName)) {
				String username = reader.getCellData(SheetName, "username", rowCount);
				String password = reader.getCellData(SheetName, "password", rowCount);
				String leadID = reader.getCellData(SheetName, "leadID", rowCount);
				String mobileNumber = reader.getCellData(SheetName, "mobileNumber", rowCount);
				String panNumber = reader.getCellData(SheetName, "panNumber", rowCount);
				String day = reader.getCellData(SheetName, "day", rowCount);
				String month = reader.getCellData(SheetName, "month", rowCount);
				String year = reader.getCellData(SheetName, "year", rowCount);
				String quoteAmount = reader.getCellData(SheetName, "quoteAmount", rowCount);
				String planOptions = reader.getCellData(SheetName, "planOptions", rowCount);
				String smokerNonSmoker = reader.getCellData(SheetName, "smokerNonSmoker", rowCount);
				String pptOption = reader.getCellData(SheetName, "pptOption", rowCount);
				String term = reader.getCellData(SheetName, "term", rowCount);
				String paymode = reader.getCellData(SheetName, "paymode", rowCount);
				String AciSumAssured = reader.getCellData(SheetName, "AciSumAssured", rowCount);
				String Rideramount = reader.getCellData(SheetName, "Rideramount", rowCount);


				Object ob[] = {username.trim(), password.trim(), leadID.trim(), mobileNumber.trim(),
						panNumber.trim(), day.trim(), month.trim(), year.trim(), quoteAmount.trim(), planOptions.trim(),
						smokerNonSmoker.trim(), pptOption.trim(),
						term.trim(), paymode.trim(), AciSumAssured.trim(), Rideramount.trim()};
				myData.add(ob);
			}
		}
		System.out.println("mydata rows value **********" + myData);
		return myData;
	}


	/**
	 * Health and pure term data provider -- add the columns here
	 */


	public ArrayList<Object[]> getHealthAndPureTermsDataExcel(String testExcelSheet, String testName, String SheetName) {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		ArrayList<String> myColumnData = new ArrayList<String>();
		Xls_reader reader = null;

		try {
			reader = new Xls_reader(System.getProperty("user.dir") + testExcelSheet);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Health And Pure Terms row count ---------" + reader.getRowCount(SheetName));
		System.out.println(" ******* current test running method  *********" + testName);
		System.out.println("**** column count  ********" + reader.getColumnCount(SheetName));

		for (int rowCount = 3; rowCount <= reader.getRowCount(SheetName); rowCount++) {
			String currentTestMethod = reader.getCellData(SheetName, "testCaseName", rowCount);
			String enableFlag = reader.getCellData(SheetName, "flag", rowCount);
			if (currentTestMethod.equalsIgnoreCase(testName)) {
				String username = reader.getCellData(SheetName, "username", rowCount);
				String password = reader.getCellData(SheetName, "password", rowCount);
				String leadID = reader.getCellData(SheetName, "leadID", rowCount);
				String mobileNumber = reader.getCellData(SheetName, "mobileNumber", rowCount);
				String panNumber = reader.getCellData(SheetName, "panNumber", rowCount);
				String day = reader.getCellData(SheetName, "day", rowCount);
				String month = reader.getCellData(SheetName, "month", rowCount);
				String year = reader.getCellData(SheetName, "year", rowCount);
				String premiumValue = reader.getCellData(SheetName, "premiumValue", rowCount);
				String occupationOption = reader.getCellData(SheetName, "occupationOption", rowCount);
				String lifeStageValue = reader.getCellData(SheetName, "lifeStageValue", rowCount);
				String riskProfileFieldValue = reader.getCellData(SheetName, "riskProfileFieldValue", rowCount);
				String investmentGoalValue = reader.getCellData(SheetName, "investmentGoalValue", rowCount);
				String errorMSG = reader.getCellData(SheetName, "errorMSG", rowCount);
				String selectACategory = reader.getCellData(SheetName, "selectACategory", rowCount);
				String selectAPlan = reader.getCellData(SheetName, "selectAPlan", rowCount);

				Object ob[] = {username.trim(), password.trim(), leadID.trim(), mobileNumber.trim(),
						panNumber.trim(), day.trim(), month.trim(), year.trim(), premiumValue.trim(), occupationOption.trim(), lifeStageValue.trim(), riskProfileFieldValue.trim(), investmentGoalValue.trim(), errorMSG.trim(), selectACategory.trim(), selectAPlan.trim()};
				myData.add(ob);
			}
		}
		System.out.println("mydata rows value **********" + myData);
		return myData;
	}


	/**
	 * Bank Details data provider -- add the columns here
	 */
	public ArrayList<Object[]> getBankDetailsDataExcel(String testExcelSheet, String testName, String SheetName) {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		ArrayList<String> myColumnData = new ArrayList<String>();
		Xls_reader reader = null;

		try {
			reader = new Xls_reader(System.getProperty("user.dir") + testExcelSheet);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("BankDetails Sheet row count ---------" + reader.getRowCount(SheetName));
		System.out.println(" ******* current test running method  *********" + testName);
		System.out.println("**** column count  ********" + reader.getColumnCount(SheetName));

		for (int rowCount = 3; rowCount <= reader.getRowCount(SheetName); rowCount++) {
			String currentTestMethod = reader.getCellData(SheetName, "testCaseName", rowCount);
			String enableFlag = reader.getCellData(SheetName, "flag", rowCount);
			if (currentTestMethod.equalsIgnoreCase(testName)) {
				String username = reader.getCellData(SheetName, "username", rowCount);
				String password = reader.getCellData(SheetName, "password", rowCount);
				String leadID = reader.getCellData(SheetName, "leadID", rowCount);
				String mobileNumber = reader.getCellData(SheetName, "mobileNumber", rowCount);
				String panNumber = reader.getCellData(SheetName, "panNumber", rowCount);
				String day = reader.getCellData(SheetName, "day", rowCount);
				String month = reader.getCellData(SheetName, "month", rowCount);
				String year = reader.getCellData(SheetName, "year", rowCount);
				String quoteAmount = reader.getCellData(SheetName, "quoteAmount", rowCount);
				String planOptions = reader.getCellData(SheetName, "planOptions", rowCount);
				String smokerNonSmoker = reader.getCellData(SheetName, "smokerNonSmoker", rowCount);
				String pptOption = reader.getCellData(SheetName, "pptOption", rowCount);
				String term = reader.getCellData(SheetName, "term", rowCount);
				String paymode = reader.getCellData(SheetName, "paymode", rowCount);
				String AciSumAssured = reader.getCellData(SheetName, "AciSumAssured", rowCount);
				String Rideramount = reader.getCellData(SheetName, "Rideramount", rowCount);
				String level = reader.getCellData(SheetName, "level", rowCount);
				String IFSCCode = reader.getCellData(SheetName, "IFSCCode", rowCount);
				String IFSCErrorMSG = reader.getCellData(SheetName, "IFSCErrorMSG", rowCount);
				String BankName = reader.getCellData(SheetName, "BankName", rowCount);
				String BankNameErrorMSG = reader.getCellData(SheetName, "BankNameErrorMSG", rowCount);
				String BranchName = reader.getCellData(SheetName, "BranchName", rowCount);
				String BranchNameErrorMSG = reader.getCellData(SheetName, "BranchNameErrorMSG", rowCount);
				String AccountNo = reader.getCellData(SheetName, "AccountNo", rowCount);
				String AccountNoErrorMSG = reader.getCellData(SheetName, "AccountNoErrorMSG", rowCount);
				String PaymentMethod = reader.getCellData(SheetName, "PaymentMethod", rowCount);
				String PreferredDrawDate = reader.getCellData(SheetName, "PreferredDrawDate", rowCount);
				String SourceOfFunds = reader.getCellData(SheetName, "SourceOfFunds", rowCount);
				String BankStatus = reader.getCellData(SheetName, "BankStatus", rowCount);


				Object ob[] = {username.trim(), password.trim(), leadID.trim(), mobileNumber.trim(),
						panNumber.trim(), day.trim(), month.trim(), year.trim(), quoteAmount.trim(), planOptions.trim(),
						smokerNonSmoker.trim(), pptOption.trim(),
						term.trim(), paymode.trim(), AciSumAssured.trim(), Rideramount.trim(),
						level.trim(), IFSCCode.trim(), IFSCErrorMSG.trim(), BankName.trim(),
						BankNameErrorMSG.trim(), BranchName.trim(), BranchNameErrorMSG.trim(), AccountNo.trim(),
						AccountNoErrorMSG.trim(), PaymentMethod.trim(), PreferredDrawDate.trim(), SourceOfFunds.trim(), BankStatus.trim()};
				myData.add(ob);
			}
		}
		System.out.println("mydata rows value **********" + myData);
		return myData;
	}


	/**
	 * Add Nominee Page data provider -- add the columns here AddNomineePage
	 */

	public ArrayList<Object[]> getAddNomineePageDataExcel(String testExcelSheet, String testName, String SheetName) {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		ArrayList<String> myColumnData = new ArrayList<String>();
		Xls_reader reader = null;

		try {
			reader = new Xls_reader(System.getProperty("user.dir") + testExcelSheet);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Add Nominee Page row count ---------" + reader.getRowCount(SheetName));
		System.out.println(" ******* current test running method  *********" + testName);
		System.out.println("**** column count  ********" + reader.getColumnCount(SheetName));

		for (int rowCount = 3; rowCount <= reader.getRowCount(SheetName); rowCount++) {
			String currentTestMethod = reader.getCellData(SheetName, "testCaseName", rowCount);
			String enableFlag = reader.getCellData(SheetName, "flag", rowCount);
			if (currentTestMethod.equalsIgnoreCase(testName)) {
				String username = reader.getCellData(SheetName, "username", rowCount);
				String password = reader.getCellData(SheetName, "password", rowCount);
				String leadID = reader.getCellData(SheetName, "leadID", rowCount);
				String mobileNumber = reader.getCellData(SheetName, "mobileNumber", rowCount);
				String panNumber = reader.getCellData(SheetName, "panNumber", rowCount);
				String day = reader.getCellData(SheetName, "day", rowCount);
				String month = reader.getCellData(SheetName, "month", rowCount);
				String year = reader.getCellData(SheetName, "year", rowCount);
				String quoteAmount = reader.getCellData(SheetName, "quoteAmount", rowCount);
				String planOptions = reader.getCellData(SheetName, "planOptions", rowCount);
				String smokerNonSmoker = reader.getCellData(SheetName, "smokerNonSmoker", rowCount);
				String pptOption = reader.getCellData(SheetName, "pptOption", rowCount);
				String term = reader.getCellData(SheetName, "term", rowCount);
				String paymode = reader.getCellData(SheetName, "paymode", rowCount);
				String AciSumAssured = reader.getCellData(SheetName, "AciSumAssured", rowCount);
				String Rideramount = reader.getCellData(SheetName, "Rideramount", rowCount);
				String level = reader.getCellData(SheetName, "level", rowCount);
				String IFSCCode = reader.getCellData(SheetName, "IFSCCode", rowCount);
				String IFSCErrorMSG = reader.getCellData(SheetName, "IFSCErrorMSG", rowCount);
				String BankName = reader.getCellData(SheetName, "BankName", rowCount);
				String BankNameErrorMSG = reader.getCellData(SheetName, "BankNameErrorMSG", rowCount);
				String BranchName = reader.getCellData(SheetName, "BranchName", rowCount);
				String BranchNameErrorMSG = reader.getCellData(SheetName, "BranchNameErrorMSG", rowCount);
				String AccountNo = reader.getCellData(SheetName, "AccountNo", rowCount);
				String AccountNoErrorMSG = reader.getCellData(SheetName, "AccountNoErrorMSG", rowCount);
				String PaymentMethod = reader.getCellData(SheetName, "PaymentMethod", rowCount);
				String PreferredDrawDate = reader.getCellData(SheetName, "PreferredDrawDate", rowCount);
				String SourceOfFunds = reader.getCellData(SheetName, "SourceOfFunds", rowCount);
				String BankStatus = reader.getCellData(SheetName, "BankStatus", rowCount);

				String nomiFirstName = reader.getCellData(SheetName, "nomiFirstName", rowCount);
				String nimiLastName = reader.getCellData(SheetName, "nimiLastName", rowCount);
				String nomiday = reader.getCellData(SheetName, "nomiday", rowCount);
				String nomimonth = reader.getCellData(SheetName, "nomimonth", rowCount);
				String nomiyear = reader.getCellData(SheetName, "nomiyear", rowCount);
				String genderValue = reader.getCellData(SheetName, "genderValue", rowCount);
				String relationshipValue = reader.getCellData(SheetName, "relationshipValue", rowCount);
				String shareValue = reader.getCellData(SheetName, "shareValue", rowCount);
				String shareErrorMSG = reader.getCellData(SheetName, "shareErrorMSG", rowCount);
				String relationshipErrorMSG = reader.getCellData(SheetName, "relationshipErrorMSG", rowCount);
				String firstNameErrorMSG = reader.getCellData(SheetName, "firstNameErrorMSG", rowCount);
				String lastNameErrorMSG = reader.getCellData(SheetName, "lastNameErrorMSG", rowCount);
				String removeMSG = reader.getCellData(SheetName, "removeMSG", rowCount);
				String nomiDOBErrorMSG = reader.getCellData(SheetName, "nomiDOBErrorMSG", rowCount);


				String AppointeeFirstName = reader.getCellData(SheetName, "AppointeeFirstName", rowCount);
				String AppointeeLastName = reader.getCellData(SheetName, "AppointeeLastName", rowCount);
				String AppointeeDD = reader.getCellData(SheetName, "AppointeeDD", rowCount);
				String AppointeeMM = reader.getCellData(SheetName, "AppointeeMM", rowCount);
				String AppointeeYY = reader.getCellData(SheetName, "AppointeeYY", rowCount);
				String AppointeeGender = reader.getCellData(SheetName, "AppointeeGender", rowCount);
				String AppointeeRealation = reader.getCellData(SheetName, "AppointeeRealation", rowCount);

				Object ob[] = {username.trim(), password.trim(), leadID.trim(), mobileNumber.trim(),
						panNumber.trim(), day.trim(), month.trim(), year.trim(), quoteAmount.trim(), planOptions.trim(),
						smokerNonSmoker.trim(), pptOption.trim(),
						term.trim(), paymode.trim(), AciSumAssured.trim(), Rideramount.trim(),
						level.trim(), IFSCCode.trim(), IFSCErrorMSG.trim(), BankName.trim(),
						BankNameErrorMSG.trim(), BranchName.trim(), BranchNameErrorMSG.trim(), AccountNo.trim(),
						AccountNoErrorMSG.trim(), PaymentMethod.trim(), PreferredDrawDate.trim(), SourceOfFunds.trim(), BankStatus.trim(),
						nomiFirstName.trim(), nimiLastName.trim(), nomiday.trim(), nomimonth.trim(), nomiyear.trim(), genderValue.trim(), relationshipValue.trim(), shareValue.trim(), shareErrorMSG.trim(), relationshipErrorMSG.trim(), firstNameErrorMSG.trim(), lastNameErrorMSG.trim(), removeMSG.trim(), nomiDOBErrorMSG.trim(),
						AppointeeFirstName.trim(), AppointeeLastName.trim(), AppointeeDD.trim(), AppointeeMM.trim(), AppointeeYY.trim(), AppointeeGender.trim(), AppointeeRealation.trim()};
				myData.add(ob);
			}
		}
		System.out.println("mydata rows value **********" + myData);
		return myData;
	}


	/**
	 * AddRESS Page data provider -- add the columns here AddNomineePage
	 */

	public ArrayList<Object[]> getAddressDataExcel(String testExcelSheet, String testName, String SheetName) {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		ArrayList<String> myColumnData = new ArrayList<String>();
		Xls_reader reader = null;

		try {
			reader = new Xls_reader(System.getProperty("user.dir") + testExcelSheet);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Add Nominee Page row count ---------" + reader.getRowCount(SheetName));
		System.out.println(" ******* current test running method  *********" + testName);
		System.out.println("**** column count  ********" + reader.getColumnCount(SheetName));

		for (int rowCount = 3; rowCount <= reader.getRowCount(SheetName); rowCount++) {
			String currentTestMethod = reader.getCellData(SheetName, "testCaseName", rowCount);
			String enableFlag = reader.getCellData(SheetName, "flag", rowCount);
			if (currentTestMethod.equalsIgnoreCase(testName)) {
				String username = reader.getCellData(SheetName, "username", rowCount);
				String password = reader.getCellData(SheetName, "password", rowCount);
				String leadID = reader.getCellData(SheetName, "leadID", rowCount);
				String mobileNumber = reader.getCellData(SheetName, "mobileNumber", rowCount);
				String panNumber = reader.getCellData(SheetName, "panNumber", rowCount);
				String day = reader.getCellData(SheetName, "day", rowCount);
				String month = reader.getCellData(SheetName, "month", rowCount);
				String year = reader.getCellData(SheetName, "year", rowCount);
				String quoteAmount = reader.getCellData(SheetName, "quoteAmount", rowCount);
				String planOptions = reader.getCellData(SheetName, "planOptions", rowCount);
				String smokerNonSmoker = reader.getCellData(SheetName, "smokerNonSmoker", rowCount);
				String pptOption = reader.getCellData(SheetName, "pptOption", rowCount);
				String term = reader.getCellData(SheetName, "term", rowCount);
				String paymode = reader.getCellData(SheetName, "paymode", rowCount);
				String AciSumAssured = reader.getCellData(SheetName, "AciSumAssured", rowCount);
				String Rideramount = reader.getCellData(SheetName, "Rideramount", rowCount);
				String level = reader.getCellData(SheetName, "level", rowCount);
				String IFSCCode = reader.getCellData(SheetName, "IFSCCode", rowCount);
				String IFSCErrorMSG = reader.getCellData(SheetName, "IFSCErrorMSG", rowCount);
				String BankName = reader.getCellData(SheetName, "BankName", rowCount);
				String BankNameErrorMSG = reader.getCellData(SheetName, "BankNameErrorMSG", rowCount);
				String BranchName = reader.getCellData(SheetName, "BranchName", rowCount);
				String BranchNameErrorMSG = reader.getCellData(SheetName, "BranchNameErrorMSG", rowCount);
				String AccountNo = reader.getCellData(SheetName, "AccountNo", rowCount);
				String AccountNoErrorMSG = reader.getCellData(SheetName, "AccountNoErrorMSG", rowCount);
				String PaymentMethod = reader.getCellData(SheetName, "PaymentMethod", rowCount);
				String PreferredDrawDate = reader.getCellData(SheetName, "PreferredDrawDate", rowCount);
				String SourceOfFunds = reader.getCellData(SheetName, "SourceOfFunds", rowCount);
				String BankStatus = reader.getCellData(SheetName, "BankStatus", rowCount);

				String nomiFirstName = reader.getCellData(SheetName, "nomiFirstName", rowCount);
				String nimiLastName = reader.getCellData(SheetName, "nimiLastName", rowCount);
				String nomiday = reader.getCellData(SheetName, "nomiday", rowCount);
				String nomimonth = reader.getCellData(SheetName, "nomimonth", rowCount);
				String nomiyear = reader.getCellData(SheetName, "nomiyear", rowCount);
				String genderValue = reader.getCellData(SheetName, "genderValue", rowCount);
				String relationshipValue = reader.getCellData(SheetName, "relationshipValue", rowCount);
				String shareValue = reader.getCellData(SheetName, "shareValue", rowCount);
				String shareErrorMSG = reader.getCellData(SheetName, "shareErrorMSG", rowCount);
				String relationshipErrorMSG = reader.getCellData(SheetName, "relationshipErrorMSG", rowCount);
				String firstNameErrorMSG = reader.getCellData(SheetName, "firstNameErrorMSG", rowCount);
				String lastNameErrorMSG = reader.getCellData(SheetName, "lastNameErrorMSG", rowCount);
				String removeMSG = reader.getCellData(SheetName, "removeMSG", rowCount);
				String nomiDOBErrorMSG = reader.getCellData(SheetName, "nomiDOBErrorMSG", rowCount);

				String addressType = reader.getCellData(SheetName, "addressType", rowCount);
				String pinCode = reader.getCellData(SheetName, "pinCode", rowCount);
				String addressOne = reader.getCellData(SheetName, "addressOne", rowCount);
				String addressTwo = reader.getCellData(SheetName, "addressTwo", rowCount);
				String addressThree = reader.getCellData(SheetName, "addressThree", rowCount);
				String pinCode2 = reader.getCellData(SheetName, "pinCode2", rowCount);
				String language = reader.getCellData(SheetName, "language", rowCount);
				String mobile = reader.getCellData(SheetName, "mobile", rowCount);
				String telNo = reader.getCellData(SheetName, "telNo", rowCount);


				Object ob[] = {username.trim(), password.trim(), leadID.trim(), mobileNumber.trim(),
						panNumber.trim(), day.trim(), month.trim(), year.trim(), quoteAmount.trim(), planOptions.trim(),
						smokerNonSmoker.trim(), pptOption.trim(),
						term.trim(), paymode.trim(), AciSumAssured.trim(), Rideramount.trim(),
						level.trim(), IFSCCode.trim(), IFSCErrorMSG.trim(), BankName.trim(),
						BankNameErrorMSG.trim(), BranchName.trim(), BranchNameErrorMSG.trim(), AccountNo.trim(),
						AccountNoErrorMSG.trim(), PaymentMethod.trim(), PreferredDrawDate.trim(), SourceOfFunds.trim(), BankStatus.trim(),
						nomiFirstName.trim(), nimiLastName.trim(), nomiday.trim(), nomimonth.trim(), nomiyear.trim(), genderValue.trim(), relationshipValue.trim(), shareValue.trim(), shareErrorMSG.trim(), relationshipErrorMSG.trim(), firstNameErrorMSG.trim(), lastNameErrorMSG.trim(), removeMSG.trim(), nomiDOBErrorMSG.trim(),
						addressType.trim(), pinCode.trim(), addressOne.trim(), addressTwo.trim(), addressThree.trim(), pinCode2.trim(), language.trim(), mobile.trim(), telNo.trim()};
				myData.add(ob);
			}
		}
		System.out.println("mydata rows value **********" + myData);
		return myData;
	}


	/**
	 * Personal Info Page data provider -- add the columns here AddNomineePage
	 */

	public ArrayList<Object[]> getPersonalInfoDataExcel(String testExcelSheet, String testName, String SheetName) {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		ArrayList<String> myColumnData = new ArrayList<String>();
		Xls_reader reader = null;

		try {
			reader = new Xls_reader(System.getProperty("user.dir") + testExcelSheet);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("PersonalInfo Page row count ---------" + reader.getRowCount(SheetName));
		System.out.println(" ******* current test running method  *********" + testName);
		System.out.println("**** column count  ********" + reader.getColumnCount(SheetName));

		for (int rowCount = 3; rowCount <= reader.getRowCount(SheetName); rowCount++) {
			String currentTestMethod = reader.getCellData(SheetName, "testCaseName", rowCount);
			String enableFlag = reader.getCellData(SheetName, "flag", rowCount);
			if (currentTestMethod.equalsIgnoreCase(testName)) {

				String username = reader.getCellData(SheetName, "username", rowCount);
				String password = reader.getCellData(SheetName, "password", rowCount);
				String leadID = reader.getCellData(SheetName, "leadID", rowCount);
				String mobileNumber = reader.getCellData(SheetName, "mobileNumber", rowCount);
				String panNumber = reader.getCellData(SheetName, "panNumber", rowCount);
				String day = reader.getCellData(SheetName, "day", rowCount);
				String month = reader.getCellData(SheetName, "month", rowCount);
				String year = reader.getCellData(SheetName, "year", rowCount);
				String quoteAmount = reader.getCellData(SheetName, "quoteAmount", rowCount);
				String planOptions = reader.getCellData(SheetName, "planOptions", rowCount);
				String smokerNonSmoker = reader.getCellData(SheetName, "smokerNonSmoker", rowCount);
				String pptOption = reader.getCellData(SheetName, "pptOption", rowCount);
				String term = reader.getCellData(SheetName, "term", rowCount);
				String paymode = reader.getCellData(SheetName, "paymode", rowCount);
				String AciSumAssured = reader.getCellData(SheetName, "AciSumAssured", rowCount);
				String Rideramount = reader.getCellData(SheetName, "Rideramount", rowCount);
				String level = reader.getCellData(SheetName, "level", rowCount);
				String IFSCCode = reader.getCellData(SheetName, "IFSCCode", rowCount);
				String IFSCErrorMSG = reader.getCellData(SheetName, "IFSCErrorMSG", rowCount);
				String BankName = reader.getCellData(SheetName, "BankName", rowCount);
				String BankNameErrorMSG = reader.getCellData(SheetName, "BankNameErrorMSG", rowCount);
				String BranchName = reader.getCellData(SheetName, "BranchName", rowCount);
				String BranchNameErrorMSG = reader.getCellData(SheetName, "BranchNameErrorMSG", rowCount);
				String AccountNo = reader.getCellData(SheetName, "AccountNo", rowCount);
				String AccountNoErrorMSG = reader.getCellData(SheetName, "AccountNoErrorMSG", rowCount);
				String PaymentMethod = reader.getCellData(SheetName, "PaymentMethod", rowCount);
				String PreferredDrawDate = reader.getCellData(SheetName, "PreferredDrawDate", rowCount);
				String SourceOfFunds = reader.getCellData(SheetName, "SourceOfFunds", rowCount);
				String BankStatus = reader.getCellData(SheetName, "BankStatus", rowCount);

				String nomiFirstName = reader.getCellData(SheetName, "nomiFirstName", rowCount);
				String nimiLastName = reader.getCellData(SheetName, "nimiLastName", rowCount);
				String nomiday = reader.getCellData(SheetName, "nomiday", rowCount);
				String nomimonth = reader.getCellData(SheetName, "nomimonth", rowCount);
				String nomiyear = reader.getCellData(SheetName, "nomiyear", rowCount);
				String genderValue = reader.getCellData(SheetName, "genderValue", rowCount);
				String relationshipValue = reader.getCellData(SheetName, "relationshipValue", rowCount);
				String shareValue = reader.getCellData(SheetName, "shareValue", rowCount);
				String shareErrorMSG = reader.getCellData(SheetName, "shareErrorMSG", rowCount);
				String relationshipErrorMSG = reader.getCellData(SheetName, "relationshipErrorMSG", rowCount);
				String firstNameErrorMSG = reader.getCellData(SheetName, "firstNameErrorMSG", rowCount);
				String lastNameErrorMSG = reader.getCellData(SheetName, "lastNameErrorMSG", rowCount);
				String removeMSG = reader.getCellData(SheetName, "removeMSG", rowCount);
				String nomiDOBErrorMSG = reader.getCellData(SheetName, "nomiDOBErrorMSG", rowCount);

				String addressType = reader.getCellData(SheetName, "addressType", rowCount);
				String pinCode = reader.getCellData(SheetName, "pinCode", rowCount);
				String addressOne = reader.getCellData(SheetName, "addressOne", rowCount);
				String addressTwo = reader.getCellData(SheetName, "addressTwo", rowCount);
				String addressThree = reader.getCellData(SheetName, "addressThree", rowCount);
				String pinCode2 = reader.getCellData(SheetName, "pinCode2", rowCount);
				String language = reader.getCellData(SheetName, "language", rowCount);
				String mobile = reader.getCellData(SheetName, "mobile", rowCount);
				String telNo = reader.getCellData(SheetName, "telNo", rowCount);

				String insurerName = reader.getCellData(SheetName, "insurerName", rowCount);
				String sumAssured = reader.getCellData(SheetName, "sumAssured", rowCount);
				String policyNumber = reader.getCellData(SheetName, "policyNumber", rowCount);
				String yearOfApplication = reader.getCellData(SheetName, "yearOfApplication", rowCount);
				String basePlan = reader.getCellData(SheetName, "basePlan", rowCount);
				String annualPremium = reader.getCellData(SheetName, "annualPremium", rowCount);
				String policyStatus = reader.getCellData(SheetName, "policyStatus", rowCount);
				String medicalPolicy = reader.getCellData(SheetName, "medicalPolicy", rowCount);
				String policyReason = reader.getCellData(SheetName, "policyReason", rowCount);
				String purposeOfInsuValue1 = reader.getCellData(SheetName, "purposeOfInsuValue1", rowCount);
				String purposeOfInsuValue2 = reader.getCellData(SheetName, "purposeOfInsuValue2", rowCount);
				String purposeOfInsuValue3 = reader.getCellData(SheetName, "purposeOfInsuValue3", rowCount);
				String provideDetailsErrorMSG = reader.getCellData(SheetName, "provideDetailsErrorMSG", rowCount);
				String selectCountryErrorMSG = reader.getCellData(SheetName, "selectCountryErrorMSG", rowCount);
				String identificationErrorMSG = reader.getCellData(SheetName, "identificationErrorMSG", rowCount);


				String Emaild = reader.getCellData(SheetName, "Emaild", rowCount);
				String EmailIDErrorMSG = reader.getCellData(SheetName, "EmailIDErrorMSG", rowCount);
				String MaritalStatus = reader.getCellData(SheetName, "MaritalStatus", rowCount);
				String fatherSpouseName = reader.getCellData(SheetName, "fatherSpouseName", rowCount);
				String motherName = reader.getCellData(SheetName, "motherName", rowCount);
				String maidenName = reader.getCellData(SheetName, "maidenName", rowCount);
				String Qualification = reader.getCellData(SheetName, "Qualification", rowCount);
				String Occupation = reader.getCellData(SheetName, "Occupation", rowCount);
				String NameOfEmployer = reader.getCellData(SheetName, "NameOfEmployer", rowCount);
				String NatureofBusiness = reader.getCellData(SheetName, "NatureofBusiness", rowCount);
				String TypeOfOrganisation = reader.getCellData(SheetName, "TypeOfOrganisation", rowCount);
				String Designation = reader.getCellData(SheetName, "Designation", rowCount);
				String AnnualIncome = reader.getCellData(SheetName, "AnnualIncome", rowCount);
				String fatherSpouseNameErrorMsg = reader.getCellData(SheetName, "fatherSpouseNameErrorMsg", rowCount);
				String motherNameErrorMsg = reader.getCellData(SheetName, "motherNameErrorMsg", rowCount);
				String maidenNameErrorMsg = reader.getCellData(SheetName, "maidenNameErrorMsg", rowCount);
				String Other = reader.getCellData(SheetName, "Other", rowCount);
				String ParentAnnualIncome = reader.getCellData(SheetName, "ParentAnnualIncome", rowCount);
				String ParentInsuranceCover = reader.getCellData(SheetName, "ParentInsuranceCover", rowCount);
				String Gstvalue = reader.getCellData(SheetName, "Gstvalue", rowCount);


				Object ob[] = {username.trim(), password.trim(), leadID.trim(), mobileNumber.trim(),
						panNumber.trim(), day.trim(), month.trim(), year.trim(), quoteAmount.trim(), planOptions.trim(),
						smokerNonSmoker.trim(), pptOption.trim(),
						term.trim(), paymode.trim(), AciSumAssured.trim(), Rideramount.trim(),
						level.trim(), IFSCCode.trim(), IFSCErrorMSG.trim(), BankName.trim(),
						BankNameErrorMSG.trim(), BranchName.trim(), BranchNameErrorMSG.trim(), AccountNo.trim(),
						AccountNoErrorMSG.trim(), PaymentMethod.trim(), PreferredDrawDate.trim(), SourceOfFunds.trim(), BankStatus.trim(),
						nomiFirstName.trim(), nimiLastName.trim(), nomiday.trim(), nomimonth.trim(), nomiyear.trim(), genderValue.trim(), relationshipValue.trim(), shareValue.trim(), shareErrorMSG.trim(), relationshipErrorMSG.trim(), firstNameErrorMSG.trim(), lastNameErrorMSG.trim(), removeMSG.trim(), nomiDOBErrorMSG.trim(),
						addressType.trim(), pinCode.trim(), addressOne.trim(), addressTwo.trim(), addressThree.trim(), pinCode2.trim(), language.trim(), mobile.trim(), telNo.trim(), insurerName.trim(), sumAssured.trim(), policyNumber.trim(), yearOfApplication.trim(), basePlan.trim(), annualPremium.trim(), policyStatus.trim(), medicalPolicy.trim(), policyReason.trim(), purposeOfInsuValue1.trim(), purposeOfInsuValue2.trim(), purposeOfInsuValue3.trim(), provideDetailsErrorMSG.trim(),
						selectCountryErrorMSG.trim(), identificationErrorMSG.trim(), Emaild.trim(), EmailIDErrorMSG.trim(), MaritalStatus.trim(), fatherSpouseName.trim(), motherName.trim(), maidenName.trim(),
						Qualification.trim(), Occupation.trim(), NameOfEmployer.trim(), NatureofBusiness.trim(), TypeOfOrganisation.trim(), Designation.trim(), AnnualIncome.trim(),
						fatherSpouseNameErrorMsg.trim(), motherNameErrorMsg.trim(), maidenNameErrorMsg.trim(), Other.trim(), ParentAnnualIncome.trim(), ParentInsuranceCover.trim(), Gstvalue.trim()};
				myData.add(ob);
			}
		}
		System.out.println("mydata rows value **********" + myData);
		return myData;
	}


	/**
	 * Health Detalis Page data provider -- add the columns here AddNomineePage
	 */

	public ArrayList<Object[]> getHealthDetailDataExcel(String testExcelSheet, String testName, String SheetName) {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		ArrayList<String> myColumnData = new ArrayList<String>();
		Xls_reader reader = null;

		try {
			reader = new Xls_reader(System.getProperty("user.dir") + testExcelSheet);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Health Details Page row count ---------" + reader.getRowCount(SheetName));
		System.out.println(" ******* current test running method  *********" + testName);
		System.out.println("**** column count  ********" + reader.getColumnCount(SheetName));

		for (int rowCount = 3; rowCount <= reader.getRowCount(SheetName); rowCount++) {
			String currentTestMethod = reader.getCellData(SheetName, "testCaseName", rowCount);
			String enableFlag = reader.getCellData(SheetName, "flag", rowCount);
			if (currentTestMethod.equalsIgnoreCase(testName)) {

				String username = reader.getCellData(SheetName, "username", rowCount);
				String password = reader.getCellData(SheetName, "password", rowCount);
				String leadID = reader.getCellData(SheetName, "leadID", rowCount);
				String mobileNumber = reader.getCellData(SheetName, "mobileNumber", rowCount);
				String panNumber = reader.getCellData(SheetName, "panNumber", rowCount);
				String day = reader.getCellData(SheetName, "day", rowCount);
				String month = reader.getCellData(SheetName, "month", rowCount);
				String year = reader.getCellData(SheetName, "year", rowCount);
				String quoteAmount = reader.getCellData(SheetName, "quoteAmount", rowCount);
				String planOptions = reader.getCellData(SheetName, "planOptions", rowCount);
				String smokerNonSmoker = reader.getCellData(SheetName, "smokerNonSmoker", rowCount);
				String pptOption = reader.getCellData(SheetName, "pptOption", rowCount);
				String term = reader.getCellData(SheetName, "term", rowCount);
				String paymode = reader.getCellData(SheetName, "paymode", rowCount);
				String AciSumAssured = reader.getCellData(SheetName, "AciSumAssured", rowCount);
				String Rideramount = reader.getCellData(SheetName, "Rideramount", rowCount);
				String level = reader.getCellData(SheetName, "level", rowCount);
				String IFSCCode = reader.getCellData(SheetName, "IFSCCode", rowCount);
				String IFSCErrorMSG = reader.getCellData(SheetName, "IFSCErrorMSG", rowCount);
				String BankName = reader.getCellData(SheetName, "BankName", rowCount);
				String BankNameErrorMSG = reader.getCellData(SheetName, "BankNameErrorMSG", rowCount);
				String BranchName = reader.getCellData(SheetName, "BranchName", rowCount);
				String BranchNameErrorMSG = reader.getCellData(SheetName, "BranchNameErrorMSG", rowCount);
				String AccountNo = reader.getCellData(SheetName, "AccountNo", rowCount);
				String AccountNoErrorMSG = reader.getCellData(SheetName, "AccountNoErrorMSG", rowCount);
				String PaymentMethod = reader.getCellData(SheetName, "PaymentMethod", rowCount);
				String PreferredDrawDate = reader.getCellData(SheetName, "PreferredDrawDate", rowCount);
				String SourceOfFunds = reader.getCellData(SheetName, "SourceOfFunds", rowCount);
				String BankStatus = reader.getCellData(SheetName, "BankStatus", rowCount);

				String nomiFirstName = reader.getCellData(SheetName, "nomiFirstName", rowCount);
				String nimiLastName = reader.getCellData(SheetName, "nimiLastName", rowCount);
				String nomiday = reader.getCellData(SheetName, "nomiday", rowCount);
				String nomimonth = reader.getCellData(SheetName, "nomimonth", rowCount);
				String nomiyear = reader.getCellData(SheetName, "nomiyear", rowCount);
				String genderValue = reader.getCellData(SheetName, "genderValue", rowCount);
				String relationshipValue = reader.getCellData(SheetName, "relationshipValue", rowCount);
				String shareValue = reader.getCellData(SheetName, "shareValue", rowCount);
				String shareErrorMSG = reader.getCellData(SheetName, "shareErrorMSG", rowCount);
				String relationshipErrorMSG = reader.getCellData(SheetName, "relationshipErrorMSG", rowCount);
				String firstNameErrorMSG = reader.getCellData(SheetName, "firstNameErrorMSG", rowCount);
				String lastNameErrorMSG = reader.getCellData(SheetName, "lastNameErrorMSG", rowCount);
				String removeMSG = reader.getCellData(SheetName, "removeMSG", rowCount);
				String nomiDOBErrorMSG = reader.getCellData(SheetName, "nomiDOBErrorMSG", rowCount);

				String addressType = reader.getCellData(SheetName, "addressType", rowCount);
				String pinCode = reader.getCellData(SheetName, "pinCode", rowCount);
				String addressOne = reader.getCellData(SheetName, "addressOne", rowCount);
				String addressTwo = reader.getCellData(SheetName, "addressTwo", rowCount);
				String addressThree = reader.getCellData(SheetName, "addressThree", rowCount);
				String pinCode2 = reader.getCellData(SheetName, "pinCode2", rowCount);
				String language = reader.getCellData(SheetName, "language", rowCount);
				String mobile = reader.getCellData(SheetName, "mobile", rowCount);
				String telNo = reader.getCellData(SheetName, "telNo", rowCount);

				String insurerName = reader.getCellData(SheetName, "insurerName", rowCount);
				String sumAssured = reader.getCellData(SheetName, "sumAssured", rowCount);
				String policyNumber = reader.getCellData(SheetName, "policyNumber", rowCount);
				String yearOfApplication = reader.getCellData(SheetName, "yearOfApplication", rowCount);
				String basePlan = reader.getCellData(SheetName, "basePlan", rowCount);
				String annualPremium = reader.getCellData(SheetName, "annualPremium", rowCount);
				String policyStatus = reader.getCellData(SheetName, "policyStatus", rowCount);
				String medicalPolicy = reader.getCellData(SheetName, "medicalPolicy", rowCount);
				String policyReason = reader.getCellData(SheetName, "policyReason", rowCount);
				String purposeOfInsuValue1 = reader.getCellData(SheetName, "purposeOfInsuValue1", rowCount);
				String purposeOfInsuValue2 = reader.getCellData(SheetName, "purposeOfInsuValue2", rowCount);
				String purposeOfInsuValue3 = reader.getCellData(SheetName, "purposeOfInsuValue3", rowCount);
				String provideDetailsErrorMSG = reader.getCellData(SheetName, "provideDetailsErrorMSG", rowCount);
				String selectCountryErrorMSG = reader.getCellData(SheetName, "selectCountryErrorMSG", rowCount);
				String identificationErrorMSG = reader.getCellData(SheetName, "identificationErrorMSG", rowCount);


				String Emaild = reader.getCellData(SheetName, "Emaild", rowCount);
				String EmailIDErrorMSG = reader.getCellData(SheetName, "EmailIDErrorMSG", rowCount);
				String MaritalStatus = reader.getCellData(SheetName, "MaritalStatus", rowCount);
				String fatherSpouseName = reader.getCellData(SheetName, "fatherSpouseName", rowCount);
				String motherName = reader.getCellData(SheetName, "motherName", rowCount);
				String maidenName = reader.getCellData(SheetName, "maidenName", rowCount);
				String Qualification = reader.getCellData(SheetName, "Qualification", rowCount);
				String Occupation = reader.getCellData(SheetName, "Occupation", rowCount);
				String NameOfEmployer = reader.getCellData(SheetName, "NameOfEmployer", rowCount);
				String NatureofBusiness = reader.getCellData(SheetName, "NatureofBusiness", rowCount);
				String TypeOfOrganisation = reader.getCellData(SheetName, "TypeOfOrganisation", rowCount);
				String Designation = reader.getCellData(SheetName, "Designation", rowCount);
				String AnnualIncome = reader.getCellData(SheetName, "AnnualIncome", rowCount);
				String fatherSpouseNameErrorMsg = reader.getCellData(SheetName, "fatherSpouseNameErrorMsg", rowCount);
				String motherNameErrorMsg = reader.getCellData(SheetName, "motherNameErrorMsg", rowCount);
				String maidenNameErrorMsg = reader.getCellData(SheetName, "maidenNameErrorMsg", rowCount);
				String Other = reader.getCellData(SheetName, "Other", rowCount);
				String ParentAnnualIncome = reader.getCellData(SheetName, "ParentAnnualIncome", rowCount);
				String ParentInsuranceCover = reader.getCellData(SheetName, "ParentInsuranceCover", rowCount);
				String Gstvalue = reader.getCellData(SheetName, "Gstvalue", rowCount);


				String ClickOnhealthDetailTab = reader.getCellData(SheetName, "ClickOnhealthDetailTab", rowCount);
				String weight = reader.getCellData(SheetName, "weight", rowCount);
				String WaightChange = reader.getCellData(SheetName, "WaightChange", rowCount);
				String NoOfChangeWaight = reader.getCellData(SheetName, "NoOfChangeWaight", rowCount);
				String Narcotics = reader.getCellData(SheetName, "Narcotics", rowCount);
				String ReasonForNarcotic = reader.getCellData(SheetName, "ReasonForNarcotic", rowCount);
				String Alcohol = reader.getCellData(SheetName, "Alcohol", rowCount);
				String TpeofAlcohol = reader.getCellData(SheetName, "TpeofAlcohol", rowCount);
				String Quantity = reader.getCellData(SheetName, "Quantity", rowCount);
				String Frequency = reader.getCellData(SheetName, "Frequency", rowCount);
				String Tobacco = reader.getCellData(SheetName, "Tobacco", rowCount);
				String TypeofTobacco = reader.getCellData(SheetName, "TypeofTobacco", rowCount);
				String CigrateQuantity = reader.getCellData(SheetName, "CigrateQuantity", rowCount);
				String CigrateNoOfYear = reader.getCellData(SheetName, "CigrateNoOfYear", rowCount);
				String Hazardous = reader.getCellData(SheetName, "Hazardous", rowCount);
				String hazarSelectOption1 = reader.getCellData(SheetName, "hazarSelectOption1", rowCount);
				String hazaTimeofYear = reader.getCellData(SheetName, "hazaTimeofYear", rowCount);
				String hazarSelectOption2 = reader.getCellData(SheetName, "hazarSelectOption2", rowCount);
				String Travell = reader.getCellData(SheetName, "Travell", rowCount);


				Object ob[] = {username.trim(), password.trim(), leadID.trim(), mobileNumber.trim(),
						panNumber.trim(), day.trim(), month.trim(), year.trim(), quoteAmount.trim(), planOptions.trim(),
						smokerNonSmoker.trim(), pptOption.trim(),
						term.trim(), paymode.trim(), AciSumAssured.trim(), Rideramount.trim(),
						level.trim(), IFSCCode.trim(), IFSCErrorMSG.trim(), BankName.trim(),
						BankNameErrorMSG.trim(), BranchName.trim(), BranchNameErrorMSG.trim(), AccountNo.trim(),
						AccountNoErrorMSG.trim(), PaymentMethod.trim(), PreferredDrawDate.trim(), SourceOfFunds.trim(), BankStatus.trim(),
						nomiFirstName.trim(), nimiLastName.trim(), nomiday.trim(), nomimonth.trim(), nomiyear.trim(), genderValue.trim(), relationshipValue.trim(), shareValue.trim(), shareErrorMSG.trim(), relationshipErrorMSG.trim(), firstNameErrorMSG.trim(), lastNameErrorMSG.trim(), removeMSG.trim(), nomiDOBErrorMSG.trim(),
						addressType.trim(), pinCode.trim(), addressOne.trim(), addressTwo.trim(), addressThree.trim(), pinCode2.trim(), language.trim(), mobile.trim(), telNo.trim(), insurerName.trim(), sumAssured.trim(), policyNumber.trim(), yearOfApplication.trim(), basePlan.trim(), annualPremium.trim(), policyStatus.trim(), medicalPolicy.trim(), policyReason.trim(), purposeOfInsuValue1.trim(), purposeOfInsuValue2.trim(), purposeOfInsuValue3.trim(), provideDetailsErrorMSG.trim(),
						selectCountryErrorMSG.trim(), identificationErrorMSG.trim(), Emaild.trim(), EmailIDErrorMSG.trim(), MaritalStatus.trim(), fatherSpouseName.trim(), motherName.trim(), maidenName.trim(),
						Qualification.trim(), Occupation.trim(), NameOfEmployer.trim(), NatureofBusiness.trim(), TypeOfOrganisation.trim(), Designation.trim(), AnnualIncome.trim(),
						fatherSpouseNameErrorMsg.trim(), motherNameErrorMsg.trim(), maidenNameErrorMsg.trim(), Other.trim(), ParentAnnualIncome.trim(), ParentInsuranceCover.trim(), Gstvalue.trim(), ClickOnhealthDetailTab.trim(), weight.trim(), WaightChange.trim(), NoOfChangeWaight.trim(), Narcotics.trim(), ReasonForNarcotic.trim(), Alcohol.trim(), TpeofAlcohol.trim(), Quantity.trim(), Frequency.trim(), Tobacco.trim(), TypeofTobacco.trim(), CigrateQuantity.trim(), CigrateNoOfYear.trim(),
						Hazardous.trim(), hazarSelectOption1.trim(), hazaTimeofYear.trim(), hazarSelectOption2.trim(), Travell.trim()};
				myData.add(ob);
			}
		}
		System.out.println("mydata rows value **********" + myData);
		return myData;
	}


	public ArrayList<Object[]> getHealthDetailDataExcelNew(String testExcelSheet, String testName, String SheetName) {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		ArrayList<String> myColumnData = new ArrayList<String>();
		Xls_reader reader = null;

		try {
			reader = new Xls_reader(System.getProperty("user.dir") + testExcelSheet);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Health Details Page row count ---------" + reader.getRowCount(SheetName));
		System.out.println(" ******* current test running method  *********" + testName);
		System.out.println("**** column count  ********" + reader.getColumnCount(SheetName));

		for (int rowCount = 3; rowCount <= reader.getRowCount(SheetName); rowCount++) {
			String currentTestMethod = reader.getCellData(SheetName, "testCaseName", rowCount);
			String enableFlag = reader.getCellData(SheetName, "flag", rowCount);
			if (currentTestMethod.equalsIgnoreCase(testName)) {

				String username = reader.getCellData(SheetName, "username", rowCount);
				String password = reader.getCellData(SheetName, "password", rowCount);
				String leadID = reader.getCellData(SheetName, "leadID", rowCount);
				String mobileNumber = reader.getCellData(SheetName, "mobileNumber", rowCount);
				String panNumber = reader.getCellData(SheetName, "panNumber", rowCount);
				String day = reader.getCellData(SheetName, "day", rowCount);
				String month = reader.getCellData(SheetName, "month", rowCount);
				String year = reader.getCellData(SheetName, "year", rowCount);
//				String quoteAmount = reader.getCellData(SheetName, "quoteAmount", rowCount);
//				String planOptions = reader.getCellData(SheetName, "planOptions", rowCount);
//				String smokerNonSmoker = reader.getCellData(SheetName, "smokerNonSmoker", rowCount);
//				String pptOption = reader.getCellData(SheetName, "pptOption", rowCount);
//				String term = reader.getCellData(SheetName, "term", rowCount);
//				String paymode = reader.getCellData(SheetName, "paymode", rowCount);
//				String AciSumAssured = reader.getCellData(SheetName, "AciSumAssured", rowCount);
//				String Rideramount = reader.getCellData(SheetName, "Rideramount", rowCount);
//				String level = reader.getCellData(SheetName, "level", rowCount);
				String IFSCCode = reader.getCellData(SheetName, "IFSCCode", rowCount);
//				String IFSCErrorMSG = reader.getCellData(SheetName, "IFSCErrorMSG", rowCount);
//				String BankName = reader.getCellData(SheetName, "BankName", rowCount);
//				String BankNameErrorMSG = reader.getCellData(SheetName, "BankNameErrorMSG", rowCount);
//				String BranchName = reader.getCellData(SheetName, "BranchName", rowCount);
//				String BranchNameErrorMSG = reader.getCellData(SheetName, "BranchNameErrorMSG", rowCount);
				String AccountNo = reader.getCellData(SheetName, "AccountNo", rowCount);
				//String AccountNoErrorMSG = reader.getCellData(SheetName, "AccountNoErrorMSG", rowCount);
				String PaymentMethod = reader.getCellData(SheetName, "PaymentMethod", rowCount);
				String PreferredDrawDate = reader.getCellData(SheetName, "PreferredDrawDate", rowCount);
				String SourceOfFunds = reader.getCellData(SheetName, "SourceOfFunds", rowCount);
				//String BankStatus = reader.getCellData(SheetName, "BankStatus", rowCount);

				String nomiFirstName = reader.getCellData(SheetName, "nomiFirstName", rowCount);
				String nimiLastName = reader.getCellData(SheetName, "nimiLastName", rowCount);
				String nomiday = reader.getCellData(SheetName, "nomiday", rowCount);
				String nomimonth = reader.getCellData(SheetName, "nomimonth", rowCount);
				String nomiyear = reader.getCellData(SheetName, "nomiyear", rowCount);
				String genderValue = reader.getCellData(SheetName, "genderValue", rowCount);
				String relationshipValue = reader.getCellData(SheetName, "relationshipValue", rowCount);
				String shareValue = reader.getCellData(SheetName, "shareValue", rowCount);
				//String shareErrorMSG = reader.getCellData(SheetName, "shareErrorMSG", rowCount);
				//String relationshipErrorMSG = reader.getCellData(SheetName, "relationshipErrorMSG", rowCount);
				//String firstNameErrorMSG = reader.getCellData(SheetName, "firstNameErrorMSG", rowCount);
				//String lastNameErrorMSG = reader.getCellData(SheetName, "lastNameErrorMSG", rowCount);
				String removeMSG = reader.getCellData(SheetName, "removeMSG", rowCount);
				//String nomiDOBErrorMSG = reader.getCellData(SheetName, "nomiDOBErrorMSG", rowCount);

				String addressType = reader.getCellData(SheetName, "addressType", rowCount);
				String pinCode = reader.getCellData(SheetName, "pinCode", rowCount);
				String addressOne = reader.getCellData(SheetName, "addressOne", rowCount);
				String addressTwo = reader.getCellData(SheetName, "addressTwo", rowCount);
				String addressThree = reader.getCellData(SheetName, "addressThree", rowCount);
				String pinCode2 = reader.getCellData(SheetName, "pinCode2", rowCount);
				String language = reader.getCellData(SheetName, "language", rowCount);
				String mobile = reader.getCellData(SheetName, "mobile", rowCount);
				String telNo = reader.getCellData(SheetName, "telNo", rowCount);

//				String insurerName = reader.getCellData(SheetName, "insurerName", rowCount);
//				String sumAssured = reader.getCellData(SheetName, "sumAssured", rowCount);
//				String policyNumber = reader.getCellData(SheetName, "policyNumber", rowCount);
//				String yearOfApplication = reader.getCellData(SheetName, "yearOfApplication", rowCount);
//				String basePlan = reader.getCellData(SheetName, "basePlan", rowCount);
//				String annualPremium = reader.getCellData(SheetName, "annualPremium", rowCount);
//				String policyStatus = reader.getCellData(SheetName, "policyStatus", rowCount);
//				String medicalPolicy = reader.getCellData(SheetName, "medicalPolicy", rowCount);
				//String policyReason = reader.getCellData(SheetName, "policyReason", rowCount);
				//String purposeOfInsuValue1 = reader.getCellData(SheetName, "purposeOfInsuValue1", rowCount);
//				String purposeOfInsuValue2 = reader.getCellData(SheetName, "purposeOfInsuValue2", rowCount);
//				String purposeOfInsuValue3 = reader.getCellData(SheetName, "purposeOfInsuValue3", rowCount);
//				String provideDetailsErrorMSG = reader.getCellData(SheetName, "provideDetailsErrorMSG", rowCount);
//				String selectCountryErrorMSG = reader.getCellData(SheetName, "selectCountryErrorMSG", rowCount);
//				String identificationErrorMSG = reader.getCellData(SheetName, "identificationErrorMSG", rowCount);
//				


				String Emaild = reader.getCellData(SheetName, "Emaild", rowCount);
				//String EmailIDErrorMSG = reader.getCellData(SheetName, "EmailIDErrorMSG", rowCount);
				String MaritalStatus = reader.getCellData(SheetName, "MaritalStatus", rowCount);
				String fatherSpouseName = reader.getCellData(SheetName, "fatherSpouseName", rowCount);
				String motherName = reader.getCellData(SheetName, "motherName", rowCount);
				String maidenName = reader.getCellData(SheetName, "maidenName", rowCount);
				String Qualification = reader.getCellData(SheetName, "Qualification", rowCount);
				String Occupation = reader.getCellData(SheetName, "Occupation", rowCount);
				String NameOfEmployer = reader.getCellData(SheetName, "NameOfEmployer", rowCount);
				String NatureofBusiness = reader.getCellData(SheetName, "NatureofBusiness", rowCount);
				String TypeOfOrganisation = reader.getCellData(SheetName, "TypeOfOrganisation", rowCount);
				String Designation = reader.getCellData(SheetName, "Designation", rowCount);
				String AnnualIncome = reader.getCellData(SheetName, "AnnualIncome", rowCount);
				//String fatherSpouseNameErrorMsg = reader.getCellData(SheetName, "fatherSpouseNameErrorMsg", rowCount);
				//String motherNameErrorMsg = reader.getCellData(SheetName, "motherNameErrorMsg", rowCount);
				//String maidenNameErrorMsg = reader.getCellData(SheetName, "maidenNameErrorMsg", rowCount);
				//String Other = reader.getCellData(SheetName, "Other", rowCount);
				//String ParentAnnualIncome = reader.getCellData(SheetName, "ParentAnnualIncome", rowCount);
				//String ParentInsuranceCover = reader.getCellData(SheetName, "ParentInsuranceCover", rowCount);
				//String Gstvalue = reader.getCellData(SheetName, "Gstvalue", rowCount);


				String ClickOnhealthDetailTab = reader.getCellData(SheetName, "ClickOnhealthDetailTab", rowCount);
				String weight = reader.getCellData(SheetName, "weight", rowCount);
				String WaightChange = reader.getCellData(SheetName, "WaightChange", rowCount);
				String NoOfChangeWaight = reader.getCellData(SheetName, "NoOfChangeWaight", rowCount);
				String Narcotics = reader.getCellData(SheetName, "Narcotics", rowCount);
				String ReasonForNarcotic = reader.getCellData(SheetName, "ReasonForNarcotic", rowCount);
				String Alcohol = reader.getCellData(SheetName, "Alcohol", rowCount);
				String TpeofAlcohol = reader.getCellData(SheetName, "TpeofAlcohol", rowCount);
				String Quantity = reader.getCellData(SheetName, "Quantity", rowCount);
				String Frequency = reader.getCellData(SheetName, "Frequency", rowCount);
				String Tobacco = reader.getCellData(SheetName, "Tobacco", rowCount);
				String TypeofTobacco = reader.getCellData(SheetName, "TypeofTobacco", rowCount);
				String CigrateQuantity = reader.getCellData(SheetName, "CigrateQuantity", rowCount);
				String CigrateNoOfYear = reader.getCellData(SheetName, "CigrateNoOfYear", rowCount);
				String Hazardous = reader.getCellData(SheetName, "Hazardous", rowCount);
				String hazarSelectOption1 = reader.getCellData(SheetName, "hazarSelectOption1", rowCount);
				String hazaTimeofYear = reader.getCellData(SheetName, "hazaTimeofYear", rowCount);
				String hazarSelectOption2 = reader.getCellData(SheetName, "hazarSelectOption2", rowCount);
				String Travell = reader.getCellData(SheetName, "Travell", rowCount);
				String AbsentFromWork = reader.getCellData(SheetName, "AbsentFromWork", rowCount);
				String CurrentSymtoms = reader.getCellData(SheetName, "CurrentSymtoms", rowCount);
				String DoctorDetails = reader.getCellData(SheetName, "DoctorDetails", rowCount);
				String DateOfLastDay = reader.getCellData(SheetName, "DateOfLastDay", rowCount);
				String DateOfLastMonth = reader.getCellData(SheetName, "DateOfLastMonth", rowCount);
				String DateOfLastYear = reader.getCellData(SheetName, "DateOfLastYear", rowCount);
				String DetailsOfHospitalization = reader.getCellData(SheetName, "DetailsOfHospitalization", rowCount);
				String ClickonHospitalize = reader.getCellData(SheetName, "ClickonHospitalize", rowCount);
				String ClickOnDisorder = reader.getCellData(SheetName, "ClickOnDisorder", rowCount);
				String ClickOnSpouseHealth = reader.getCellData(SheetName, "ClickOnSpouseHealth", rowCount);
				String ClickOnOtherSymptoms = reader.getCellData(SheetName, "ClickOnOtherSymptoms", rowCount);
				String ClickOnForFemaleOnly = reader.getCellData(SheetName, "ClickOnForFemaleOnly", rowCount);
				String NoOfWeek = reader.getCellData(SheetName, "NoOfWeek", rowCount);
				String ClickOnHaveYouSufferFrom = reader.getCellData(SheetName, "ClickOnHaveYouSufferFrom", rowCount);

				String ClickOnAilments = reader.getCellData(SheetName, "ClickOnAilments", rowCount);
				String DisplayAllAilment = reader.getCellData(SheetName, "DisplayAllAilment", rowCount);
				String StateTheDiagnos = reader.getCellData(SheetName, "DisplayAllStateTheDiagnos", rowCount);
				String ChestPainOther = reader.getCellData(SheetName, "ChestPainOther", rowCount);
				String HadReccurence = reader.getCellData(SheetName, "HaveYouHadReccurence", rowCount);
				String LHBloodDateOfLastConsult = reader.getCellData(SheetName, "LHBloodDateOfLastConsult", rowCount);
				String LHBlooddateOfDiagnos = reader.getCellData(SheetName, "LHBlooddateOfDiagnos", rowCount);


				String FMBSLivingDemise = reader.getCellData(SheetName, "FMBSLivingDemise", rowCount);
				String FMBSAgeDeath = reader.getCellData(SheetName, "FMBSAgeDeath", rowCount);
				String FMBSStateAndCause = reader.getCellData(SheetName, "FMBSStateAndCause", rowCount);
				String covidText = reader.getCellData(SheetName, "covidText", rowCount);
				String covidDD = reader.getCellData(SheetName, "covidDD", rowCount);
				String covidMM = reader.getCellData(SheetName, "covidMM", rowCount);
				String covidYY = reader.getCellData(SheetName, "covidYY", rowCount);


				Object ob[] = {username.trim(), password.trim(), leadID.trim(), mobileNumber.trim(),
						panNumber.trim(), day.trim(), month.trim(), year.trim(), IFSCCode.trim(), AccountNo.trim(),
						PaymentMethod.trim(), PreferredDrawDate.trim(), SourceOfFunds.trim(),
						nomiFirstName.trim(), nimiLastName.trim(), nomiday.trim(), nomimonth.trim(), nomiyear.trim(), genderValue.trim(), relationshipValue.trim(), shareValue.trim(), removeMSG.trim(),
						addressType.trim(), pinCode.trim(), addressOne.trim(), addressTwo.trim(), addressThree.trim(), pinCode2.trim(), language.trim(), mobile.trim(), telNo.trim(),
						Emaild.trim(), MaritalStatus.trim(), fatherSpouseName.trim(), motherName.trim(), maidenName.trim(),
						Qualification.trim(), Occupation.trim(), NameOfEmployer.trim(), NatureofBusiness.trim(), TypeOfOrganisation.trim(), Designation.trim(), AnnualIncome.trim(),
						ClickOnhealthDetailTab.trim(), weight.trim(), WaightChange.trim(), NoOfChangeWaight.trim(), Narcotics.trim(), ReasonForNarcotic.trim(), Alcohol.trim(), TpeofAlcohol.trim(), Quantity.trim(), Frequency.trim(), Tobacco.trim(), TypeofTobacco.trim(), CigrateQuantity.trim(), CigrateNoOfYear.trim(),
						Hazardous.trim(), hazarSelectOption1.trim(), hazaTimeofYear.trim(), hazarSelectOption2.trim(), Travell.trim(), AbsentFromWork.trim(), CurrentSymtoms.trim(), DoctorDetails.trim(), DateOfLastDay.trim(), DateOfLastMonth.trim(), DateOfLastYear.trim(), DetailsOfHospitalization.trim(), ClickonHospitalize.trim(),
						ClickOnDisorder.trim(), ClickOnSpouseHealth.trim(), ClickOnOtherSymptoms.trim(), ClickOnForFemaleOnly.trim(), NoOfWeek.trim(), ClickOnHaveYouSufferFrom.trim(), ClickOnAilments.trim(), DisplayAllAilment.trim(), StateTheDiagnos.trim(), ChestPainOther.trim(), HadReccurence.trim(),
						LHBloodDateOfLastConsult.trim(), LHBlooddateOfDiagnos.trim(), FMBSLivingDemise.trim(), FMBSAgeDeath.trim(),
						FMBSStateAndCause.trim(), covidText.trim(), covidDD.trim(), covidMM.trim(), covidYY.trim()};
				myData.add(ob);
			}
		}
		System.out.println("mydata rows value **********" + myData);
		return myData;
	}


	public ArrayList<Object[]> getReviewAndAcceptDataExcel(String testExcelSheet, String testName, String SheetName) {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		ArrayList<String> myColumnData = new ArrayList<String>();
		Xls_reader reader = null;

		try {
			reader = new Xls_reader(System.getProperty("user.dir") + testExcelSheet);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Health Details Page row count ---------" + reader.getRowCount(SheetName));
		System.out.println(" ******* current test running method  *********" + testName);
		System.out.println("**** column count  ********" + reader.getColumnCount(SheetName));

		for (int rowCount = 3; rowCount <= reader.getRowCount(SheetName); rowCount++) {
			String currentTestMethod = reader.getCellData(SheetName, "testCaseName", rowCount);
			String enableFlag = reader.getCellData(SheetName, "flag", rowCount);
			if (currentTestMethod.equalsIgnoreCase(testName)) {

				String username = reader.getCellData(SheetName, "username", rowCount);
				String password = reader.getCellData(SheetName, "password", rowCount);
				String leadID = reader.getCellData(SheetName, "leadID", rowCount);
				String mobileNumber = reader.getCellData(SheetName, "mobileNumber", rowCount);
				String panNumber = reader.getCellData(SheetName, "panNumber", rowCount);
				String day = reader.getCellData(SheetName, "day", rowCount);
				String month = reader.getCellData(SheetName, "month", rowCount);
				String year = reader.getCellData(SheetName, "year", rowCount);
				String quoteAmount = reader.getCellData(SheetName, "quoteAmount", rowCount);
				String planOptions = reader.getCellData(SheetName, "planOptions", rowCount);
				String smokerNonSmoker = reader.getCellData(SheetName, "smokerNonSmoker", rowCount);
				String pptOption = reader.getCellData(SheetName, "pptOption", rowCount);
				String term = reader.getCellData(SheetName, "term", rowCount);
				String paymode = reader.getCellData(SheetName, "paymode", rowCount);
				String AciSumAssured = reader.getCellData(SheetName, "AciSumAssured", rowCount);
				String Rideramount = reader.getCellData(SheetName, "Rideramount", rowCount);
				String level = reader.getCellData(SheetName, "level", rowCount);
				String IFSCCode = reader.getCellData(SheetName, "IFSCCode", rowCount);
				String IFSCErrorMSG = reader.getCellData(SheetName, "IFSCErrorMSG", rowCount);
				String BankName = reader.getCellData(SheetName, "BankName", rowCount);
				String BankNameErrorMSG = reader.getCellData(SheetName, "BankNameErrorMSG", rowCount);
				String BranchName = reader.getCellData(SheetName, "BranchName", rowCount);
				String BranchNameErrorMSG = reader.getCellData(SheetName, "BranchNameErrorMSG", rowCount);
				String AccountNo = reader.getCellData(SheetName, "AccountNo", rowCount);
				String AccountNoErrorMSG = reader.getCellData(SheetName, "AccountNoErrorMSG", rowCount);
				String PaymentMethod = reader.getCellData(SheetName, "PaymentMethod", rowCount);
				String PreferredDrawDate = reader.getCellData(SheetName, "PreferredDrawDate", rowCount);
				String SourceOfFunds = reader.getCellData(SheetName, "SourceOfFunds", rowCount);
				String BankStatus = reader.getCellData(SheetName, "BankStatus", rowCount);

				String nomiFirstName = reader.getCellData(SheetName, "nomiFirstName", rowCount);
				String nimiLastName = reader.getCellData(SheetName, "nimiLastName", rowCount);
				String nomiday = reader.getCellData(SheetName, "nomiday", rowCount);
				String nomimonth = reader.getCellData(SheetName, "nomimonth", rowCount);
				String nomiyear = reader.getCellData(SheetName, "nomiyear", rowCount);
				String genderValue = reader.getCellData(SheetName, "genderValue", rowCount);
				String relationshipValue = reader.getCellData(SheetName, "relationshipValue", rowCount);
				String shareValue = reader.getCellData(SheetName, "shareValue", rowCount);
				String shareErrorMSG = reader.getCellData(SheetName, "shareErrorMSG", rowCount);
				String relationshipErrorMSG = reader.getCellData(SheetName, "relationshipErrorMSG", rowCount);
				String firstNameErrorMSG = reader.getCellData(SheetName, "firstNameErrorMSG", rowCount);
				String lastNameErrorMSG = reader.getCellData(SheetName, "lastNameErrorMSG", rowCount);
				String removeMSG = reader.getCellData(SheetName, "removeMSG", rowCount);
				String nomiDOBErrorMSG = reader.getCellData(SheetName, "nomiDOBErrorMSG", rowCount);

				String addressType = reader.getCellData(SheetName, "addressType", rowCount);
				String pinCode = reader.getCellData(SheetName, "pinCode", rowCount);
				String addressOne = reader.getCellData(SheetName, "addressOne", rowCount);
				String addressTwo = reader.getCellData(SheetName, "addressTwo", rowCount);
				String addressThree = reader.getCellData(SheetName, "addressThree", rowCount);
				String pinCode2 = reader.getCellData(SheetName, "pinCode2", rowCount);
				String language = reader.getCellData(SheetName, "language", rowCount);
				String mobile = reader.getCellData(SheetName, "mobile", rowCount);
				String telNo = reader.getCellData(SheetName, "telNo", rowCount);

				String insurerName = reader.getCellData(SheetName, "insurerName", rowCount);
				String sumAssured = reader.getCellData(SheetName, "sumAssured", rowCount);
				String policyNumber = reader.getCellData(SheetName, "policyNumber", rowCount);
				String yearOfApplication = reader.getCellData(SheetName, "yearOfApplication", rowCount);
				String basePlan = reader.getCellData(SheetName, "basePlan", rowCount);
				String annualPremium = reader.getCellData(SheetName, "annualPremium", rowCount);
				String policyStatus = reader.getCellData(SheetName, "policyStatus", rowCount);
				String medicalPolicy = reader.getCellData(SheetName, "medicalPolicy", rowCount);
				String policyReason = reader.getCellData(SheetName, "policyReason", rowCount);
				String purposeOfInsuValue1 = reader.getCellData(SheetName, "purposeOfInsuValue1", rowCount);
				String purposeOfInsuValue2 = reader.getCellData(SheetName, "purposeOfInsuValue2", rowCount);
				String purposeOfInsuValue3 = reader.getCellData(SheetName, "purposeOfInsuValue3", rowCount);
				String provideDetailsErrorMSG = reader.getCellData(SheetName, "provideDetailsErrorMSG", rowCount);
				String selectCountryErrorMSG = reader.getCellData(SheetName, "selectCountryErrorMSG", rowCount);
				String identificationErrorMSG = reader.getCellData(SheetName, "identificationErrorMSG", rowCount);


				String Emaild = reader.getCellData(SheetName, "Emaild", rowCount);
				String EmailIDErrorMSG = reader.getCellData(SheetName, "EmailIDErrorMSG", rowCount);
				String MaritalStatus = reader.getCellData(SheetName, "MaritalStatus", rowCount);
				String fatherSpouseName = reader.getCellData(SheetName, "fatherSpouseName", rowCount);
				String motherName = reader.getCellData(SheetName, "motherName", rowCount);
				String maidenName = reader.getCellData(SheetName, "maidenName", rowCount);
				String Qualification = reader.getCellData(SheetName, "Qualification", rowCount);
				String Occupation = reader.getCellData(SheetName, "Occupation", rowCount);
				String NameOfEmployer = reader.getCellData(SheetName, "NameOfEmployer", rowCount);
				String NatureofBusiness = reader.getCellData(SheetName, "NatureofBusiness", rowCount);
				String TypeOfOrganisation = reader.getCellData(SheetName, "TypeOfOrganisation", rowCount);
				String Designation = reader.getCellData(SheetName, "Designation", rowCount);
				String AnnualIncome = reader.getCellData(SheetName, "AnnualIncome", rowCount);
				String fatherSpouseNameErrorMsg = reader.getCellData(SheetName, "fatherSpouseNameErrorMsg", rowCount);
				String motherNameErrorMsg = reader.getCellData(SheetName, "motherNameErrorMsg", rowCount);
				String maidenNameErrorMsg = reader.getCellData(SheetName, "maidenNameErrorMsg", rowCount);
				String Other = reader.getCellData(SheetName, "Other", rowCount);
				String ParentAnnualIncome = reader.getCellData(SheetName, "ParentAnnualIncome", rowCount);
				String ParentInsuranceCover = reader.getCellData(SheetName, "ParentInsuranceCover", rowCount);
				String Gstvalue = reader.getCellData(SheetName, "Gstvalue", rowCount);


				String ClickOnhealthDetailTab = reader.getCellData(SheetName, "ClickOnhealthDetailTab", rowCount);

				String FMBSLivingDemise = reader.getCellData(SheetName, "FMBSLivingDemise", rowCount);
				String FMBSAgeDeath = reader.getCellData(SheetName, "FMBSAgeDeath", rowCount);
				String FMBSStateAndCause = reader.getCellData(SheetName, "FMBSStateAndCause", rowCount);


				Object ob[] = {username.trim(), password.trim(), leadID.trim(), mobileNumber.trim(),
						panNumber.trim(), day.trim(), month.trim(), year.trim(), quoteAmount.trim(), planOptions.trim(),
						smokerNonSmoker.trim(), pptOption.trim(),
						term.trim(), paymode.trim(), AciSumAssured.trim(), Rideramount.trim(),
						level.trim(), IFSCCode.trim(), IFSCErrorMSG.trim(), BankName.trim(),
						BankNameErrorMSG.trim(), BranchName.trim(), BranchNameErrorMSG.trim(), AccountNo.trim(),
						AccountNoErrorMSG.trim(), PaymentMethod.trim(), PreferredDrawDate.trim(), SourceOfFunds.trim(), BankStatus.trim(),
						nomiFirstName.trim(), nimiLastName.trim(), nomiday.trim(), nomimonth.trim(), nomiyear.trim(), genderValue.trim(), relationshipValue.trim(), shareValue.trim(), shareErrorMSG.trim(), relationshipErrorMSG.trim(), firstNameErrorMSG.trim(), lastNameErrorMSG.trim(), removeMSG.trim(), nomiDOBErrorMSG.trim(),
						addressType.trim(), pinCode.trim(), addressOne.trim(), addressTwo.trim(), addressThree.trim(), pinCode2.trim(), language.trim(), mobile.trim(), telNo.trim(), insurerName.trim(), sumAssured.trim(), policyNumber.trim(), yearOfApplication.trim(), basePlan.trim(), annualPremium.trim(), policyStatus.trim(), medicalPolicy.trim(), policyReason.trim(), purposeOfInsuValue1.trim(), purposeOfInsuValue2.trim(), purposeOfInsuValue3.trim(), provideDetailsErrorMSG.trim(),
						selectCountryErrorMSG.trim(), identificationErrorMSG.trim(), Emaild.trim(), EmailIDErrorMSG.trim(), MaritalStatus.trim(), fatherSpouseName.trim(), motherName.trim(), maidenName.trim(),
						Qualification.trim(), Occupation.trim(), NameOfEmployer.trim(), NatureofBusiness.trim(), TypeOfOrganisation.trim(), Designation.trim(), AnnualIncome.trim(),
						fatherSpouseNameErrorMsg.trim(), motherNameErrorMsg.trim(), maidenNameErrorMsg.trim(), Other.trim(), ParentAnnualIncome.trim(), ParentInsuranceCover.trim(), Gstvalue.trim(), ClickOnhealthDetailTab.trim(),
						FMBSLivingDemise.trim(), FMBSAgeDeath.trim(), FMBSStateAndCause.trim()};
				myData.add(ob);
			}
		}
		System.out.println("mydata rows value **********" + myData);
		return myData;
	}

	public ArrayList<Object[]> getPaymentPageDataExcel(String testExcelSheet, String testName, String SheetName) {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		ArrayList<String> myColumnData = new ArrayList<String>();
		Xls_reader reader = null;

		try {
			reader = new Xls_reader(System.getProperty("user.dir") + testExcelSheet);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Payment Page row count ---------" + reader.getRowCount(SheetName));
		System.out.println(" ******* current test running method  *********" + testName);
		System.out.println("**** column count  ********" + reader.getColumnCount(SheetName));

		for (int rowCount = 3; rowCount <= reader.getRowCount(SheetName); rowCount++) {
			String currentTestMethod = reader.getCellData(SheetName, "testCaseName", rowCount);
			String enableFlag = reader.getCellData(SheetName, "flag", rowCount);
			if (currentTestMethod.equalsIgnoreCase(testName)) {

				String username = reader.getCellData(SheetName, "username", rowCount);
				String password = reader.getCellData(SheetName, "password", rowCount);
				String leadID = reader.getCellData(SheetName, "leadID", rowCount);
				String mobileNumber = reader.getCellData(SheetName, "mobileNumber", rowCount);
				String panNumber = reader.getCellData(SheetName, "panNumber", rowCount);
				String day = reader.getCellData(SheetName, "day", rowCount);
				String month = reader.getCellData(SheetName, "month", rowCount);
				String year = reader.getCellData(SheetName, "year", rowCount);
				String quoteAmount = reader.getCellData(SheetName, "quoteAmount", rowCount);
				String planOptions = reader.getCellData(SheetName, "planOptions", rowCount);
				String smokerNonSmoker = reader.getCellData(SheetName, "smokerNonSmoker", rowCount);
				String pptOption = reader.getCellData(SheetName, "pptOption", rowCount);
				String term = reader.getCellData(SheetName, "term", rowCount);
				String paymode = reader.getCellData(SheetName, "paymode", rowCount);
				String AciSumAssured = reader.getCellData(SheetName, "AciSumAssured", rowCount);
				String Rideramount = reader.getCellData(SheetName, "Rideramount", rowCount);
				String level = reader.getCellData(SheetName, "level", rowCount);
				String IFSCCode = reader.getCellData(SheetName, "IFSCCode", rowCount);
				//String IFSCErrorMSG = reader.getCellData(SheetName, "IFSCErrorMSG", rowCount);
				//String BankName = reader.getCellData(SheetName, "BankName", rowCount);
				//String BankNameErrorMSG = reader.getCellData(SheetName, "BankNameErrorMSG", rowCount);
				//String BranchName = reader.getCellData(SheetName, "BranchName", rowCount);
				//String BranchNameErrorMSG = reader.getCellData(SheetName, "BranchNameErrorMSG", rowCount);
				String AccountNo = reader.getCellData(SheetName, "AccountNo", rowCount);
				//String AccountNoErrorMSG = reader.getCellData(SheetName, "AccountNoErrorMSG", rowCount);
				String PaymentMethod = reader.getCellData(SheetName, "PaymentMethod", rowCount);
				String PreferredDrawDate = reader.getCellData(SheetName, "PreferredDrawDate", rowCount);
				String SourceOfFunds = reader.getCellData(SheetName, "SourceOfFunds", rowCount);
				String BankStatus = reader.getCellData(SheetName, "BankStatus", rowCount);

				String nomiFirstName = reader.getCellData(SheetName, "nomiFirstName", rowCount);
				String nimiLastName = reader.getCellData(SheetName, "nimiLastName", rowCount);
				String nomiday = reader.getCellData(SheetName, "nomiday", rowCount);
				String nomimonth = reader.getCellData(SheetName, "nomimonth", rowCount);
				String nomiyear = reader.getCellData(SheetName, "nomiyear", rowCount);
				String genderValue = reader.getCellData(SheetName, "genderValue", rowCount);
				String relationshipValue = reader.getCellData(SheetName, "relationshipValue", rowCount);
				String shareValue = reader.getCellData(SheetName, "shareValue", rowCount);
				//String shareErrorMSG = reader.getCellData(SheetName, "shareErrorMSG", rowCount);
				//String relationshipErrorMSG = reader.getCellData(SheetName, "relationshipErrorMSG", rowCount);
				//String firstNameErrorMSG = reader.getCellData(SheetName, "firstNameErrorMSG", rowCount);
				//String lastNameErrorMSG = reader.getCellData(SheetName, "lastNameErrorMSG", rowCount);
				//String removeMSG = reader.getCellData(SheetName, "removeMSG", rowCount);
				//String nomiDOBErrorMSG = reader.getCellData(SheetName, "nomiDOBErrorMSG", rowCount);

				String addressType = reader.getCellData(SheetName, "addressType", rowCount);
				String pinCode = reader.getCellData(SheetName, "pinCode", rowCount);
				String addressOne = reader.getCellData(SheetName, "addressOne", rowCount);
				String addressTwo = reader.getCellData(SheetName, "addressTwo", rowCount);
				String addressThree = reader.getCellData(SheetName, "addressThree", rowCount);
				String pinCode2 = reader.getCellData(SheetName, "pinCode2", rowCount);
				String language = reader.getCellData(SheetName, "language", rowCount);
				String mobile = reader.getCellData(SheetName, "mobile", rowCount);
				String telNo = reader.getCellData(SheetName, "telNo", rowCount);

				String insurerName = reader.getCellData(SheetName, "insurerName", rowCount);
				String sumAssured = reader.getCellData(SheetName, "sumAssured", rowCount);
				String policyNumber = reader.getCellData(SheetName, "policyNumber", rowCount);
				String yearOfApplication = reader.getCellData(SheetName, "yearOfApplication", rowCount);
				String basePlan = reader.getCellData(SheetName, "basePlan", rowCount);
				String annualPremium = reader.getCellData(SheetName, "annualPremium", rowCount);
				String policyStatus = reader.getCellData(SheetName, "policyStatus", rowCount);
				String medicalPolicy = reader.getCellData(SheetName, "medicalPolicy", rowCount);
				String policyReason = reader.getCellData(SheetName, "policyReason", rowCount);
				String purposeOfInsuValue1 = reader.getCellData(SheetName, "purposeOfInsuValue1", rowCount);
				String purposeOfInsuValue2 = reader.getCellData(SheetName, "purposeOfInsuValue2", rowCount);
				String purposeOfInsuValue3 = reader.getCellData(SheetName, "purposeOfInsuValue3", rowCount);
				//String provideDetailsErrorMSG = reader.getCellData(SheetName, "provideDetailsErrorMSG", rowCount);
				//String selectCountryErrorMSG = reader.getCellData(SheetName, "selectCountryErrorMSG", rowCount);
				//String identificationErrorMSG = reader.getCellData(SheetName, "identificationErrorMSG", rowCount);


				String Emaild = reader.getCellData(SheetName, "Emaild", rowCount);
				//String EmailIDErrorMSG = reader.getCellData(SheetName, "EmailIDErrorMSG", rowCount);
				String MaritalStatus = reader.getCellData(SheetName, "MaritalStatus", rowCount);
				String fatherSpouseName = reader.getCellData(SheetName, "fatherSpouseName", rowCount);
				String motherName = reader.getCellData(SheetName, "motherName", rowCount);
				String maidenName = reader.getCellData(SheetName, "maidenName", rowCount);
				String Qualification = reader.getCellData(SheetName, "Qualification", rowCount);
				String Occupation = reader.getCellData(SheetName, "Occupation", rowCount);
				String NameOfEmployer = reader.getCellData(SheetName, "NameOfEmployer", rowCount);
				String NatureofBusiness = reader.getCellData(SheetName, "NatureofBusiness", rowCount);
				String TypeOfOrganisation = reader.getCellData(SheetName, "TypeOfOrganisation", rowCount);
				String Designation = reader.getCellData(SheetName, "Designation", rowCount);
				String AnnualIncome = reader.getCellData(SheetName, "AnnualIncome", rowCount);
				//String fatherSpouseNameErrorMsg = reader.getCellData(SheetName, "fatherSpouseNameErrorMsg", rowCount);
				//String motherNameErrorMsg = reader.getCellData(SheetName, "motherNameErrorMsg", rowCount);
				//String maidenNameErrorMsg = reader.getCellData(SheetName, "maidenNameErrorMsg", rowCount);
				String Other = reader.getCellData(SheetName, "Other", rowCount);
				String ParentAnnualIncome = reader.getCellData(SheetName, "ParentAnnualIncome", rowCount);
				String ParentInsuranceCover = reader.getCellData(SheetName, "ParentInsuranceCover", rowCount);
				String Gstvalue = reader.getCellData(SheetName, "Gstvalue", rowCount);


				String ClickOnhealthDetailTab = reader.getCellData(SheetName, "ClickOnhealthDetailTab", rowCount);

				String FMBSLivingDemise = reader.getCellData(SheetName, "FMBSLivingDemise", rowCount);
				String FMBSAgeDeath = reader.getCellData(SheetName, "FMBSAgeDeath", rowCount);
				String FMBSStateAndCause = reader.getCellData(SheetName, "FMBSStateAndCause", rowCount);


				String clickOnPaymentMode = reader.getCellData(SheetName, "clickOnPaymentMode", rowCount);

				String selectChequeORDemandDraft = reader.getCellData(SheetName, "selectChequeORDemandDraft", rowCount);
				String ChequeDDNo = reader.getCellData(SheetName, "ChequeDDNo", rowCount);
				String CDDday = reader.getCellData(SheetName, "CDDday", rowCount);
				String CDDMonth = reader.getCellData(SheetName, "CDDMonth", rowCount);
				String CDDYear = reader.getCellData(SheetName, "CDDYear", rowCount);
				String CDDIFSCcode = reader.getCellData(SheetName, "CDDIFSCcode", rowCount);
				String WBplicyNo = reader.getCellData(SheetName, "WBplicyNo", rowCount);
				String Wbamount = reader.getCellData(SheetName, "Wbamount", rowCount);
				String paymentSummary = reader.getCellData(SheetName, "paymentSummary", rowCount);


				Object ob[] = {username.trim(), password.trim(), leadID.trim(), mobileNumber.trim(),
						panNumber.trim(), day.trim(), month.trim(), year.trim(), quoteAmount.trim(), planOptions.trim(),
						smokerNonSmoker.trim(), pptOption.trim(),
						term.trim(), paymode.trim(), AciSumAssured.trim(), Rideramount.trim(),
						level.trim(), IFSCCode.trim(),
						AccountNo.trim(),
						PaymentMethod.trim(), PreferredDrawDate.trim(), SourceOfFunds.trim(), BankStatus.trim(),
						nomiFirstName.trim(), nimiLastName.trim(), nomiday.trim(), nomimonth.trim(), nomiyear.trim(), genderValue.trim(), relationshipValue.trim(), shareValue.trim(),
						addressType.trim(), pinCode.trim(), addressOne.trim(), addressTwo.trim(), addressThree.trim(), pinCode2.trim(), language.trim(), mobile.trim(), telNo.trim(), insurerName.trim(), sumAssured.trim(), policyNumber.trim(), yearOfApplication.trim(), basePlan.trim(), annualPremium.trim(), policyStatus.trim(), medicalPolicy.trim(), policyReason.trim(), purposeOfInsuValue1.trim(), purposeOfInsuValue2.trim(), purposeOfInsuValue3.trim(),
						Emaild.trim(), MaritalStatus.trim(), fatherSpouseName.trim(), motherName.trim(), maidenName.trim(),
						Qualification.trim(), Occupation.trim(), NameOfEmployer.trim(), NatureofBusiness.trim(), TypeOfOrganisation.trim(), Designation.trim(), AnnualIncome.trim(),
						Other.trim(), ParentAnnualIncome.trim(), ParentInsuranceCover.trim(), Gstvalue.trim(), ClickOnhealthDetailTab.trim(),
						FMBSLivingDemise.trim(), FMBSAgeDeath.trim(), FMBSStateAndCause.trim(), clickOnPaymentMode.trim(),
						selectChequeORDemandDraft.trim(), ChequeDDNo.trim(), CDDday.trim(), CDDMonth.trim(), CDDYear.trim(), CDDIFSCcode.trim(),
						WBplicyNo.trim(), Wbamount.trim(), paymentSummary.trim()};
				myData.add(ob);
			}
		}
		System.out.println("mydata rows value **********" + myData);
		return myData;
	}

	public ArrayList<Object[]> getDocumentsDataExcel(String testExcelSheet, String testName, String SheetName) {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		ArrayList<String> myColumnData = new ArrayList<String>();
		Xls_reader reader = null;

		try {
			reader = new Xls_reader(System.getProperty("user.dir") + testExcelSheet);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Payment Page row count ---------" + reader.getRowCount(SheetName));
		System.out.println(" ******* current test running method  *********" + testName);
		System.out.println("**** column count  ********" + reader.getColumnCount(SheetName));

		for (int rowCount = 3; rowCount <= reader.getRowCount(SheetName); rowCount++) {
			String currentTestMethod = reader.getCellData(SheetName, "testCaseName", rowCount);
			String enableFlag = reader.getCellData(SheetName, "flag", rowCount);
			if (currentTestMethod.equalsIgnoreCase(testName)) {

				String username = reader.getCellData(SheetName, "username", rowCount);
				String password = reader.getCellData(SheetName, "password", rowCount);
				String leadID = reader.getCellData(SheetName, "leadID", rowCount);
				String mobileNumber = reader.getCellData(SheetName, "mobileNumber", rowCount);
				String panNumber = reader.getCellData(SheetName, "panNumber", rowCount);
				String day = reader.getCellData(SheetName, "day", rowCount);
				String month = reader.getCellData(SheetName, "month", rowCount);
				String year = reader.getCellData(SheetName, "year", rowCount);
				String quoteAmount = reader.getCellData(SheetName, "quoteAmount", rowCount);
				String planOptions = reader.getCellData(SheetName, "planOptions", rowCount);
				String smokerNonSmoker = reader.getCellData(SheetName, "smokerNonSmoker", rowCount);
				String pptOption = reader.getCellData(SheetName, "pptOption", rowCount);
				String term = reader.getCellData(SheetName, "term", rowCount);
				String paymode = reader.getCellData(SheetName, "paymode", rowCount);
				String AciSumAssured = reader.getCellData(SheetName, "AciSumAssured", rowCount);
				String Rideramount = reader.getCellData(SheetName, "Rideramount", rowCount);
				String level = reader.getCellData(SheetName, "level", rowCount);
				String IFSCCode = reader.getCellData(SheetName, "IFSCCode", rowCount);
				//String IFSCErrorMSG = reader.getCellData(SheetName, "IFSCErrorMSG", rowCount);
				//String BankName = reader.getCellData(SheetName, "BankName", rowCount);
				//String BankNameErrorMSG = reader.getCellData(SheetName, "BankNameErrorMSG", rowCount);
				//String BranchName = reader.getCellData(SheetName, "BranchName", rowCount);
				//String BranchNameErrorMSG = reader.getCellData(SheetName, "BranchNameErrorMSG", rowCount);
				String AccountNo = reader.getCellData(SheetName, "AccountNo", rowCount);
				//String AccountNoErrorMSG = reader.getCellData(SheetName, "AccountNoErrorMSG", rowCount);
				String PaymentMethod = reader.getCellData(SheetName, "PaymentMethod", rowCount);
				String PreferredDrawDate = reader.getCellData(SheetName, "PreferredDrawDate", rowCount);
				String SourceOfFunds = reader.getCellData(SheetName, "SourceOfFunds", rowCount);
				String BankStatus = reader.getCellData(SheetName, "BankStatus", rowCount);

				String nomiFirstName = reader.getCellData(SheetName, "nomiFirstName", rowCount);
				String nimiLastName = reader.getCellData(SheetName, "nimiLastName", rowCount);
				String nomiday = reader.getCellData(SheetName, "nomiday", rowCount);
				String nomimonth = reader.getCellData(SheetName, "nomimonth", rowCount);
				String nomiyear = reader.getCellData(SheetName, "nomiyear", rowCount);
				String genderValue = reader.getCellData(SheetName, "genderValue", rowCount);
				String relationshipValue = reader.getCellData(SheetName, "relationshipValue", rowCount);
				String shareValue = reader.getCellData(SheetName, "shareValue", rowCount);
				//String shareErrorMSG = reader.getCellData(SheetName, "shareErrorMSG", rowCount);
				//String relationshipErrorMSG = reader.getCellData(SheetName, "relationshipErrorMSG", rowCount);
				//String firstNameErrorMSG = reader.getCellData(SheetName, "firstNameErrorMSG", rowCount);
				//String lastNameErrorMSG = reader.getCellData(SheetName, "lastNameErrorMSG", rowCount);
				//String removeMSG = reader.getCellData(SheetName, "removeMSG", rowCount);
				//String nomiDOBErrorMSG = reader.getCellData(SheetName, "nomiDOBErrorMSG", rowCount);

				String addressType = reader.getCellData(SheetName, "addressType", rowCount);
				String pinCode = reader.getCellData(SheetName, "pinCode", rowCount);
				String addressOne = reader.getCellData(SheetName, "addressOne", rowCount);
				String addressTwo = reader.getCellData(SheetName, "addressTwo", rowCount);
				String addressThree = reader.getCellData(SheetName, "addressThree", rowCount);
				String pinCode2 = reader.getCellData(SheetName, "pinCode2", rowCount);
				String language = reader.getCellData(SheetName, "language", rowCount);
				String mobile = reader.getCellData(SheetName, "mobile", rowCount);
				String telNo = reader.getCellData(SheetName, "telNo", rowCount);

				String insurerName = reader.getCellData(SheetName, "insurerName", rowCount);
				String sumAssured = reader.getCellData(SheetName, "sumAssured", rowCount);
				String policyNumber = reader.getCellData(SheetName, "policyNumber", rowCount);
				String yearOfApplication = reader.getCellData(SheetName, "yearOfApplication", rowCount);
				String basePlan = reader.getCellData(SheetName, "basePlan", rowCount);
				String annualPremium = reader.getCellData(SheetName, "annualPremium", rowCount);
				String policyStatus = reader.getCellData(SheetName, "policyStatus", rowCount);
				String medicalPolicy = reader.getCellData(SheetName, "medicalPolicy", rowCount);
				String policyReason = reader.getCellData(SheetName, "policyReason", rowCount);
				String purposeOfInsuValue1 = reader.getCellData(SheetName, "purposeOfInsuValue1", rowCount);
				String purposeOfInsuValue2 = reader.getCellData(SheetName, "purposeOfInsuValue2", rowCount);
				String purposeOfInsuValue3 = reader.getCellData(SheetName, "purposeOfInsuValue3", rowCount);
				//String provideDetailsErrorMSG = reader.getCellData(SheetName, "provideDetailsErrorMSG", rowCount);
				//String selectCountryErrorMSG = reader.getCellData(SheetName, "selectCountryErrorMSG", rowCount);
				//String identificationErrorMSG = reader.getCellData(SheetName, "identificationErrorMSG", rowCount);


				String Emaild = reader.getCellData(SheetName, "Emaild", rowCount);
				//String EmailIDErrorMSG = reader.getCellData(SheetName, "EmailIDErrorMSG", rowCount);
				String MaritalStatus = reader.getCellData(SheetName, "MaritalStatus", rowCount);
				String fatherSpouseName = reader.getCellData(SheetName, "fatherSpouseName", rowCount);
				String motherName = reader.getCellData(SheetName, "motherName", rowCount);
				String maidenName = reader.getCellData(SheetName, "maidenName", rowCount);
				String Qualification = reader.getCellData(SheetName, "Qualification", rowCount);
				String Occupation = reader.getCellData(SheetName, "Occupation", rowCount);
				String NameOfEmployer = reader.getCellData(SheetName, "NameOfEmployer", rowCount);
				String NatureofBusiness = reader.getCellData(SheetName, "NatureofBusiness", rowCount);
				String TypeOfOrganisation = reader.getCellData(SheetName, "TypeOfOrganisation", rowCount);
				String Designation = reader.getCellData(SheetName, "Designation", rowCount);
				String AnnualIncome = reader.getCellData(SheetName, "AnnualIncome", rowCount);
				//String fatherSpouseNameErrorMsg = reader.getCellData(SheetName, "fatherSpouseNameErrorMsg", rowCount);
				//String motherNameErrorMsg = reader.getCellData(SheetName, "motherNameErrorMsg", rowCount);
				//String maidenNameErrorMsg = reader.getCellData(SheetName, "maidenNameErrorMsg", rowCount);
				String Other = reader.getCellData(SheetName, "Other", rowCount);
				String ParentAnnualIncome = reader.getCellData(SheetName, "ParentAnnualIncome", rowCount);
				String ParentInsuranceCover = reader.getCellData(SheetName, "ParentInsuranceCover", rowCount);
				String Gstvalue = reader.getCellData(SheetName, "Gstvalue", rowCount);


				String ClickOnhealthDetailTab = reader.getCellData(SheetName, "ClickOnhealthDetailTab", rowCount);

				String FMBSLivingDemise = reader.getCellData(SheetName, "FMBSLivingDemise", rowCount);
				String FMBSAgeDeath = reader.getCellData(SheetName, "FMBSAgeDeath", rowCount);
				String FMBSStateAndCause = reader.getCellData(SheetName, "FMBSStateAndCause", rowCount);


				String clickOnPaymentMode = reader.getCellData(SheetName, "clickOnPaymentMode", rowCount);
				String SelectTypeOfDocument = reader.getCellData(SheetName, "SelectTypeOfDocument", rowCount);
				String ListOfValueDropDown = reader.getCellData(SheetName, "ListOfValueDropDown", rowCount);
				String SelectTypeOfDocAgeProof = reader.getCellData(SheetName, "SelectTypeOfDocAgeProof", rowCount);

				Object ob[] = {username.trim(), password.trim(), leadID.trim(), mobileNumber.trim(),
						panNumber.trim(), day.trim(), month.trim(), year.trim(), quoteAmount.trim(), planOptions.trim(),
						smokerNonSmoker.trim(), pptOption.trim(),
						term.trim(), paymode.trim(), AciSumAssured.trim(), Rideramount.trim(),
						level.trim(), IFSCCode.trim(),
						AccountNo.trim(),
						PaymentMethod.trim(), PreferredDrawDate.trim(), SourceOfFunds.trim(), BankStatus.trim(),
						nomiFirstName.trim(), nimiLastName.trim(), nomiday.trim(), nomimonth.trim(), nomiyear.trim(), genderValue.trim(), relationshipValue.trim(), shareValue.trim(),
						addressType.trim(), pinCode.trim(), addressOne.trim(), addressTwo.trim(), addressThree.trim(), pinCode2.trim(), language.trim(), mobile.trim(), telNo.trim(), insurerName.trim(), sumAssured.trim(), policyNumber.trim(), yearOfApplication.trim(), basePlan.trim(), annualPremium.trim(), policyStatus.trim(), medicalPolicy.trim(), policyReason.trim(), purposeOfInsuValue1.trim(), purposeOfInsuValue2.trim(), purposeOfInsuValue3.trim(),
						Emaild.trim(), MaritalStatus.trim(), fatherSpouseName.trim(), motherName.trim(), maidenName.trim(),
						Qualification.trim(), Occupation.trim(), NameOfEmployer.trim(), NatureofBusiness.trim(), TypeOfOrganisation.trim(), Designation.trim(), AnnualIncome.trim(),
						Other.trim(), ParentAnnualIncome.trim(), ParentInsuranceCover.trim(), Gstvalue.trim(), ClickOnhealthDetailTab.trim(),
						FMBSLivingDemise.trim(), FMBSAgeDeath.trim(), FMBSStateAndCause.trim(), clickOnPaymentMode.trim(), SelectTypeOfDocument.trim(), ListOfValueDropDown.trim(), SelectTypeOfDocAgeProof.trim()};
				myData.add(ob);
			}
		}
		System.out.println("mydata rows value **********" + myData);
		return myData;
	}

	public ArrayList<Object[]> getIARDataExcel(String testExcelSheet, String testName, String SheetName) {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		ArrayList<String> myColumnData = new ArrayList<String>();
		Xls_reader reader = null;

		try {
			reader = new Xls_reader(System.getProperty("user.dir") + testExcelSheet);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Payment Page row count ---------" + reader.getRowCount(SheetName));
		System.out.println(" ******* current test running method  *********" + testName);
		System.out.println("**** column count  ********" + reader.getColumnCount(SheetName));

		for (int rowCount = 3; rowCount <= reader.getRowCount(SheetName); rowCount++) {
			String currentTestMethod = reader.getCellData(SheetName, "testCaseName", rowCount);
			String enableFlag = reader.getCellData(SheetName, "flag", rowCount);
			if (currentTestMethod.equalsIgnoreCase(testName)) {

				String username = reader.getCellData(SheetName, "username", rowCount);
				String password = reader.getCellData(SheetName, "password", rowCount);
				String leadID = reader.getCellData(SheetName, "leadID", rowCount);
				String mobileNumber = reader.getCellData(SheetName, "mobileNumber", rowCount);
				String panNumber = reader.getCellData(SheetName, "panNumber", rowCount);
				String day = reader.getCellData(SheetName, "day", rowCount);
				String month = reader.getCellData(SheetName, "month", rowCount);
				String year = reader.getCellData(SheetName, "year", rowCount);
				String quoteAmount = reader.getCellData(SheetName, "quoteAmount", rowCount);
				String planOptions = reader.getCellData(SheetName, "planOptions", rowCount);
				String smokerNonSmoker = reader.getCellData(SheetName, "smokerNonSmoker", rowCount);
				String pptOption = reader.getCellData(SheetName, "pptOption", rowCount);
				String term = reader.getCellData(SheetName, "term", rowCount);
				String paymode = reader.getCellData(SheetName, "paymode", rowCount);
				String AciSumAssured = reader.getCellData(SheetName, "AciSumAssured", rowCount);
				String Rideramount = reader.getCellData(SheetName, "Rideramount", rowCount);
				String level = reader.getCellData(SheetName, "level", rowCount);
				String IFSCCode = reader.getCellData(SheetName, "IFSCCode", rowCount);
				//String IFSCErrorMSG = reader.getCellData(SheetName, "IFSCErrorMSG", rowCount);
				//String BankName = reader.getCellData(SheetName, "BankName", rowCount);
				//String BankNameErrorMSG = reader.getCellData(SheetName, "BankNameErrorMSG", rowCount);
				//String BranchName = reader.getCellData(SheetName, "BranchName", rowCount);
				//String BranchNameErrorMSG = reader.getCellData(SheetName, "BranchNameErrorMSG", rowCount);
				String AccountNo = reader.getCellData(SheetName, "AccountNo", rowCount);
				//String AccountNoErrorMSG = reader.getCellData(SheetName, "AccountNoErrorMSG", rowCount);
				String PaymentMethod = reader.getCellData(SheetName, "PaymentMethod", rowCount);
				String PreferredDrawDate = reader.getCellData(SheetName, "PreferredDrawDate", rowCount);
				String SourceOfFunds = reader.getCellData(SheetName, "SourceOfFunds", rowCount);
				String BankStatus = reader.getCellData(SheetName, "BankStatus", rowCount);

				String nomiFirstName = reader.getCellData(SheetName, "nomiFirstName", rowCount);
				String nimiLastName = reader.getCellData(SheetName, "nimiLastName", rowCount);
				String nomiday = reader.getCellData(SheetName, "nomiday", rowCount);
				String nomimonth = reader.getCellData(SheetName, "nomimonth", rowCount);
				String nomiyear = reader.getCellData(SheetName, "nomiyear", rowCount);
				String genderValue = reader.getCellData(SheetName, "genderValue", rowCount);
				String relationshipValue = reader.getCellData(SheetName, "relationshipValue", rowCount);
				String shareValue = reader.getCellData(SheetName, "shareValue", rowCount);
				//String shareErrorMSG = reader.getCellData(SheetName, "shareErrorMSG", rowCount);
				//String relationshipErrorMSG = reader.getCellData(SheetName, "relationshipErrorMSG", rowCount);
				//String firstNameErrorMSG = reader.getCellData(SheetName, "firstNameErrorMSG", rowCount);
				//String lastNameErrorMSG = reader.getCellData(SheetName, "lastNameErrorMSG", rowCount);
				//String removeMSG = reader.getCellData(SheetName, "removeMSG", rowCount);
				//String nomiDOBErrorMSG = reader.getCellData(SheetName, "nomiDOBErrorMSG", rowCount);

				String addressType = reader.getCellData(SheetName, "addressType", rowCount);
				String pinCode = reader.getCellData(SheetName, "pinCode", rowCount);
				String addressOne = reader.getCellData(SheetName, "addressOne", rowCount);
				String addressTwo = reader.getCellData(SheetName, "addressTwo", rowCount);
				String addressThree = reader.getCellData(SheetName, "addressThree", rowCount);
				String pinCode2 = reader.getCellData(SheetName, "pinCode2", rowCount);
				String language = reader.getCellData(SheetName, "language", rowCount);
				String mobile = reader.getCellData(SheetName, "mobile", rowCount);
				String telNo = reader.getCellData(SheetName, "telNo", rowCount);

				String insurerName = reader.getCellData(SheetName, "insurerName", rowCount);
				String sumAssured = reader.getCellData(SheetName, "sumAssured", rowCount);
				String policyNumber = reader.getCellData(SheetName, "policyNumber", rowCount);
				String yearOfApplication = reader.getCellData(SheetName, "yearOfApplication", rowCount);
				String basePlan = reader.getCellData(SheetName, "basePlan", rowCount);
				String annualPremium = reader.getCellData(SheetName, "annualPremium", rowCount);
				String policyStatus = reader.getCellData(SheetName, "policyStatus", rowCount);
				String medicalPolicy = reader.getCellData(SheetName, "medicalPolicy", rowCount);
				String policyReason = reader.getCellData(SheetName, "policyReason", rowCount);
				String purposeOfInsuValue1 = reader.getCellData(SheetName, "purposeOfInsuValue1", rowCount);
				String purposeOfInsuValue2 = reader.getCellData(SheetName, "purposeOfInsuValue2", rowCount);
				String purposeOfInsuValue3 = reader.getCellData(SheetName, "purposeOfInsuValue3", rowCount);
				//String provideDetailsErrorMSG = reader.getCellData(SheetName, "provideDetailsErrorMSG", rowCount);
				//String selectCountryErrorMSG = reader.getCellData(SheetName, "selectCountryErrorMSG", rowCount);
				//String identificationErrorMSG = reader.getCellData(SheetName, "identificationErrorMSG", rowCount);


				String Emaild = reader.getCellData(SheetName, "Emaild", rowCount);
				//String EmailIDErrorMSG = reader.getCellData(SheetName, "EmailIDErrorMSG", rowCount);
				String MaritalStatus = reader.getCellData(SheetName, "MaritalStatus", rowCount);
				String fatherSpouseName = reader.getCellData(SheetName, "fatherSpouseName", rowCount);
				String motherName = reader.getCellData(SheetName, "motherName", rowCount);
				String maidenName = reader.getCellData(SheetName, "maidenName", rowCount);
				String Qualification = reader.getCellData(SheetName, "Qualification", rowCount);
				String Occupation = reader.getCellData(SheetName, "Occupation", rowCount);
				String NameOfEmployer = reader.getCellData(SheetName, "NameOfEmployer", rowCount);
				String NatureofBusiness = reader.getCellData(SheetName, "NatureofBusiness", rowCount);
				String TypeOfOrganisation = reader.getCellData(SheetName, "TypeOfOrganisation", rowCount);
				String Designation = reader.getCellData(SheetName, "Designation", rowCount);
				String AnnualIncome = reader.getCellData(SheetName, "AnnualIncome", rowCount);
				//String fatherSpouseNameErrorMsg = reader.getCellData(SheetName, "fatherSpouseNameErrorMsg", rowCount);
				//String motherNameErrorMsg = reader.getCellData(SheetName, "motherNameErrorMsg", rowCount);
				//String maidenNameErrorMsg = reader.getCellData(SheetName, "maidenNameErrorMsg", rowCount);
				String Other = reader.getCellData(SheetName, "Other", rowCount);
				String ParentAnnualIncome = reader.getCellData(SheetName, "ParentAnnualIncome", rowCount);
				String ParentInsuranceCover = reader.getCellData(SheetName, "ParentInsuranceCover", rowCount);
				String Gstvalue = reader.getCellData(SheetName, "Gstvalue", rowCount);


				String ClickOnhealthDetailTab = reader.getCellData(SheetName, "ClickOnhealthDetailTab", rowCount);

				String FMBSLivingDemise = reader.getCellData(SheetName, "FMBSLivingDemise", rowCount);
				String FMBSAgeDeath = reader.getCellData(SheetName, "FMBSAgeDeath", rowCount);
				String FMBSStateAndCause = reader.getCellData(SheetName, "FMBSStateAndCause", rowCount);


				String clickOnPaymentMode = reader.getCellData(SheetName, "clickOnPaymentMode", rowCount);
				String SelectTypeOfDocument = reader.getCellData(SheetName, "SelectTypeOfDocument", rowCount);
				String ListOfValueDropDown = reader.getCellData(SheetName, "ListOfValueDropDown", rowCount);
				String SelectTypeOfDocAgeProof = reader.getCellData(SheetName, "SelectTypeOfDocAgeProof", rowCount);

				String ListOfValueTextfield = reader.getCellData(SheetName, "ListOfValueTextfield", rowCount);
				String HowDoYouKnowListOfValue = reader.getCellData(SheetName, "HowDoYouKnowListOfValue", rowCount);
				String HowDoYouKnowOtherField = reader.getCellData(SheetName, "HowDoYouKnowOtherField", rowCount);

				Object ob[] = {username.trim(), password.trim(), leadID.trim(), mobileNumber.trim(),
						panNumber.trim(), day.trim(), month.trim(), year.trim(), quoteAmount.trim(), planOptions.trim(),
						smokerNonSmoker.trim(), pptOption.trim(),
						term.trim(), paymode.trim(), AciSumAssured.trim(), Rideramount.trim(),
						level.trim(), IFSCCode.trim(),
						AccountNo.trim(),
						PaymentMethod.trim(), PreferredDrawDate.trim(), SourceOfFunds.trim(), BankStatus.trim(),
						nomiFirstName.trim(), nimiLastName.trim(), nomiday.trim(), nomimonth.trim(), nomiyear.trim(), genderValue.trim(), relationshipValue.trim(), shareValue.trim(),
						addressType.trim(), pinCode.trim(), addressOne.trim(), addressTwo.trim(), addressThree.trim(), pinCode2.trim(), language.trim(), mobile.trim(), telNo.trim(), insurerName.trim(), sumAssured.trim(), policyNumber.trim(), yearOfApplication.trim(), basePlan.trim(), annualPremium.trim(), policyStatus.trim(), medicalPolicy.trim(), policyReason.trim(), purposeOfInsuValue1.trim(), purposeOfInsuValue2.trim(), purposeOfInsuValue3.trim(),
						Emaild.trim(), MaritalStatus.trim(), fatherSpouseName.trim(), motherName.trim(), maidenName.trim(),
						Qualification.trim(), Occupation.trim(), NameOfEmployer.trim(), NatureofBusiness.trim(), TypeOfOrganisation.trim(), Designation.trim(), AnnualIncome.trim(),
						Other.trim(), ParentAnnualIncome.trim(), ParentInsuranceCover.trim(), Gstvalue.trim(), ClickOnhealthDetailTab.trim(),
						FMBSLivingDemise.trim(), FMBSAgeDeath.trim(), FMBSStateAndCause.trim(), clickOnPaymentMode.trim(), SelectTypeOfDocument.trim(), ListOfValueDropDown.trim(), SelectTypeOfDocAgeProof.trim(), ListOfValueTextfield.trim(), HowDoYouKnowListOfValue.trim(), HowDoYouKnowOtherField.trim()};
				myData.add(ob);
			}
		}
		System.out.println("mydata rows value **********" + myData);
		return myData;
	}

	public ArrayList<Object[]> getProposerNotInsuredDataExcel(String testExcelSheet, String testName, String SheetName) {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		ArrayList<String> myColumnData = new ArrayList<String>();
		Xls_reader reader = null;

		try {
			reader = new Xls_reader(System.getProperty("user.dir") + testExcelSheet);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Payment Page row count ---------" + reader.getRowCount(SheetName));
		System.out.println(" ******* current test running method  *********" + testName);
		System.out.println("**** column count  ********" + reader.getColumnCount(SheetName));

		for (int rowCount = 3; rowCount <= reader.getRowCount(SheetName); rowCount++) {
			String currentTestMethod = reader.getCellData(SheetName, "testCaseName", rowCount);
			String enableFlag = reader.getCellData(SheetName, "flag", rowCount);
			if (currentTestMethod.equalsIgnoreCase(testName)) {

				String username = reader.getCellData(SheetName, "username", rowCount);
				String password = reader.getCellData(SheetName, "password", rowCount);
				String leadID = reader.getCellData(SheetName, "leadID", rowCount);
				String ProposerInsuredSame = reader.getCellData(SheetName, "ProposerInsuredSame", rowCount);
				String RelationWithInsured = reader.getCellData(SheetName, "RelationWithInsured", rowCount);

				String mobileNumber = reader.getCellData(SheetName, "mobileNumber", rowCount);
				String panNumber = reader.getCellData(SheetName, "panNumber", rowCount);
				String ProposerName = reader.getCellData(SheetName, "ProposerName", rowCount);
				String InsuredMobileNo = reader.getCellData(SheetName, "InsuredMobileNo", rowCount);
				String InsuredPanNo = reader.getCellData(SheetName, "InsuredPanNo", rowCount);
				String InsuredName = reader.getCellData(SheetName, "InsuredName", rowCount);
				String day = reader.getCellData(SheetName, "day", rowCount);
				String month = reader.getCellData(SheetName, "month", rowCount);
				String year = reader.getCellData(SheetName, "year", rowCount);
				String InsuredDay = reader.getCellData(SheetName, "InsuredDay", rowCount);
				String InsuredMonth = reader.getCellData(SheetName, "InsuredMonth", rowCount);
				String InsuredYear = reader.getCellData(SheetName, "InsuredYear", rowCount);
				String ProposerSalutation = reader.getCellData(SheetName, "ProposerSalutation", rowCount);
				String InsuredSalutation = reader.getCellData(SheetName, "InsuredSalutation", rowCount);

				String premiumValue = reader.getCellData(SheetName, "premiumValue", rowCount);
				String occupationOption = reader.getCellData(SheetName, "occupationOption", rowCount);
				String lifeStageValue = reader.getCellData(SheetName, "lifeStageValue", rowCount);
				String riskProfileFieldValue = reader.getCellData(SheetName, "riskProfileFieldValue", rowCount);
				String investmentGoalValue = reader.getCellData(SheetName, "investmentGoalValue", rowCount);

				String quoteAmount = reader.getCellData(SheetName, "quoteAmount", rowCount);
				String planOptions = reader.getCellData(SheetName, "planOptions", rowCount);
				String smokerNonSmoker = reader.getCellData(SheetName, "smokerNonSmoker", rowCount);
				String pptOption = reader.getCellData(SheetName, "pptOption", rowCount);
				String term = reader.getCellData(SheetName, "term", rowCount);
				String paymode = reader.getCellData(SheetName, "paymode", rowCount);
				String AciSumAssured = reader.getCellData(SheetName, "AciSumAssured", rowCount);
				String Rideramount = reader.getCellData(SheetName, "Rideramount", rowCount);
				String level = reader.getCellData(SheetName, "level", rowCount);
				String IFSCCode = reader.getCellData(SheetName, "IFSCCode", rowCount);
				String AccountNo = reader.getCellData(SheetName, "AccountNo", rowCount);

				String PaymentMethod = reader.getCellData(SheetName, "PaymentMethod", rowCount);
				String PreferredDrawDate = reader.getCellData(SheetName, "PreferredDrawDate", rowCount);
				String SourceOfFunds = reader.getCellData(SheetName, "SourceOfFunds", rowCount);
				String BankStatus = reader.getCellData(SheetName, "BankStatus", rowCount);

				String nomiFirstName = reader.getCellData(SheetName, "nomiFirstName", rowCount);
				String nimiLastName = reader.getCellData(SheetName, "nimiLastName", rowCount);
				String nomiday = reader.getCellData(SheetName, "nomiday", rowCount);
				String nomimonth = reader.getCellData(SheetName, "nomimonth", rowCount);
				String nomiyear = reader.getCellData(SheetName, "nomiyear", rowCount);
				String genderValue = reader.getCellData(SheetName, "genderValue", rowCount);
				String relationshipValue = reader.getCellData(SheetName, "relationshipValue", rowCount);
				String shareValue = reader.getCellData(SheetName, "shareValue", rowCount);


				String addressType = reader.getCellData(SheetName, "addressType", rowCount);
				String pinCode = reader.getCellData(SheetName, "pinCode", rowCount);
				String addressOne = reader.getCellData(SheetName, "addressOne", rowCount);
				String addressTwo = reader.getCellData(SheetName, "addressTwo", rowCount);
				String addressThree = reader.getCellData(SheetName, "addressThree", rowCount);

				String Emaild = reader.getCellData(SheetName, "Emaild", rowCount);
				//String EmailIDErrorMSG = reader.getCellData(SheetName, "EmailIDErrorMSG", rowCount);
				String MaritalStatus = reader.getCellData(SheetName, "MaritalStatus", rowCount);
				String fatherSpouseName = reader.getCellData(SheetName, "fatherSpouseName", rowCount);
				String motherName = reader.getCellData(SheetName, "motherName", rowCount);
				String maidenName = reader.getCellData(SheetName, "maidenName", rowCount);
				String Qualification = reader.getCellData(SheetName, "Qualification", rowCount);
				String Occupation = reader.getCellData(SheetName, "Occupation", rowCount);
				String NameOfEmployer = reader.getCellData(SheetName, "NameOfEmployer", rowCount);
				String NatureofBusiness = reader.getCellData(SheetName, "NatureofBusiness", rowCount);
				String TypeOfOrganisation = reader.getCellData(SheetName, "TypeOfOrganisation", rowCount);
				String Designation = reader.getCellData(SheetName, "Designation", rowCount);
				String AnnualIncome = reader.getCellData(SheetName, "AnnualIncome", rowCount);


				Object ob[] = {username.trim(), password.trim(), leadID.trim(), ProposerInsuredSame.trim(), RelationWithInsured.trim(), mobileNumber.trim(),
						panNumber.trim(), ProposerName.trim(), InsuredMobileNo.trim(), InsuredPanNo.trim(), InsuredName.trim(), day.trim(), month.trim(), year.trim(), InsuredDay.trim(), InsuredMonth.trim(), InsuredYear.trim(),
						ProposerSalutation.trim(), InsuredSalutation.trim(), premiumValue.trim(), occupationOption.trim(), lifeStageValue.trim(), riskProfileFieldValue.trim(), investmentGoalValue.trim(), quoteAmount.trim(), planOptions.trim(),
						smokerNonSmoker.trim(), pptOption.trim(), term.trim(), paymode.trim(), AciSumAssured.trim(), Rideramount.trim(),
						level.trim(), IFSCCode.trim(), AccountNo.trim(), PaymentMethod.trim(), PreferredDrawDate.trim(), SourceOfFunds.trim(), BankStatus.trim(),
						nomiFirstName.trim(), nimiLastName.trim(), nomiday.trim(), nomimonth.trim(), nomiyear.trim(), genderValue.trim(), relationshipValue.trim(), shareValue.trim(),
						addressType.trim(), pinCode.trim(), addressOne.trim(), addressTwo.trim(), addressThree.trim(),
						Emaild.trim(), MaritalStatus.trim(), fatherSpouseName.trim(), motherName.trim(), maidenName.trim(),
						Qualification.trim(), Occupation.trim(), NameOfEmployer.trim(), NatureofBusiness.trim(), TypeOfOrganisation.trim(), Designation.trim(), AnnualIncome.trim(),};
				myData.add(ob);
			}
		}
		System.out.println("mydata rows value **********" + myData);
		return myData;
	}





	public ArrayList<Object[]> getJointLifeDataExcel(String testExcelSheet, String testName, String SheetName) {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		ArrayList<String> myColumnData = new ArrayList<String>();
		Xls_reader reader = null;

		try {
			reader = new Xls_reader(System.getProperty("user.dir") + testExcelSheet);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("view Quote Sheet row count ---------" + reader.getRowCount(SheetName));
		System.out.println(" ******* current test running method  *********" + testName);
		System.out.println("**** column count  ********" + reader.getColumnCount(SheetName));

		for (int rowCount = 3; rowCount <= reader.getRowCount(SheetName); rowCount++) {
			String currentTestMethod = reader.getCellData(SheetName, "testCaseName", rowCount);
			String enableFlag = reader.getCellData(SheetName, "flag", rowCount);
			if (currentTestMethod.equalsIgnoreCase(testName)) {
				String username = reader.getCellData(SheetName, "username", rowCount);
				String password = reader.getCellData(SheetName, "password", rowCount);
				String leadID = reader.getCellData(SheetName, "leadID", rowCount);
				String mobileNumber = reader.getCellData(SheetName, "mobileNumber", rowCount);
				String panNumber = reader.getCellData(SheetName, "panNumber", rowCount);
				String day = reader.getCellData(SheetName, "day", rowCount);
				String month = reader.getCellData(SheetName, "month", rowCount);
				String year = reader.getCellData(SheetName, "year", rowCount);
				String quoteAmount = reader.getCellData(SheetName, "quoteAmount", rowCount);
				String planOptions = reader.getCellData(SheetName, "planOptions", rowCount);
				String smokerNonSmoker = reader.getCellData(SheetName, "smokerNonSmoker", rowCount);
				String pptOption = reader.getCellData(SheetName, "pptOption", rowCount);
				String term = reader.getCellData(SheetName, "term", rowCount);
				String paymode = reader.getCellData(SheetName, "paymode", rowCount);
				String AciSumAssured = reader.getCellData(SheetName, "AciSumAssured", rowCount);
				String Rideramount = reader.getCellData(SheetName, "Rideramount", rowCount);
				String level = reader.getCellData(SheetName, "level", rowCount);
				String JointLifeMobileNumber = reader.getCellData(SheetName, "JointLifeMobileNumber", rowCount);
				String JointLifePan = reader.getCellData(SheetName, "JointLifePan", rowCount);
				String IFSCCode = reader.getCellData(SheetName, "IFSCCode", rowCount);
				String AccountNo = reader.getCellData(SheetName, "AccountNo", rowCount);
				String PaymentMethod = reader.getCellData(SheetName, "PaymentMethod", rowCount);
				String nomiFirstName = reader.getCellData(SheetName, "nomiFirstName", rowCount);
				String nimiLastName = reader.getCellData(SheetName, "nimiLastName", rowCount);
				String nomiday = reader.getCellData(SheetName, "nomiday", rowCount);
				String nomimonth = reader.getCellData(SheetName, "nomimonth", rowCount);
				String nomiyear = reader.getCellData(SheetName, "nomiyear", rowCount);
				String genderValue = reader.getCellData(SheetName, "genderValue", rowCount);
				String relationshipValue = reader.getCellData(SheetName, "relationshipValue", rowCount);
				String shareValue = reader.getCellData(SheetName, "shareValue", rowCount);



				Object ob[] = {username.trim(), password.trim(), leadID.trim(), mobileNumber.trim(),
						panNumber.trim(), day.trim(), month.trim(), year.trim(), quoteAmount.trim(), planOptions.trim(), smokerNonSmoker.trim(), pptOption.trim(),
						term.trim(), paymode.trim(), AciSumAssured.trim(), Rideramount.trim(), level.trim(), JointLifeMobileNumber.trim(), JointLifePan.trim(),
				IFSCCode.trim(), AccountNo.trim(), PaymentMethod.trim(),nomiFirstName.trim(), nimiLastName.trim(), nomiday.trim(),nomimonth.trim(),nomiyear.trim(), genderValue.trim(),
				relationshipValue.trim(),shareValue.trim(),
				};
				myData.add(ob);
			}
		}
		System.out.println("mydata rows value **********" + myData);
		return myData;
	}






	public ArrayList<Object[]> getJointLifeDataExcel2(String testExcelSheet, String testName, String SheetName) {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		ArrayList<String> myColumnData = new ArrayList<String>();
		Xls_reader reader = null;

		try {
			reader = new Xls_reader(System.getProperty("user.dir") + testExcelSheet);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("view Quote Sheet row count ---------" + reader.getRowCount(SheetName));
		System.out.println(" ******* current test running method  *********" + testName);
		System.out.println("**** column count  ********" + reader.getColumnCount(SheetName));

		for (int rowCount = 3; rowCount <= reader.getRowCount(SheetName); rowCount++) {
			String currentTestMethod = reader.getCellData(SheetName, "testCaseName", rowCount);
			String enableFlag = reader.getCellData(SheetName, "flag", rowCount);
			if (currentTestMethod.equalsIgnoreCase(testName)) {
				String username = reader.getCellData(SheetName, "username", rowCount);
				String password = reader.getCellData(SheetName, "password", rowCount);
				String leadID = reader.getCellData(SheetName, "leadID", rowCount);
				String mobileNumber = reader.getCellData(SheetName, "mobileNumber", rowCount);
				String panNumber = reader.getCellData(SheetName, "panNumber", rowCount);
				String day = reader.getCellData(SheetName, "day", rowCount);
				String month = reader.getCellData(SheetName, "month", rowCount);
				String year = reader.getCellData(SheetName, "year", rowCount);
				String quoteAmount = reader.getCellData(SheetName, "quoteAmount", rowCount);
				String planOptions = reader.getCellData(SheetName, "planOptions", rowCount);
				String smokerNonSmoker = reader.getCellData(SheetName, "smokerNonSmoker", rowCount);
				String pptOption = reader.getCellData(SheetName, "pptOption", rowCount);
				String term = reader.getCellData(SheetName, "term", rowCount);
				String paymode = reader.getCellData(SheetName, "paymode", rowCount);
				String AciSumAssured = reader.getCellData(SheetName, "AciSumAssured", rowCount);
				String Rideramount = reader.getCellData(SheetName, "Rideramount", rowCount);
				String level = reader.getCellData(SheetName, "level", rowCount);
				String JointLifeMobileNumber = reader.getCellData(SheetName, "JointLifeMobileNumber", rowCount);
				String JointLifePan = reader.getCellData(SheetName, "JointLifePan", rowCount);

				String DAY = reader.getCellData(SheetName, "DAY", rowCount);
				String MONTH = reader.getCellData(SheetName, "MONTH", rowCount);
				String YEAR = reader.getCellData(SheetName, "YEAR", rowCount);
				String pinCode = reader.getCellData(SheetName, "pinCode", rowCount);
				String pinCode2 = reader.getCellData(SheetName, "pinCode2", rowCount);
				String address1 = reader.getCellData(SheetName, "address1", rowCount);
				String address2 = reader.getCellData(SheetName, "address2", rowCount);
				String address3 = reader.getCellData(SheetName, "address3", rowCount);
				String language = reader.getCellData(SheetName, "language", rowCount);
				String mobile = reader.getCellData(SheetName, "mobile", rowCount);
				String telNo = reader.getCellData(SheetName, "telNo", rowCount);
				String emailid = reader.getCellData(SheetName, "emailid", rowCount);
				String marital = reader.getCellData(SheetName, "marital", rowCount);
				String fatherSpouse = reader.getCellData(SheetName, "fatherSpouse", rowCount);
				String mothername = reader.getCellData(SheetName, "mothername", rowCount);
				String maidenname = reader.getCellData(SheetName, "maidenname", rowCount);
				String eiaVal = reader.getCellData(SheetName, "eiaVal", rowCount);
				String eiaErrorMsg = reader.getCellData(SheetName, "eiaErrorMsg", rowCount);
				String val = reader.getCellData(SheetName, "val", rowCount);
				String errorMsg = reader.getCellData(SheetName, "errorMsg", rowCount);
				String num = reader.getCellData(SheetName, "num", rowCount);
				String numErrorMsg = reader.getCellData(SheetName, "numErrorMsg", rowCount);
				String qualification = reader.getCellData(SheetName, "qualification", rowCount);
				String occupation = reader.getCellData(SheetName, "occupation", rowCount);
				String nameofemployee = reader.getCellData(SheetName, "nameofemployee", rowCount);
				String natureofbusiness = reader.getCellData(SheetName, "natureofbusiness", rowCount);
				String typeoforganisation = reader.getCellData(SheetName, "typeoforganisation", rowCount);
				String Designation = reader.getCellData(SheetName, "Designation", rowCount);
				String annualincome = reader.getCellData(SheetName, "annualincome", rowCount);
				String emailtextError = reader.getCellData(SheetName, "emailtextError", rowCount);
				String fatherSpouseNameErrorMsg = reader.getCellData(SheetName, "fatherSpouseNameErrorMsg", rowCount);
				String motherErrorMsg = reader.getCellData(SheetName, "motherErrorMsg", rowCount);
				String maidenErrorMsg = reader.getCellData(SheetName, "maidenErrorMsg", rowCount);
				String errorMsg2 = reader.getCellData(SheetName, "errorMsg2", rowCount);
				String errorMsg3 = reader.getCellData(SheetName, "errorMsg3", rowCount);
				String errorMsg4 = reader.getCellData(SheetName, "errorMsg4", rowCount);
				String errorMsg5 = reader.getCellData(SheetName, "errorMsg5", rowCount);
				String errorMsg6 = reader.getCellData(SheetName, "errorMsg6", rowCount);
				String errorMsg7 = reader.getCellData(SheetName, "errorMsg7", rowCount);
				String errorMsg8 = reader.getCellData(SheetName, "errorMsg8", rowCount);
				String errorMsg9 = reader.getCellData(SheetName, "errorMsg9", rowCount);
				String spouseEmailid = reader.getCellData(SheetName, "spouseEmailid", rowCount);
				String spouseFatherName = reader.getCellData(SheetName, "spouseFatherName", rowCount);
				String spouseMotherName = reader.getCellData(SheetName, "spouseMotherName", rowCount);
				String spouseEiaVal = reader.getCellData(SheetName, "spouseEiaVal", rowCount);
				String val2 = reader.getCellData(SheetName, "val2", rowCount);
				String num2 = reader.getCellData(SheetName, "num2", rowCount);
				String spouseQualification = reader.getCellData(SheetName, "spouseQualification", rowCount);
				String spouseOccupation = reader.getCellData(SheetName, "spouseOccupation", rowCount);
				String spousenameofemployee = reader.getCellData(SheetName, "spousenameofemployee", rowCount);
				String spousenatureofbusiness = reader.getCellData(SheetName, "spousenatureofbusiness", rowCount);
				String spousetypeoforganisation = reader.getCellData(SheetName, "spousetypeoforganisation", rowCount);
				String spouseDesignation = reader.getCellData(SheetName, "spouseDesignation", rowCount);
				String spouseAnnualincome = reader.getCellData(SheetName, "spouseAnnualincome", rowCount);
				String spouseEmailtextError = reader.getCellData(SheetName, "spouseEmailtextError", rowCount);
				String spouseFatherNameErrorMsg = reader.getCellData(SheetName, "spouseFatherNameErrorMsg", rowCount);
				String spouseMotherErrorMsg = reader.getCellData(SheetName, "spouseMotherErrorMsg", rowCount);
				String spouseEiaErrorMsg = reader.getCellData(SheetName, "spouseEiaErrorMsg", rowCount);
				String spouseerrorMsg2 = reader.getCellData(SheetName, "spouseerrorMsg2", rowCount);
				String spouseerrorMsg3 = reader.getCellData(SheetName, "spouseerrorMsg3", rowCount);
				String spouseErrorMsg4 = reader.getCellData(SheetName, "spouseErrorMsg4", rowCount);
				String spouseErrorMsg5 = reader.getCellData(SheetName, "spouseErrorMsg5", rowCount);
				String spouseErrorMsg6 = reader.getCellData(SheetName, "spouseErrorMsg6", rowCount);
				String spouseErrorMsg7 = reader.getCellData(SheetName, "spouseErrorMsg7", rowCount);
				String spouseErrorMsg8 = reader.getCellData(SheetName, "spouseErrorMsg8", rowCount);
				String spouseErrorMsg9 = reader.getCellData(SheetName, "spouseErrorMsg9", rowCount);

				Object ob[] = {username.trim(), password.trim(), leadID.trim(), mobileNumber.trim(),
						panNumber.trim(), day.trim(), month.trim(), year.trim(), quoteAmount.trim(),
						planOptions.trim(), smokerNonSmoker.trim(), pptOption.trim(),term.trim(),
						paymode.trim(), AciSumAssured.trim(), Rideramount.trim(), level.trim(),
						JointLifeMobileNumber.trim(), JointLifePan.trim(), DAY.trim(), MONTH.trim(),
						YEAR.trim(), pinCode.trim(), pinCode2.trim(), address1.trim(), address2.trim(), address3.trim(),
						language.trim(), mobile.trim(), telNo.trim(), emailid.trim(), marital.trim(),
						fatherSpouse.trim(), mothername.trim(), maidenname.trim(), eiaVal.trim(), eiaErrorMsg.trim(),
						val.trim(), num.trim(), qualification.trim(), occupation.trim(),
						nameofemployee.trim(), natureofbusiness.trim(), typeoforganisation.trim(), Designation.trim(),
						annualincome.trim(), emailtextError.trim(), fatherSpouseNameErrorMsg.trim(),
						motherErrorMsg.trim(), maidenErrorMsg.trim(), errorMsg2.trim(), errorMsg3.trim(),
						errorMsg4.trim(), errorMsg5.trim(), errorMsg6.trim(), errorMsg7.trim(), errorMsg8.trim(),
						errorMsg9.trim(), spouseEmailid.trim(), spouseFatherName.trim(), spouseMotherName.trim(), spouseEiaVal.trim(),
						val2.trim(), num2.trim(), spouseQualification.trim(), spouseOccupation.trim(), spousenameofemployee.trim(),
						spousenatureofbusiness.trim(), spousetypeoforganisation.trim(), spouseDesignation.trim(),
						spouseAnnualincome.trim(), spouseEmailtextError.trim(), spouseFatherNameErrorMsg.trim(),
						spouseMotherErrorMsg.trim(), spouseEiaErrorMsg.trim(), spouseerrorMsg2.trim(), spouseerrorMsg3.trim(),
						spouseErrorMsg4.trim(), spouseErrorMsg5.trim(), spouseErrorMsg6.trim(), spouseErrorMsg7.trim(), spouseErrorMsg8.trim(),
						spouseErrorMsg9.trim() };
				myData.add(ob);
			}
		}
		System.out.println("mydata rows value **********" + myData);
		return myData;
	}








	public static String getPlatformNameFromExcel(String testExcelSheet, String sheetName) {
		String platform = null;
		Xls_reader reader = null;
		try {
			reader = new Xls_reader(System.getProperty("user.dir") + testExcelSheet);
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (int rowCount = 2; rowCount <= reader.getRowCount(sheetName); rowCount++) {
			String enableFlag = reader.getCellData(sheetName, "execute", rowCount);
			if (enableFlag.equalsIgnoreCase("YES")) {
				platform = reader.getCellData(sheetName, "platform", rowCount);
				break;
			}
		}
		return platform;
	}

}
