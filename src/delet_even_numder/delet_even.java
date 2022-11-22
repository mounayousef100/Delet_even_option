package delet_even_numder;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class delet_even {

	public static void main(String[] args) {
		System.setProperty("webdriver.edgedriver.driver","Users\\Abdallah\\Desktop\\edge driver");
		WebDriver driver = new EdgeDriver ();
		driver.get("file:///C:/Users/Abdallah/Desktop/New%20folder/sss.html"
				+ "");
		 List <WebElement> theStudents = driver.findElements(By.tagName("option"));
		  for (int i= 0 ;i<theStudents.size();i++) {
				
		    	if (i%2 == 0) {
		    		theStudents.get(i).click();
		    		System.err.println("sorry i will remove  "+theStudents.get(i).getText() );
	 driver.findElement(By.xpath("//*[@id=\"remove\"]")).click();
		    	}
		    	else {
		    		System.out.println("Sorry i will keep  "+ theStudents.get(i).getText());
		    	}
	}
	}
}
