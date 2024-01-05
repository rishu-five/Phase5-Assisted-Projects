package Selenium.seleniumWebEx;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	//register the web driver =>browser vendor 
        WebDriverManager.chromedriver().setup();
        //creating an object to the object
        WebDriver wd=new ChromeDriver();
        //maximize the browser
        wd.manage().window().maximize();
        
        //go to browser and open this url 
        wd.get("http://localhost:4200/");
        //close browser
      //  wd.close();
        wd.findElement(By.xpath("/html/body/app-root/app-admin/html/body/div/div/div/div/div/form/div/div[1]/input")).sendKeys("rishu5@gmail.com");
        wd.findElement(By.xpath("/html/body/app-root/app-admin/html/body/div/div/div/div/div/form/div/div[2]/input")).sendKeys("rishu59");
        wd.findElement(By.xpath("/html/body/app-root/app-admin/html/body/div/div/div/div/div/form/div/div[3]/button")).click();
    }

        
    }

