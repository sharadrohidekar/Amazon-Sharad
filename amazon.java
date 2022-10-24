package stepDefinition;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class amazon {

		WebDriver driver;

	@Given("^user navigates the application$")
	public void user_navigates_the_application() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ashwini\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
	        driver.manage().window().maximize();
		    driver.get("https://amazon.in/");
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
   
}

	@When("^user clicks on All option$")
	public void user_clicks_on_All_option() {
	driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/span")).click();
	}

	@Then("^user navigates to TV, appliances, Electronics tab and click on it$")
	public void user_navigates_to_TV_appliances_Electronics_tab_and_click_on_it() {
		driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[16]/a")).click();
	}

	@Then("^user click on Television$")
	public void user_click_on_Television() {
		driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[9]/li[3]/a")).click();
	
}

	@Then("^scroll the page$")
	public void scroll_the_page() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,3000)");
}

	@Then("^filter it by Samsung$")
	public void filter_it_by_Samsung() throws InterruptedException{
		driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Samsung']")).click();
		Thread.sleep(3000);
	}
	

	@Then("^sort it by price high to low$")
	public void sort_it_by_price_high_to_low() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]/span[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"s-result-sort-select_2\"]")).click();
		Thread.sleep(3000);

}

	@Then("^click on the 2nd highest price$")
	public void click_on_the_2nd_highest_price() {
		driver.findElement(By.xpath("//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[3]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/h2[1]")).click();
		
	}

	@Then("^switch to the child window$")
	public void switch_to_the_child_window() {
		String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();

        // Here we will check if child window has other child windows and will fetch the heading of the child window
        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
                if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
         
            }
        }
}

	@Then("^assert about the item in the page$")
	public void assert_about_the_item_in_the_page() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		WebElement abt = driver.findElement(By.xpath("//*[@id=\"feature-bullets\"]/h1"));
		js.executeScript("arguments[0].scrollIntoView(true)",abt);
		String about = driver.findElement(By.xpath("//*[@id=\"feature-bullets\"]/ul")).getText();
		System.out.println(about);
		
		
		
		
		
		
		
		
	}
	}