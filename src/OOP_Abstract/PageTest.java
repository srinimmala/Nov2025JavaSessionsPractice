package OOP_Abstract;

public class PageTest {
public static void main(String[] args) {
		
		LoginPage lp = new LoginPage(10);
		
		lp.title();
		lp.url();
		lp.loadingTime();
		Page.logo();
		lp.doLogin();
		
		
		//top casting: child class object can be referred by abstract parent class ref variable.
		Page p = new LoginPage();
		p.title();
		p.url();
		p.loadingTime();
		
		//down casting: NA
		
		

	}

}