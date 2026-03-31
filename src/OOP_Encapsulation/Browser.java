package OOP_Encapsulation;

public class Browser {
	public void launchBrowser() {
		System.out.println("launching browser....");
		checkBrowserVersion();
		checkOSCompatibility();
		checkBrowserIsUpgraded();
		checkRAMAvailable();
		System.out.println(" chrome browser launched scucessfully....");
	}

	private void checkBrowserVersion() {
		System.out.println("checkBrowserVersion");
	}

	private void checkOSCompatibility() {
		System.out.println("checkOSCompatibility");
	}

	private void checkBrowserIsUpgraded() {
		System.out.println("checkBrowserIsUpgraded");
	}

	private void checkRAMAvailable() {
		System.out.println("checkRAMAvailable");
	}


}
