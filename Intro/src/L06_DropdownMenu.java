
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class L06_DropdownMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sbrun\\OneDrive - Learn Automation\\Desktop\\Resources\\driver_v1\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.automationtesting.co.uk/dropdown.html");
		
		Select menuItem = new Select(driver.findElement(By.cssSelector("select#cars")));
		
		//selecting by visible text as it appears on the web page:
		menuItem.selectByVisibleText("Honda");
		
		//selecting by option value (as it appears in the HTML):
		menuItem.selectByValue("jeep");
		
		
	}

}
