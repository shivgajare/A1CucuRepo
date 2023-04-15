package com.stepdef;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;


import io.cucumber.java.en.*;


public class LoginSteps {
	
	WebDriver driver;
	WebElement search;
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.firstcry.com/");
		driver.manage().window().maximize();

	}

	@When("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		
		/*driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9359393747");
		
		driver.findElement(By.xpath("//div[@class='B14_white comm-btn btn-login-continue btn-login-cont-otp']")).click();
		Thread.sleep(5000);*/
		

		//	search=driver.findElement(By.name("GIRL FASHION"));
		//	search.click();
		//WebElement ele = driver.findElement(By.xpath("<xpath>"));

		//Creating object of an Actions class
		//Actions action = new Actions(driver);

		//Performing the mouse hover action on the target element.
	//	action.moveToElement(ele).perform();
			
		
	}

	@When("^user clicks on submit button$")
	public void user_clicks_on_submit_button() throws Throwable {

      /* JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.xpath("//div[@class='B14_white btn-login-continue btn-login-cont-pass comm-btn-white']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("mbHP12#$");
		driver.findElement(By.xpath("//div[@class='B14_white comm-btn comm-btn-chkpass']")).click();
		Thread.sleep(9000);*/
		Thread.sleep(5000);
	WebElement item = driver.findElement(By.id("search_box"));
	item.clear();
	item.sendKeys("baby caps");
	driver.findElement(By.xpath("//span[@class='search-button']")).click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,350)", "");
    
    
    driver.findElement(By.xpath("//img[@src='//cdn.fcglcdn.com/brainbees/images/products/300x364/2214930a.webp']")).click();
		
   String parent=driver.getWindowHandle();

    Set<String>s=driver.getWindowHandles();
    
   

    // Now iterate using Iterator
    Iterator<String> I1= s.iterator();

    while(I1.hasNext())
    {

    String child_window=I1.next();
    driver.switchTo().window(child_window);
    
    
    }
    
   // driver.findElement(By.xpath("//span[contains(text(),'GO TO CART')]")).click();
   // driver.findElement(By.xpath("//span[contains(text(),'ADD TO CART') and @style='line-height: 45px;']")).click();
    driver.findElement(By.xpath("//span[@class='p_like_txt' and contains(text(),'Shortlist')]")).click();
    driver.findElement(By.id("cart_TotalCount")).click();
    driver.findElement(By.id("ShortlistTab")).click();
    Thread.sleep(5000);
    JavascriptExecutor jm = (JavascriptExecutor) driver;
    jm.executeScript("window.scrollBy(-350,0)", "");
    Thread.sleep(5000);
    driver.findElement(By.xpath("//div[@class='addto-cart-button']")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//div[@class='sizeaddtocart R12_orange']")).click();
    /*if(!parent.equals(child_window))
    {
    driver.switchTo().window(child_window);

    System.out.println(driver.switchTo().window(child_window).getTitle());

    driver.close();
    }
    }
    
    /*	WebElement ele = driver.findElement(By.xpath("//li/span[@id='menu2']"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();*/

	}
	


	@Then("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {

	}



}
