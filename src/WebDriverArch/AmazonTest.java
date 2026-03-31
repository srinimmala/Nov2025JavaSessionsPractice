package WebDriverArch;

public class AmazonTest {

	static WebDriver driver;//null

	public static void main(String[] args) {

		// ChromeDriver driver = new ChromeDriver();
		// FirefoxDriver driver = new FirefoxDriver();
		// EdgeDriver driver = new EdgeDriver();
		// SafariDriver driver = new SafariDriver();

		//cross browser logic
		String browser = "chrome";

		switch (browser.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("plz pass the valid browser..." + browser);
			break;
		}

		driver.get("https://www.amazon.com");
		String title = driver.getTitle();
		System.out.println(title);

		driver.findElement("emailId");
		driver.sendKeys("emailId", "naveen@gmail.com");

		driver.findElement("password");
		driver.sendKeys("password", "naveen@123");

		driver.findElement("loginBtn");
		driver.click("loginBtn");

		driver.quit();

	}

}
