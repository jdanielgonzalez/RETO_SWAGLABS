package co.com.sofka.stepdefinition.setup;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class SetUp {
    @Managed()
    protected WebDriver browser;

    protected void setUpBrowser(WebDriver browser)
    {
        browser.manage().window().maximize();
    }

    protected void setUpUser(String name, WebDriver browser)
    {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(name).can(BrowseTheWeb.with(browser));
    }

    protected void actorSetUpTheBrowser(String actor_name)
    {
        setUpBrowser(this.browser);
        setUpUser(actor_name,this.browser);
    }
}
