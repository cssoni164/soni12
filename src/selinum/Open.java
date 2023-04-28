package selinum;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;


public class Open {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException    {

System.setProperty("webdriver.edge.driver", "C:\\Program Files\\msedgedriver.exe");
		        // Instantiate a ChromeDriver class.

		        WebDriver driver = new EdgeDriver();
		        driver.manage().window().maximize();
		        
		     //   driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		        
		      driver.get("https://stg-lend.cs73.force.com/directsales");
		      System.out.println(driver.getTitle());
		  
		 
		      driver.findElement(By.name("username")).sendKeys("japanqoachtest@iqos.de23");
		      
		    driver.findElement(By.name("pw")).sendKeys("Welcome@2023");
		      driver.findElement(By.id("Login")).click();
		  
		    
		      System.out.println("out");
	driver.findElement(By.xpath("//a[text()='Account Management']")).click();
	
	driver.findElement(By.xpath("//button[text()='Create New Acc']")).click();
	
	
	 
	    
	driver.findElement(By.xpath("//*[@name=\"Name\"]")).sendKeys("yafffffrrrecogr4354");
	
	driver.findElement(By.xpath("//*[@name=\"Phone\"]")).sendKeys("08023534331");
	
driver.findElement(By.xpath("//*[@name=\"DICE_PIC_LastName__c\"]")).sendKeys("sdgdfgdf");
	
	//select industry
	driver.findElement(By.xpath("//*[@name=\"DICE_Industry__c\"]")).click();
	
	//driver.findElement(By.xpath("//*[@name=\"DICE_Industry__c\"]")).sendKeys("2",Keys.ENTER);
	    Actions actions = new Actions(driver);
	   // actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
	  //  actions.sendKeys(Keys.DOWN).build().perform();
	   Actions actions1 = new Actions(driver);
	  //  actions1.sendKeys(Keys.ENTER).build().perform();//press enter
	driver.findElement(By.xpath("//span[text()='B2C']")).click();
	System.out.println(driver.findElement(By.xpath("//*[@name=\"DICE_Industry__c\"]")).getText());
//	Assert.assertEquals(driver.findElement(By.xpath("//*[@name=\"DICE_Industry__c\"]")).getText(), "s");
	      driver.findElement(By.xpath("//*[@name=\"DICE_PIC_Department__c\"]")).sendKeys("it");
	   
	  //select *IndustryDetail
		driver.findElement(By.xpath("//*[@name=\"DICE_IndustryDetail__c\"]")).click();
		
		actions.sendKeys(Keys.DOWN).build().perform();//press down arrow key
	   
	    actions1.sendKeys(Keys.ENTER).build().perform();//press enter
		    //select *Business Status
			driver.findElement(By.xpath("//*[@name=\"Business_Status__c\"]")).click();
			
			    Actions actions121 = new Actions(driver);
			    actions121.sendKeys(Keys.DOWN).build().perform();//press down arrow key
			    Actions actions122 = new Actions(driver);
			    actions122.sendKeys(Keys.ENTER).build().perform();//press enter
			   
			    //select * Account chaneel
	  
			    driver.findElement(By.xpath("//*[@name=\"DICE_AccountChannel__c\"]")).click();
				
			
				   Actions actions1221 = new Actions(driver);
				    actions1221.sendKeys(Keys.DOWN).build().perform();//press down arrow key
				    Actions actions1222 = new Actions(driver);
				    actions1222.sendKeys(Keys.ENTER).build().perform();//press enter
				    
				//  select * Account S-chaneel
				   
				driver.findElement(By.xpath("//*[@name=\"DICE_SubChannel__c\"]")).click();
				 
				       
					    Actions actions12291 = new Actions(driver);
					    actions12291.sendKeys(Keys.DOWN).build().perform();//press down arrow key
					    Actions actions19222 = new Actions(driver);
					    actions19222.sendKeys(Keys.ENTER).build().perform();//press enter
					    driver.findElement(By.xpath("//*[@name=\"DiceAddress__PostalCode__s\"]")).sendKeys("100005");
					    
				 //   select state
					    driver.findElement(By.xpath("//*[@name=\"DiceAddress__StateCode__s\"]")).click();
						 
							    Actions actions122891 = new Actions(driver);
							    actions122891.sendKeys(Keys.DOWN).build().perform();//press down arrow key
							    Actions actions119222 = new Actions(driver);
							    actions119222.sendKeys(Keys.ENTER).build().perform();//press enter
		
					//    driver.findElement(By.xpath("//*[@name=\"DiceAddress__PostalCode__s\"]")).sendKeys("100005");
					    driver.findElement(By.xpath("//*[@name=\"DiceAddress__Street__s\"]")).sendKeys("rc vyas");
					    driver.findElement(By.xpath("//*[@name=\"DiceAddress__City__s\"]")).sendKeys("bhilwara");
	
	//Select industry = new Select(driver.findElement(By.xpath("//*[@id=\"combobox-button-299\"]")));
	//industry.selectByVisibleText("B2B");
	//Select industryDetail = new Select(driver.findElement(By.xpath("//*[@id=\"combobox-button-304\"]")));
	//industryDetail.selectByVisibleText("運輸");
	
	
driver.findElement(By.xpath("//button[text()='Save']")).click();

try {
    WebElement element = driver.findElement(By.xpath("//button[text()='Continue']"));
    element.click();
    System.out.println("duplicate account");
    
    
} catch (Exception e) {
    System.out.println("New Account");
}

}}
