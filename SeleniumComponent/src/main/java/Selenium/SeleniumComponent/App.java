package Selenium.SeleniumComponent;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    			//    wd.manage().timeouts().pageLoadTimeout(2000,TimeUnit.MILLISECONDS);

    			//go to browser and open this url 
    			wd.get("https://www.amazon.in/");

    			// wd.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
    			WebElement we1=wd.findElement(By.linkText("Start here."));             
    			explictLink(wd,we1,200);
    			WebElement we2=wd.findElement(By.id("ap_customer_name"));
    			explictField(wd,we2,400,"abcd");

    			wd.close();
    		}

    		private static void explictLink(WebDriver wd, WebElement we1, int timeout) {
    			new WebDriverWait(wd, timeout).until(ExpectedConditions.visibilityOf(we1));
    			we1.click();
    		}
    		private static void explictField(WebDriver wd, WebElement we2, int timeout, String value) {
    			new WebDriverWait(wd, timeout).until(ExpectedConditions.visibilityOf(we2));
    			we2.sendKeys(value);


    }
}
