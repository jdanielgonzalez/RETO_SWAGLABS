package co.com.sofka.tasks.landing_page_task;

import co.com.sofka.userinterface.landing_page.LandingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenLandingPageTask implements Task {

    private LandingPage landingPage ;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(landingPage));
    }

    public static OpenLandingPageTask openLandingPageTask()
    {
        return new OpenLandingPageTask();
    }
}
