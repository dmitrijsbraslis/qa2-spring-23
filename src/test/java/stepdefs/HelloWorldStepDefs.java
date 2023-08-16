package stepdefs;

import io.cucumber.java.en.When;

public class HelloWorldStepDefs {
    @When("we are printing {string} in console")
    public void print_string_to_console(String text) {
        System.out.println(text);
    }
}
