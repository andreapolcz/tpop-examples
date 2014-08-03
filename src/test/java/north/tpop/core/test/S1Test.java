package north.tpop.core.test;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import java.util.List;
import north.tpop.core.pageobject.Contact;
import north.tpop.core.PageObjectFactory;
import north.tpop.core.pageobject.S1Page;
import north.tpop.core.command.ClickCommand;
import north.tpop.core.until.UntilVisible;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class S1Test {

    private HtmlUnitDriver driver;
    private S1Page page;
    private boolean initialized = false;

    @Before
    public void setup() {
        if (!initialized) {
            driver = new HtmlUnitDriver(BrowserVersion.CHROME);
            driver.setJavascriptEnabled(true);

            PageObjectFactory pageObjectFactory = new PageObjectFactory(driver);
            page = pageObjectFactory.newPageObject(S1Page.class);

            initialized = true;
        }
        driver.get("http://localhost:8085/view/s1.html");
    }

    @Test
    public void wait_until_visible() throws InterruptedException {
        Assert.assertFalse("red should be hidden", page.hiddenText.getWebElement().isDisplayed());
        page.showButton.execute(new ClickCommand());
        page.hiddenText.wait(new UntilVisible());
        Assert.assertTrue("red should be visible", page.hiddenText.getWebElement().isDisplayed());
    }

    @Test
    public void contact_list_should_contain_items() {
        List<Contact> items = page.contacts.items.getElements();
        Assert.assertEquals("contacts items should contain 3 elements", 3, items.size());

        final Contact firstItem = items.get(0);
        Assert.assertEquals("first contact item should have name First", "First", firstItem.name.getText());
        Assert.assertEquals("first contact item should have email first@first.com", "first@first.com", firstItem.email.getText());
    }

}
