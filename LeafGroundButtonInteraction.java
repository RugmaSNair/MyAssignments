package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByChained;

public class LeafGroundButtonInteraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("https://leafground.com/button.xhtml");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.manage().window().maximize();
driver.findElement(By.xpath("//span[text()='Click']")).click();
String title = driver.getTitle();
System.out.println("The title of the page is "+title);



driver.navigate().back();
boolean button = driver.findElement(By.xpath("//button[@disabled='disabled']")).isEnabled();
if (button==false)
	System.out.println("The button is disabled");
else
	 System.out.println("The button is not disabled");
Point location = driver.findElement(By.name("j_idt88:j_idt98")).getLocation();
System.out.println("The position of the button with text submit is "+location);
String color=driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("background-color");
System.out.println("The background color is " +color);
int height = driver.findElement(By.name("j_idt88:j_idt98")).getSize().getHeight();
int width = driver.findElement(By.name("j_idt88:j_idt98")).getSize().getWidth();
System.out.println("The height is "+height+ " and the width is " +width);
driver.close();


 
	}

}
