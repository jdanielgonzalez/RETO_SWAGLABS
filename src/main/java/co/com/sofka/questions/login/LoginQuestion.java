package co.com.sofka.questions.login;

import co.com.sofka.util.error_message.ErrorMessage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class LoginQuestion implements Question<Boolean> {

    private Target target;


    public LoginQuestion setTarget(Target target) {
        this.target = target;
        return this;
    }

    public LoginQuestion is()
    {

        return this;
    }

    @Override

    public Boolean answeredBy(Actor actor) {
        return (target.resolveFor(actor).containsOnlyText(ErrorMessage.ERRORMESSAGE1.getValue())
                || target.resolveFor(actor).containsOnlyText(ErrorMessage.ERRORMESSAGE2.getValue())
                || target.resolveFor(actor).containsOnlyText(ErrorMessage.ERRORMESSAGE3.getValue())
                || target.resolveFor(actor).containsOnlyText(ErrorMessage.ERRORMESSAGE4.getValue())
        );
    }

    public static LoginQuestion loginQuestion()
    {
        return new LoginQuestion();
    }
}
