package Selenium.Sikuli_image_recogniation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FindFailed
    {
        //System.out.println( "Hello World!" );
    	//register the webdriver =>browser vendor 
		WebDriverManager.chromedriver().setup();
		//creating an object to the object
		WebDriver wd=new ChromeDriver();
		//maximize the browser
		wd.manage().window().maximize();

		//webpage timebound 

	//go to browser and open this url 
		wd.get("https://www.amazon.in/");
		
		
		Screen sc=new Screen();
		Pattern p1=new Pattern("C:\\Users\\rishu\\Downloads\\1.png");
		sc.type(p1,"Green Hoodies");
		System.out.println("search working");
		Pattern p2=new Pattern("C:\\Users\\rishu\\Downloads\\2.png");
		System.out.println("searched");
		sc.click(p2);
//		Screen sc=new Screen();
//		Pattern p1-new Pattern()
    }
}
