package selinum;

import java.util.NoSuchElementException;

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
import org.openqa.selenium.support.ui.Select;


public class pratice {

	public static void main(String[] args)      {

System.setProperty("webdriver.edge.driver", "C:\\Program Files\\msedgedriver.exe");
		        // Instantiate a ChromeDriver class.
		        WebDriver driver = new EdgeDriver();
		        driver.manage().window().maximize();
		       driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		       WebElement stdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		       Select dropdown=new Select(stdropdown);
		       dropdown.selectByIndex(3);
		       System.out.println(dropdown.getFirstSelectedOption().getText());
	}       
}
