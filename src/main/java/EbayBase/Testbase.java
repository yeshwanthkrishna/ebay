package EbayBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testbase {
    public static WebDriver driver;
	public static Properties prop;
	
	public Testbase()
	{
		prop = new Properties();
		FileInputStream ip;
		try {
			ip = new FileInputStream("C:\\Users\\sai\\eclipse-workspace\\EbayTest\\src\\main\\java\\Ebayproperties\\config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("constructor ended");
		}
	
	public static void initialization() {
		String browsername  = prop.getProperty("browser");
	
		if(browsername.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sai\\Downloads\\c\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if(browsername.equals("firefox")){
			System.setProperty("webdriver.geckodriver", "C:\\Users\\sai\\Downloads\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		
	}


}
