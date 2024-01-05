package Selenium.SeleniumAlertBox;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException

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
    			wd.get("http://127.0.0.1:5500/index.html");
    			 wd.findElement(By.xpath("/html/body/button")).click();
    			Alert alert=wd.switchTo().alert();
    			System.out.println(alert.getText());
    			alert.dismiss();
    			System.out.println(alert.getText());
    			alert.dismiss();
    			Thread.sleep(2000);
    			wd.findElement(By.xpath("/html/body/button")).click();
    			Alert alert1=wd.switchTo().alert();
    			System.out.println(alert1.getText());
    			alert1.accept();
    			System.out.println(alert1.getText());
    			alert.dismiss();

    			wd.close();

    }
}
