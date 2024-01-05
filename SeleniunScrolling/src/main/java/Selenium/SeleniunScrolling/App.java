package Selenium.SeleniunScrolling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	//register the webdriver =>browser vendor 
    			WebDriverManager.chromedriver().setup();
    			//creating an object to the object
    			WebDriver wd=new ChromeDriver();
    			//maximize the browser
    			wd.manage().window().maximize();

    			//webpage timebound 

    			// wd.manage().timeouts().pageLoadTimeout(1,TimeUnit.MILLISECONDS);

    			//go to browser and open this url 
    			wd.get("https://www.amazon.in/");
    			JavascriptExecutor js=(JavascriptExecutor) wd;
    			//no of pixels move down
    			
    		//	js.executeScript("window.scrollBy(0,1000)");
    			
    			//till we get the element 
    			WebElement we=wd.findElement(By.linkText("Help"));
    			js.executeScript("arguments[0].scrollIntoView();",we);
    			we.click();
    			
    			//scroll down last of the page 
    			//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

    }
}
