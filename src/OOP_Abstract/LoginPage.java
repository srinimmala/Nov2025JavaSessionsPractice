package OOP_Abstract;

public class LoginPage extends Page {

	public LoginPage() {
		System.out.println("LP -- default const...");
	}
	
	public LoginPage(int a) {
		System.out.println("LP -- one param const..."+ a);
	}

	@Override
	public void title() {
		System.out.println("LP - title");
	}

	@Override
	public void url() {
		System.out.println("LP - url");
	}

	@Override
	public void loadingTime() {
		System.out.println("Login Page -- loading time : 2 secs");
	}

	public void doLogin() {
		System.out.println("login to app");
	}

}
