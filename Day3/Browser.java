package Week1.Day3;

public class Browser {

	public String launchBrowser(String browserName) {
		System.out.println("Browser launched successfully");
		return browserName;
	}
	
	public void loadUrl() {
		System.out.println("Application url loaded successfully");
	}
	
	public static void main(String[] args) {
		
		Browser brobject = new Browser();
		brobject.launchBrowser("Firefox");
		brobject.loadUrl();
	}
	
}
