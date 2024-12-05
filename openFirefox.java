package selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;




public class openFirefox {

	public static void main(String[] args) throws InterruptedException {

		
	 System.setProperty("webdriver.gecko.driver","C:\\( A )\\QA Automation file\\Web Driver\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	 WebDriver driver = new FirefoxDriver();
		
	
		driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/Link.html");
	    Thread.sleep(5000);
	    
	    
	 //Hyper link Automation
	    
	              driver.findElement(By.linkText("Go to Home Page")).click();
	                Thread.sleep(2000);
	              // driver.findElement(By.partialLinkText("Home")).click();       The same method is used
	                Thread.sleep(2000);
	          
	//Edit Fields Automation
	              
	          driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/Edit.html");
	            Thread.sleep(3000);
	            
	            WebElement emailbox = driver.findElement(By.id("email"));
	               emailbox.sendKeys("ABC1234@gmail.com");
	                  Thread.sleep(3000);
	          
	            WebElement appendbox = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/input"));
	               appendbox.sendKeys("a text"+Keys.TAB);
	                 Thread.sleep(1000);
	                 
	            WebElement copy = driver.findElement(By.name("username"));
	               String text = copy.getAttribute("value");
	               System.out.println(text);
	               Thread.sleep(5000);
	          
	           WebElement clearpart = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div/div/input"));
	             clearpart.clear();
	                Thread.sleep(4000);
	    
	           WebElement disabled = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[5]/div/div/input"));
	              boolean answer = disabled.isEnabled();
	              System.out.println(answer);
	                Thread.sleep(6000);
	                
	 
	 //Buttons Automation
	                
	          driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/Button.html");
	            WebElement location = driver.findElement(By.id("position"));	
	          
	              int xvalue = location.getLocation().getX();
	              int yvalue = location.getLocation().getY();
	          
	                System.out.println("X value is :"+xvalue);
	                System.out.println("Y value is :"+yvalue);
	                Thread.sleep(6000);
	          
	          
	            WebElement Colorfind = driver.findElement(By.id("color"));
	              String result = Colorfind.getCssValue("background-color");
	              System.out.println("Button Color is :"+result);
	              Thread.sleep(6000);
	          
	            WebElement size = driver.findElement(By.id("size")); 
	            
	              int height = size.getSize().getHeight();
	              int width = size.getSize().getWidth();
	                System.out.println("Button height is :"+height);
	                System.out.println("Button width is :"+width);
	                Thread.sleep(7000);
	          
	           WebElement Home =  driver.findElement(By.id("home"));
	             Home.click();
	             Thread.sleep(4000);
	         
	                 
      //Radio Buttons Automation
	          
	          driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/radio.html");
	            WebElement Radiobutton = driver.findElement(By.id("yes"));
	              Radiobutton.click();

	            WebElement findunchecked = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/label[2]/input"));
	            WebElement Checked = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/label[3]/input"));
	              Thread.sleep(4000);
	              
	                if(findunchecked.isSelected()== false)
	                    {
	                           System.out.println("**indunchecked button Not selected**");
	                 
	                    }
	                if(Checked.isSelected() )
	                    {
	                           System.out.println("**Checked button selectedd**");
	                    }
	                
	               Thread.sleep(2000);
	          
	          
	          WebElement radio = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/input[3]"));
	          
	                if(radio.isSelected()== false)
	                   {
	                         radio.click();
	                   }
	    
	                Thread.sleep(2000);  
	                
	                
	  //Check boxes Automation
	           
	           driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/checkbox.html");
	           Thread.sleep(5000);

	           WebElement java =  driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div[1]/input"));
	           WebElement Vb =  driver.findElement(By.xpath(" /html/body/div/div/div[3]/section/div[1]/div[2]/input"));
	           WebElement Sql =  driver.findElement(By.xpath(" /html/body/div/div/div[3]/section/div[1]/div[3]/input"));
	           
	               java.click();
	               Vb.click();
	               Sql.click();
	               Thread.sleep(4000);
	               
	           WebElement selenium = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/input"));
	           
	                       if(selenium.isSelected()==true)
	                             {
	                                     System.out.println("##selenium check box selected##");
	            
	                             }
	                
	                       else
	                             {
	                                     System.out.println("##seleium No checked##");
	                              }

	               Thread.sleep(4000);
	                  driver.close();
	

	}

}
