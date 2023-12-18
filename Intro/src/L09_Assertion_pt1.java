

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L09_Assertion_pt1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sbrun\\OneDrive - Learn Automation\\Desktop\\Resources\\driver_v1\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.automationtesting.co.uk");
		
		String pageTitle = driver.getTitle();
		
		//assertion that passes because the expected and actual value matches:
		Assert.assertEquals("Homepage1", pageTitle);
		
		//assertion that fails because of a miss match:
		Assert.assertEquals("Homepage", pageTitle);

	}

}
