package AmozonApplication;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.edge.EdgeOptions;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AmozonAppDockerTest {
	WebDriver driver;

	@Parameters({ "bname" })
	@Test
	public void CrossbrowserTest(String bname) throws MalformedURLException, InterruptedException {
		if (bname.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			driver = new RemoteWebDriver(new URL("http://localhost:4444"), options);
			System.out.println("Connected with Chrome Driver");
		}
		if (bname.equalsIgnoreCase("firefox")) {
			FirefoxOptions options = new FirefoxOptions();
			driver = new RemoteWebDriver(new URL("http://localhost:4444"), options);
			System.out.println("Connected with Firefox");
		}
		if (bname.equalsIgnoreCase("edge")) {
			EdgeOptions options = new EdgeOptions();
		driver = new RemoteWebDriver(new URL("http://localhost:4444"), options);
			System.out.println("Connected with Edge");
		}
		Thread.sleep(4000);
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		System.out.println("Amazom Application Excecuting Parallelly");

	}
}
