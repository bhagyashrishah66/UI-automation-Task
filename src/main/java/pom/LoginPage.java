package pom;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	public class LoginPage {
	 @FindBy(xpath = "//div[@class='login_logo']")
	 private WebElement header_SwagLabs;
	 @FindBy(xpath = "//input[@placeholder='Username']")
	 private WebElement input_UserName;
	 @FindBy(xpath = "//input[@placeholder='Password']")
	 private WebElement input_Password;
	 @FindBy(xpath = "//input[@class='btn_action']")
	 private WebElement button_LogIn;
	 @FindBy(xpath = "//img[@class='bot_column']")
	 private WebElement img_BotColumn;
	 public LoginPage(WebDriver driver) {
	  PageFactory.initElements(driver, this);
	 }
	 public void verifyPageHeader(WebDriver driver) {
	  header_SwagLabs.isDisplayed();
	 }
	 public void verifyLogoBotCon(WebDriver driver) {
	  img_BotColumn.isDisplayed();
	 }
	 public void enterLoginCredentials(String username, String password) {
	  input_UserName.sendKeys(username);
	  input_Password.sendKeys(password);
	 }
	 public void clickOnLoginButton(WebDriver driver) {
	  button_LogIn.click();
	 }
	}



