package pages;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class VerificationPage_PL2 extends StartupPage {

	public VerificationPage_PL2(WebDriver driver) {
		super(driver);
	}

	/*
	 * --------------------------- Locators
	 * -------------------------------------------
	 */

	// Write the locators here
	
	/*
	 * --------------------------- Methods
	 * -------------------------------------------
	 */

	/**
 * About this method login()
 *
 * @param : null
 * @description : This method performs the login action by entering the email, 
 *                password, and clicking the sign-in button.
 * @return : void
 * @throws : Exception - if there is an issue interacting with the email input, 
 *           password input, or sign-in button.
 */
	public void login() {
		//Write your logic here
	}



	/**
 * @Test1.1 @Test2.1 @Test3.1 @Test4.1 @Test5.1 @Test6.1 @Test7.1 @Test8.1 @Test9.1 @Test10.1 about this method openVerificationMenu() *
 * @param : null
 * @description : This method scrolls to the verification menu using JavaScript and clicks on it.
 * @return : void
 * @throws : Exception - if there is an issue locating, scrolling to, or clicking the verification menu.
 */
	public void openVerificationMenu() {
		//Write your logic here
	}


	/**
 * @Test1.2 @Test2.2 @Test3.2 @Test4.2 @Test4.4 @Test5.2 @Test8.2 @Test9.2 @Test10.2 about this method successfullNavigation(String module)
 *
 * @param : module - The expected substring to verify in the current URL.
 * @description : This method verifies that the current URL contains the specified module substring 
 *                after navigation and logs the result.
 * @return : void
 * @throws : InterruptedException - if the thread sleep is interrupted.
 *           AssertionError - if the expected substring is not found in the URL.
 */


	public void successfullNavigation(String module) throws InterruptedException {
		//Write your logic here
	}

	/**
 * @Test2.3 @Test2.4 @Test3.3 @Test3.4 about this method verifyButtonPresentWithText(String text)
 *
 * @param : text - The text of the button to verify its presence.
 * @description : This method checks if a button with the specified text is displayed on the page 
 *                and fails the test if the button is not visible.
 * @return : void
 * @throws : AssertionError - if the button with the specified text is not visible.
 */


	public void verifyButtonPresentWithText(String text) {
		//Write your logic here
	}

	/**
 * @Test3.5 @Test4.3 @Test5.3 @Test8.6 @Test8.7about this method clickOnButtonByText(String text)
 *
 * @param : text - The text of the button to be clicked.
 * @description : This method locates a button with the specified text and performs a click action on it.
 * @return : void
 * @throws : Exception - if there is an issue locating or clicking the button.
 */


	public void clickOnButtonByText(String text) {
		//Write your logic here
	}


	/**
 * @Test3.6 about this method verifyVerificationComponentsAreVisible()
 *
 * @param : null
 * @description : This method verifies the visibility of multiple verification components 
 *                such as navigation buttons, date range fields, and sub-navigation tabs, 
 *                and highlights each component during the check.
 * @return : boolean - Returns true if all components are visible, otherwise false.
 * @throws : Exception - if any component is not visible or an error occurs during the verification process.
 */


	public boolean verifyVerificationComponentsAreVisible() throws Exception {

		
		//Write your logic here
		return false;
	}

	/**
 * @Test6.4 @Test8.5  @Test9.4 about this method clickOkButton()
 *
 * @param : null
 * @description : This method locates and clicks the "OK" button.
 * @return : void
 * @throws : Exception - if there is an issue locating or clicking the "OK" button.
 */


	public void clickOkButton() {

		//Write your logic here
	}

	/**
 * @Test6.5 @Test9.5 about this method verifyDateRange(String fromDate, String toDate)
 *
 * @param : fromDate - The start date in "dd-MM-yyyy" format.
 *         toDate - The end date in "dd-MM-yyyy" format.
 * @description : This method verifies that all dates after applying the filter are within the specified date range.
 * @return : void
 * @throws : AssertionError - if any date is outside the specified date range or fails to parse.
 */

	
	public void verifyDateRange(String fromDate, String toDate) {

		//Write your logic here
	}

	/**
 * @Test6.3 @Test10.3 @Test10.4 @Test10.5 @Test10.6 @Test10.7 @Test10.8 @Test10.9 @Test10.10 @Test10.11 about this method selectRadioButton(String radioButtonText)
 *
 * @param : radioButtonText - The text associated with the radio button to be selected.
 * @description : This method locates and clicks on a radio button based on the provided text.
 * @return : boolean - Returns true if the radio button is successfully clicked.
 * @throws : Exception - if there is an issue locating or clicking the radio button.
 */

	
	public boolean selectRadioButton(String radioButtonText) {
		//Write your logic here
		return false;
	}
	

	/**
 * @Test6.2 @Test8.3 about this method chooseDate(String fromDate, String toDate)
 *
 * @param : fromDate - The start date in the format "DD-MM-YYYY".
 *         toDate - The end date in the format "DD-MM-YYYY".
 * @description : This method sets the "from" and "to" dates by locating and interacting with date dropdowns.
 * @return : void
 * @throws : Exception - if there is an issue locating or interacting with the date dropdowns or buttons.
 */

	public void chooseDate(String fromDate, String toDate) {
		//Write your logic here
	}

	/**
 * @Test8.4 about this method clickTooltip()
 *
 * @param : null
 * @description : This method locates and clicks the tooltip element, which is identified by the star icon.
 * @return : void
 * @throws : Exception - if there is an issue locating or clicking the tooltip element.
 */

	public void clickTooltip() {
		//Write your logic here
	}

	/**
 * @Test8.8 about this method verifyDateRangeforReq(String fromDate, String toDate)
 *
 * @param : fromDate - The start date in "DD-MM-YYYY" format.
 *         toDate - The end date in "DD-MM-YYYY" format.
 * @description : This method verifies if the actual date range matches the provided from and to dates.
 * @return : void
 * @throws : AssertionError - if the actual date range does not match the expected range.
 */

	
	public void verifyDateRangeforReq(String fromDate, String toDate) {
		//Write your logic here

	}

	/**
 * @Test9.3 about this method chooseDateRange(String range)
 *
 * @param : range - The text of the date range option to be selected.
 * @description : This method clicks on the date range button, selects a specified range, and then closes the dropdown.
 * @return : void
 * @throws : Exception - if there is an issue locating or clicking the date range elements.
 */

	
	public void chooseDateRange(String range) {
		//Write your logic here

	}

	
	/**
 * @Test7.2 about this method verifyToolTipText()
 *
 * @param : null
 * @description : This method retrieves and returns the tooltip text (title attribute) of the star icon.
 * @return : String - Returns the tooltip text of the star icon.
 * @throws : Exception - if there is an issue locating the tooltip or retrieving its text.
 */


	public String verifyToolTipText() {
		//Write your logic here
		return null;
	}

/**
 * @Test11.1 about this method clickOnInventory()
 *
 * @param : null
 * @description : This method scrolls to and clicks on the inventory tab, then clicks on the internal tab in the inventory page.
 * @return : void
 * @throws : Exception - if there is an issue interacting with the elements or executing JavaScript.
 */


	public void clickOnInventory() {
		//Write your logic here
	}

	/**
 * @Test11.2 @Test12.2 @Test13.2 @Test14.2 @Test15.2 @Test16.2 about this method clickOnPurchaseRequest()
 *
 * @param : null
 * @description : This method clicks on the "Purchase Request" tab in the navigation.
 * @return : void
 * @throws : Exception - if there is an issue locating or clicking the "Purchase Request" tab.
 */


	public void clickOnPurchaseRequest() {
		//Write your logic here
	}

	/**
 * @Test11.3 about this method clickOnCreatePurchaseRequestButton()
 *
 * @param : null
 * @description : This method clicks on the "Create Purchase Request" button.
 * @return : void
 * @throws : Exception - if there is an issue locating or clicking the button.
 */


	public void clickOnCreatePurchaseRequestButton() {
		//Write your logic here
	}

	/**
 * @Test11.4 about this method fillTheRequiredFields()
 *
 * @param : Map<String, String> data - A map containing the values to fill in the mandatory fields.
 * @description : This method fills in the required fields to create a Purchase Request, including vendor name, item name, and remarks.
 * @return : void
 * @throws : InterruptedException - if there is an issue with thread sleep during field population.
 */


	public void fillTheRequiredFields(Map<String, String> data) throws InterruptedException {
		//Write your logic here
	}

	/**
 * @Test11.5 about this method clickOnRequestButton()
 *
 * @param : null
 * @description : This method clicks on the "Request PO Requisition" button to initiate the process.
 * @return : void
 * @throws : Exception - if there is an issue interacting with the button.
 */


	public void clickOnRequestButton() {
		//Write your logic here
	}

	/**
 * @Test11.6 about this method verifyPurchaseRequestSuccessMsg()
 *
 * @param data - A Map containing dynamic data (e.g., expected success message).
 * @description : This method retrieves and verifies the success message displayed after creating a purchase request.
 * @return : String - The success message text retrieved from the UI.
 * @throws : None - The method returns the success message or logs any exception if it occurs.
 */

	public String verifyPurchaseRequestSuccessMsg(Map<String, String> data) {
		//Write your logic here
		return null;
	}

	/**
 * @Test12.1 @Test13.1 @Test14.1 @Test15.1 @Test16.1 about this method clickVerificationMenu()
 *
 * @description : This method clicks on the "Verification" menu, scrolls the page to make it visible, 
 * and waits for the URL to contain the substring "Verification/Inventory". It then clicks on the "Inventory" submodule 
 * within the page after the URL condition is met.
 * 
 * @return : void - The method performs actions of navigating to and interacting with the "Verification" and "Inventory" elements.
 * @throws : Exception - If any element is not found or an error occurs during interaction or waiting for the URL, it is thrown and handled by the method.
 */


	public void clickVerificationMenu() {
		//Write your logic here
	}


	/**
 * @Test12.3 about this method verifyAddedPurchaseRequestStatus()
 *
 * @param data - A Map containing dynamic data (e.g., vendor name and status).
 * @description : This method verifies the status of a purchase request by clicking the OK button and retrieving its status text from the UI.
 * @return : String - The purchase request status text.
 * @throws : None - The method returns the status text or logs any exception if it occurs.
 */


	public String verifyAddedPurchaseRequestStatus(Map<String, String> data) {
		//Write your logic here
		return null;
	}


	/**
 * @Test13.3 @Test14.3 about this method clickOnViewRequestWithStatusPending()
 *
 * @description : This method locates and clicks on the "View" button for a purchase request with the status "Pending".
 * It uses a helper method to find the button and then clicks on it while also highlighting it for visibility.
 * 
 * @return : void - The method performs an action of clicking the view button.
 * @throws : None - If the button is not found or an error occurs, it would be handled by the common event methods.
 */

	public void clickOnViewRequestWithStatusPending() {
		//Write your logic here
	}

	

	/**
 * @Test13.4 about this method approveThePurchaseRequest()
 *
 * @description : This method locates and clicks on the "Approve" button to approve a purchase request.
 * It highlights the button for visibility before clicking it.
 * 
 * @return : void - The method performs an action of clicking the approve button.
 * @throws : None - If the button is not found or an error occurs, it would be handled by the common event methods.
 */

	public void approveThePurchaseRequest() {
		//Write your logic here
	}

	/**
 * @Test13.5 about this method verifyApprovalSuccessMessage()
 *
 * @description : This method verifies the success message displayed after the approval of a purchase request. 
 * It locates the success message element and compares its text with the expected approval success message passed in the data map.
 * If the success message element is found, its text is returned. If there’s an issue, an exception will be handled.
 * 
 * @return : String - The actual success message text retrieved from the web element.
 * @throws : None - If the success message element is not found or an error occurs, it will be handled and the stack trace will be printed.
 */


	public String verifyApprovalSuccessMessage(Map<String, String> data) {
		//Write your logic here
		return null;
	}

/**
 * @Test13.6 @Test15.3 about this method clickOnApprovedRadioButton()
 *
 * @description : This method locates and clicks on the "approved" radio button to select it.
 * It highlights the radio button for visibility before performing the click action.
 * 
 * @return : void - The method performs an action of clicking the approved radio button.
 * @throws : None - If the radio button is not found or an error occurs, it will be handled by the common event methods.
 */


	public void clickOnApprovedRadioButton() {
		//Write your logic here
	}

	/**
 * @Test15.6 about this method clickOnRejectedRadioButton()
 *
 * @description : This method locates and clicks on the "Rejected" radio button to select it. 
 * It highlights the button for visibility before clicking it.
 * 
 * @return : void - The method performs the action of selecting the "Rejected" radio button.
 * @throws : None - If the "Rejected" radio button is not found or an error occurs, it would be handled by the common event methods.
 */


	public void clickOnRejectedRadioButton() {
		//Write your logic here
	}	

	/**
 * @Test13.7 about this method verifyPurchaseRequestStatusInTable()
 *
 * @description : This method verifies the status of a purchase request in a table based on the provided vendor name and 
 * checks if the status is "approved". It retrieves the text of the status from the table and returns it.
 * 
 * @return : String - The status of the purchase request (e.g., "approved").
 * @throws : Exception - If the element is not found or an error occurs while retrieving the status, it is thrown and handled by the method.
 */


	public String verifyPurchaseRequestStatusInTable(Map<String, String> data) {
		//Write your logic here
		
		return null;
	}

	/**
 * @Test15.7 about this method verifyPurchaseRequestStatusInRejectedTable()
 *
 * @description : This method verifies the status of a purchase request in the "Rejected" table. 
 * It locates the purchase request status based on the vendor name and verifies if the status is "rejected".
 * The status text is retrieved and returned.
 * 
 * @return : String - The method returns the status text of the purchase request found in the "Rejected" table.
 * @throws : Exception - If an error occurs while locating or retrieving the status, the exception is thrown.
 */


	public String verifyPurchaseRequestStatusInRejectedTable(Map<String, String> data) {
		
		//Write your logic here
		return null;
	}

	/**
 * @Test14.4 about this method clickOnRejectAllButton()
 *
 * @description : This method locates and clicks on the "Reject All" button to reject all items in the list. 
 * It highlights the button for visibility before performing the click action.
 * 
 * @return : void - The method performs an action of clicking the "Reject All" button.
 * @throws : None - If the button is not found or an error occurs, it would be handled by the common event methods.
 */


	public void clickOnRejectAllButton() {
		//Write your logic here
	}

	/**
 * @Test15.5 about this method clickOnRejectAllButtonWithRemarks()
 *
 * @description : This method enters remarks in the remarks field and then locates and clicks on the 
 * "Reject All" button. It highlights the button for visibility before clicking it.
 * 
 * @return : void - The method performs the actions of entering remarks and clicking the "Reject All" 
 * button to reject all items.
 * @throws : None - If the remarks field or the "Reject All" button is not found or an error occurs, 
 * it would be handled by the common event methods.
 */

	public void clickOnRejectAllButtonWithRemarks(Map<String, String> verificationExpectedData) {
		//Write your logic here
	}

	

	/**
 * @Test14.5 about this method rejectAPurchaseRequestAndVerifyThePopUpMessage()
 *
 * @description : This method rejects a purchase request and verifies the popup message displayed 
 * when the rejection is not successful. It checks for the "failed" message and compares it 
 * with the expected message for the required remark during cancellation.
 * 
 * @return : String - The method returns the failed message text displayed in the popup.
 * @throws : Exception - If any error occurs while finding the popup element or getting its text, 
 * the exception will be thrown.
 */


	public String rejectAPurchaseRequestAndVerifyThePopUpMessage(Map<String, String> verificationExpectedData) {
		//Write your logic here
		return null;
	}
/**
 * @Test15.4 about this method clickOnViewRequestWithStatusApproved()
 *
 * @description : This method locates and clicks on the "View" button for a purchase request 
 * that has the status "approved". It highlights the button for visibility before clicking it.
 * 
 * @return : void - The method performs an action of clicking the "View" button for the approved 
 * purchase request.
 * @throws : None - If the button is not found or an error occurs, it would be handled by the 
 * common event methods.
 */

	public void clickOnViewRequestWithStatusApproved() {
		//Write your logic here
	}

	/**
 * @Test16.3 about this method takingScreenshotOfTheCurrentPage()
 *
 * @description : This method captures a screenshot of the current page and saves it with the name "Verification-Purchase Request".
 * It returns a boolean value indicating whether the screenshot was successfully taken and saved.
 * 
 * @return : Boolean - The method returns `true` if the screenshot was successfully taken, otherwise `false`.
 * @throws : Exception - If an error occurs while taking the screenshot, the exception is thrown.
 */

	public Boolean takingScreenshotOfTheCurrentPage() throws Exception {
		//Write your logic here
		return false;
	}


}
