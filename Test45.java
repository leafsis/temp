package day12;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import day12.pageObjects.HomePage;
import day12.pageObjects.LoginPage1;
import day12.pageObjects.ProductResult;



public class Test44 {//封装页面练习
	WebDriver driver;
	LoginPage1 lp;
	HomePage hp;
	ProductResult pr;
	String url="http://localhost/ws/ecshop/upload/user.php";
	String url1="http://localhost/ws/ecshop/upload/message.php";
	@Before
	public void setUp() throws Exception {
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("dom.ipc.plugins.enabled", false);
		driver = new FirefoxDriver(profile);	
		//窗口最大化
		driver.manage().window().maximize();
		//设置等待时间
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	public void Testa() throws Exception {
		   lp=new LoginPage1(driver);
		   lp.open(url);
		   hp=lp.login("yanzhi", "123456");
		  // hp=new HomePage(driver);
		   hp.search("a");
		   pr=new ProductResult(driver);
		   pr.confirm("4");
		   hp.logou();
		   
	}
	
	
	@After
	public void tearDown() throws Exception {
		 //driver.quit();
	}
	
}
