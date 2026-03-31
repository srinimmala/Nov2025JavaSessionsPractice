package WebDriverArch;

public class FirefoxDriver implements WebDriver {

	public FirefoxDriver() {
		System.out.println("Launch Firefox Browser");
	}

	@Override
	public void findElement(String locator) {
		System.out.println("finding the element using : " + locator);

	}

	@Override
	public void findElements(String locator) {
		System.out.println("finding the elements using : " + locator);

	}

	@Override
	public void get(String url) {
		System.out.println("enter the url : " + url);

	}

	@Override
	public String getTitle() {
		String title = "Amazon home Page";
		return title;
	}

	@Override
	public void click(String element) {
		System.out.println("click on the element : " + element);

	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("send keys the value : " + value + " into " + element);

	}

	@Override
	public void quit() {
		System.out.println("quit browser");

	}

}
