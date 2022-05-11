package Component;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LeftMenu {
    WebDriver driver;
    public LeftMenu(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public List<WebElement> span_Value(){
    List<WebElement> spans = driver.findElements(By.tagName("span"));return spans;}
    By comboboxturkey = By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[6]");
    public WebElement ComboboxTurkey() {return driver.findElement(comboboxturkey);}
    By IC101 = By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[6]/ul/li[2]/ul/li[1]");
    public WebElement IC101() {return driver.findElement(IC101);}
    By IC102 = By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[6]/ul/li[2]/ul/li[2]");
    public WebElement IC102() {return driver.findElement(IC102);}
}