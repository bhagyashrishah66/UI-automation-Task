package testProject;

import java.io.IOException;

import org.bouncycastle.openssl.EncryptionException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pojo.Browser;
import pom.LoginPage;
import pom.ProductRemovePage;
import pom.ProductsPage;

public class ProductRemovepage {
	WebDriver Driver;
	 @BeforeTest
	 public void openChromerBrowser() throws EncryptionException, IOException {
	  Driver = Browser.openBrowser();
	 }
	 @AfterMethod
	 public void closeBrowser() throws IOException {
	  Driver.quit();
	 }
	 @Test
	 public void verifyUserDataInTable1() throws IOException, InterruptedException {
		 LoginPage loginPage = new LoginPage(Driver);
			//	  ProductsPage productsPage = new ProductsPage(Driver);
				  loginPage.verifyPageHeader(Driver);
				  loginPage.verifyLogoBotCon(Driver);
				  loginPage.enterLoginCredentials("standard_user", "secret_sauce");
					
				  loginPage.clickOnLoginButton(Driver);
			//	  productsPage.verifyProductsPageHeader(Driver);

			//  ProductsPage productPage = new ProductsPage(Driver);
					 ProductRemovePage productremove = new ProductRemovePage(Driver);

			  ProductsPage productsPage = new ProductsPage(Driver);
			  productsPage.clickOnAddToCart();
			  productsPage.clickOnBucket();
			  productsPage. checkQuantity();
			  productremove.clickOnRemove();


//		 ProductRemovePage productremove = new ProductRemovePage(Driver);
//		// ProductRemovePage productsPage = new ProductsPage(Driver);
//		 productremove.clickOnContinue();
//		 productremove.clickOnBucket();	
//		 productremove.clickOnRemove();
	  SoftAssert softAssert = new SoftAssert();
	  softAssert.assertAll();
	 }
	}





