package pages;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

public class VerificationPage_PL1 extends StartupPage {

	public VerificationPage_PL1(WebDriver driver) {
		super(driver);
	}

	/*
	 * --------------------------- Locators
	 * -------------------------------------------
	 */

	private By emailInput = By.cssSelector(" ");
	private By passwordInput = By.cssSelector(" ");
	private By signInButton = By.cssSelector(" ");
	private By headerProfileIcon = By.cssSelector(" ");
	private By logoutButton = By.cssSelector(" ");

	public By getVerificationLocator() {
		return By.xpath(" ");
	}

	public By getAnchorTagLocatorByText(String anchorTagName) {
		return By.xpath(" ");
	}

	public void login() {
		driver.findElement(emailInput).sendKeys(" ");
		driver.findElement(passwordInput).sendKeys(" ");
		driver.findElement(signInButton).click();

	}

	public By calendarFromDropdown() {
		return By.xpath(" ");
	}

	public By calendarToDropdown() {
		return By.xpath(" ");
	}

	public By getOkButtonLocator() {
		return By.xpath(" ");
	}

	public By getStarIconLocator() {
		return By.xpath(" ");
	}

	public By getActualRequestedOnDates() {
		return By.xpath(" ");
	}

	public By verifyRequisitionDropdown() {
		return By.xpath(" ");
	}

	public By getRadioButtonsLocator(String radioButtonName) {
		return By.xpath(" ");
	}

	public By getReqStatus() {
		return By.cssSelector(" ");
	}

	public By getRequisitionNumberLocatorsForAllRequisitions() {
		return By.xpath(" ");
	}

	public By getRequisitionNumberLocatorFromTheReport() {
		return By.xpath(" ");
	}

	public By getResultCountLocator() {
		return By.cssSelector(" ");
	}

	public By getFirstViewButton() {
		return By.xpath(" ");
	}

	public By getTotalRecordCount() {
		return By.cssSelector(" ");
	}

	public By getButtonLocatorsBytext(String buttonName) {
		return By.xpath(" ");
	}

	public By getInventoryLocator() {
		return By.xpath(" ");
	}

	public By getInventoryPageBarFixedLocator(String navBarName) {
		return By.xpath(" ");
	}

	public By getSubNavTabLocator(String subNavName) {
		return By.xpath(" ");
	}

	public By getLocatorById(String idName) {
		return By.id(" ");
	}

	public By getItemNameRequiredMsg() {
		return By.xpath(" ");
	}

	public By favouriteOrStarIcon() {
		return By.xpath(" ");
	}

	public By searchBarId() {
		return By.id(" ");
	}

	/*
	 * --------------------------- Methods
	 * -------------------------------------------
	 */

	public void openVerificationMenu() {
	// Write your logic here	
	}

	public void successfullNavigation(String module) throws InterruptedException {
		// Write your logic here
	}

	public void verifyButtonPresentWithText(String text) {
		// Write your logic here
	}

	public void clickOnButtonByText(String text) {
		// Write your logic here
	}

	public void chooseDate(String fromDate, String toDate) {
		// Write your logic here
	}

	public void clickTooltip() {
		// Write your logic here
	}

	public void clickOkButton() {

		// Write your logic here
	}

	public By getDateRangeButton() {
		return By.cssSelector(" ");
	}

	public void chooseDateRange(String range) {
		// Write your logic here
	}

	public void verifyDateRange(String fromDate, String toDate) {

		// Write your logic here
	}

	public boolean selectRadioButton(String radioButtonText) {
		// Write your logic here
		return false;
	}

	public void chooseReqStatus(String status) throws InterruptedException {
		// Write your logic here
	}

	public void verifyReqStatus(String status) {
		// Write your logic here
	}

	public String fetchReqNum() {
		// Write your logic here
		return null;
	}

	public void verifyReqNum(String expectedReqNumber) {
		// Write your logic here
	}

	public void verifyCount() {

		// Write your logic here
	}

	public void verifyDateRangeforReq(String fromDate, String toDate) {
		// Write your logic here

	}

	public boolean isPendingRadioButtonVisible() throws Exception {
		// Write your logic here
		return false;
	}

	public boolean scrollAllTheWayDown() throws Exception {
		// Write your logic here
		return false;
	}

	public boolean isPreviousButtonVisible() throws Exception {
		// Write your logic here
				return false;
	}

	public boolean scrollAllTheWayUp() throws Exception {
		// Write your logic here
				return false;
	}

	public void clickOnInventory() {
		// Write your logic here
	}

	public void clickOnPurchaseRequest() {
		// Write your logic here
	}

	public void clickOnCreatePurchaseRequestButton() {
		// Write your logic here
	}

	public void clickOnRequestButton() {
		// Write your logic here
	}

	public String verifyRequiredFieldErrormessage() {
		// Write your logic here
		return null;
	}

	public String verifyToolTipText() {
		// Write your logic here
		return null;
	}

	public boolean verifyVerificationComponentsAreVisible() throws Exception {

		// Write your logic here
		return false;
	}

}
