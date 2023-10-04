
public class GoogleTest {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/login");
	driver.findElement(By.id("Username")).SendKeys("tomsmith");
	driver.findElment(By.id("password")).SendKeys("SuperSecretPassword!");
	driver,findElement(By.className("radius")).Click();
}
}
