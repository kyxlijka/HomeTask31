import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsersSmokeTest {

	public static WebDriver driver;
@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/user/Desktop/Anhelina/chromedriver");

		//Test for login
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://users.bugred.ru/user/login/index.html"); //open login page

		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("qaanhelina@gmail.com"); //enter login

		driver.findElement(By.xpath("//div[@class='row']//div[1]//form[1]//table[1]//tbody[1]//tr[2]//td[2]//input[1]")).sendKeys("111111"); //enter password

		driver.findElement(By.xpath("//div[@class='row']//div[1]//form[1]//table[1]//tbody[1]//tr[3]//td[2]//input[1]")).click(); //click enter button


	WebElement AddUserButton = driver.findElement(By.xpath("//a[contains(text(), 'Добавить пользователя')]"));
		Assert.assertEquals(true, AddUserButton.isDisplayed()); //verification by element

	driver.findElement(By.xpath("//input[@placeholder=\"Введите email или имя\"]")).sendKeys("qaanhelina@gmail.com"); //find on the page field with text and put text
	driver.findElement(By.xpath("//button[contains(text(),'Найти')]")).click(); //click find button

		driver.findElement(By.xpath("//*[@id=\"fat-menu\"]/a")).click();//open drop-down list with link to account
		driver.findElement(By.xpath("//a[contains(text(),'Личный кабинет')]")).click();//go to personal account

		driver.findElement(By.cssSelector(".form-control[name='name']")).clear();//clear field name
		driver.findElement(By.cssSelector(".form-control[name='name']")).sendKeys("NewName");//add new name

		driver.findElement(By.cssSelector(".form-control[name='gender']")).click();//open gender drop down list
		driver.findElement(By.cssSelector(".form-control[name='gender'] option[value='f']")).click();//chose gender

		driver.findElement(By.cssSelector(".form-control[name='birthday']")).sendKeys("23051990");//enter birthday date

		driver.findElement(By.cssSelector(".form-control[name='date_start']")).sendKeys("28082021");//enter date of start working

		driver.findElement(By.cssSelector("textarea[name='hobby']")).sendKeys("Psychology");//add hobby

		driver.findElement(By.cssSelector(".form-control[name='inn']")).sendKeys("31313131313");//enter inn

		//driver.findElement(By.cssSelector("input[name='act_profile_now']")).click(); //click find button

		//driver.quit();
}

}
