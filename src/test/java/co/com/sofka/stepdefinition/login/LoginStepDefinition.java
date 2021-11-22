package co.com.sofka.stepdefinition.login;

import co.com.sofka.stepdefinition.setup.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.questions.login.LoginQuestion.loginQuestion;
import static co.com.sofka.tasks.landing_page_task.OpenLandingPageTask.openLandingPageTask;
import static co.com.sofka.tasks.login_task.DoLoginTask.doLoginTask;
import static co.com.sofka.userinterface.login.Login.ERROR_MESSAGE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class LoginStepDefinition extends SetUp {
    private static final String ACTOR_NAME = "daniel";

    private String user;
    private String password;


    @Given("estoy en la pagina")
    public void estoy_en_la_pagina() {
        actorSetUpTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().attemptsTo(
                openLandingPageTask()
        );
    }


    @When("ingreso un usuario y una password")
    public void ingreso_un_usuario_y_una_password(io.cucumber.datatable.DataTable dataTable) {
        user= dataTable.row(0).get(1);
        password= dataTable.row(1).get(1);
        System.err.println(user);
        System.err.println(password);
        if(user.equals("empty")) {user="";}

        if(password.equals("empty")) {password="";}

        theActorInTheSpotlight().attemptsTo(
                doLoginTask().setUser(user).setPassword(password).is()
        );
    }

    @Then("debo ver un mensaje")
    public void debo_ver_un_mensaje() {
        theActorInTheSpotlight().should(
                seeThat(
                        loginQuestion()
                                .setTarget(ERROR_MESSAGE)
                                .is()
                        ,equalTo(true)
                )
        );
    }
}