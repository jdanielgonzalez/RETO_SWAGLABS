package co.com.sofka.tasks.login_task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterface.login.Login.*;

public class DoLoginTask implements Task {

    private String user;
    private String password;

    public DoLoginTask setUser(String user) {
        this.user = user;
        return this;
    }

    public DoLoginTask setPassword(String password) {
        this.password = password;
        return this;
    }

    public DoLoginTask is() {
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //fill user name
                Scroll.to(USER_NAME),
                Clear.field(USER_NAME),
                Enter.theValue(this.user).into(USER_NAME),

                //fill password
                Scroll.to(PASSWORD),
                Clear.field(PASSWORD),
                Enter.theValue(this.password).into(PASSWORD),

                //clic login buttun
                Scroll.to(BTN_LOGIN),
                Click.on(BTN_LOGIN)
        );
    }

    public static DoLoginTask doLoginTask()
    {
        return new DoLoginTask();
    }
}
