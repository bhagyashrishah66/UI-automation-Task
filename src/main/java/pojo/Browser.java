package pojo;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import io.github.bonigarcia.wdm.WebDriverManager;
	public class Browser {
	 public static WebDriver openBrowser() {
	     WebDriverManager.chromedriver().browserVersion("122.0.6261.70").setup();
	     ChromeOptions options = new ChromeOptions();
	     options.addArguments("--disable-notifications");
	     WebDriver driver = new ChromeDriver(options);
	     driver.manage().window().maximize();
	     driver.get("https://www.saucedemo.com/v1/");
	     return driver;
	 }
	}



