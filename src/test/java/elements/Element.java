package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static conf.TestManager.getDriver;

public abstract class Element {
    protected By by;
    protected WebDriver driver = getDriver();

    public Element(By by) {
        this.by = by;
    }

    WebElement compose() {
        return driver.findElement(by);
    }

    public void click() {
        compose().click();
    }

    public boolean elementExists(){
        try {
            compose();
            return true;
        } catch (NullPointerException exception) {
            return false;
        }

    }


}
