package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import model.Data;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.Login;
import tasks.OpenFirtsPage;
import tasks.SigIn;
import tasks.Sing;
import userinterface.UtestSigIn;

import java.util.List;


public class ChoucairTecnicoStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than anyer wants to join at Utest$")
    public void thanAnyerWantsToJoinAtUtest(List<Data> data) throws Exception  {
        OnStage.theActorCalled("Anyer").attemptsTo(OpenFirtsPage.thePage(),
                                Login.onPage(data.get(0).getName(),data.get(0).getLastName(),data.get(0).getEmail()));

    }


    @When("^See what i will do there$")
    public void seeWhatIWillDoThere(List<Data> data)throws Exception {
        OnStage.theActorInTheSpotlight().wasAbleTo(SigIn.loadSigIn(), UtestSigIn.sigIn(),
                Sing.form(data.get(0).getSingEmail(),data.get(0).getPassword()));

    }

    @Then("^find something$")
    public void findSomething() {

    }
}
