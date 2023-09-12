package week1.day1;

public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser bw =new Browser();
		bw.browserName("Chrome");
		bw.loadUrl();
	}
	public String browserName(String browser) {
		System.out.println("Browser launched successfully");
		return "browserName";
	}
	public void loadUrl() {
		System.out.println("Application url loaded successfully");

	}
}