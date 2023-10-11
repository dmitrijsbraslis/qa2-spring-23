package stepdefs;

import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.tickets.Flight;
import model.tickets.Passenger;
import model.tickets.Reservation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import pages.BaseFunc;
import pages.HomePage;
import pages.PassengerInfoPage;
import requesters.TicketsRequester;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class TicketsStepDefs {
    private Passenger passenger = new Passenger();
    private Flight flight = new Flight();
    private BaseFunc baseFunc = new BaseFunc();
    private HomePage homePage;
    private PassengerInfoPage infoPage;
    private List<Reservation> reservations;
    private Reservation reservationFromApi;

    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    @Given("airports:")
    public void set_airports(Map<String, String> params) {
        LOGGER.info("Setting airports");
        flight.setDeparture(params.get("from"));
        flight.setArrival(params.get("to"));
    }

    @Given("passenger info is:")
    public void set_passenger_info(Map<String, String> params) {
        passenger.setFirstName(params.get("first_name"));
        passenger.setLastName(params.get("last_name"));
    }

    @Given("flight info is:")
    public void set_flight_info(Map<String, String> params) {
        flight.setDiscount(params.get("discount"));
        flight.setPassengersCount(Integer.parseInt(params.get("passengers_count")));
        flight.setChildCount(Integer.parseInt(params.get("child_count")));
        flight.setLuggageCount(Integer.parseInt(params.get("luggage_count")));
        flight.setFlightDate(params.get("flight_date"));
        flight.setSeatNr(Integer.parseInt(params.get("seat_nr")));
    }

    @Given("home page is opened")
    public void open_home_page() {
        baseFunc.openUrl("qaguru.lv:8089/tickets");
        homePage = new HomePage(baseFunc);
    }

    @When("we are selecting airports")
    public void select_airports() {
        homePage.selectDepartureAirport(flight.getDeparture());
        homePage.selectArrivalAirport(flight.getArrival());
        homePage.clickGoGoGoBtn();
        infoPage = new PassengerInfoPage(baseFunc);
    }

    @Then("selected airports appears on the passenger info page")
    public void check_selected_airports() {
        Assertions.assertEquals(flight.getDeparture(), infoPage.getDepartureAirport(), "Wrong Departure Airport!");
        //check arrival airport
    }

    @When("we are filling in passenger info")
    public void fill_in_flight_info() {
        infoPage.fillInPassengerInfo(flight, passenger);
    }

    @When("we are requesting all reservations via API")
    public void request_all_reservations() throws JsonProcessingException {
        TicketsRequester requester = new TicketsRequester();
        reservations = requester.getReservations();
    }

    @Then("current reservation exists in the list")
    public void find_reservation() {
        for (Reservation reservation : reservations) {
            if (reservation.getName().equals(passenger.getFirstName())) {
                reservationFromApi = reservation;
                break;
            }
        }

        Assertions.assertNotNull(reservationFromApi, "Can't find reservation!");
    }

    @Then("all data are stored correctly")
    public void check_reservation_data() {
        Assertions.assertEquals(passenger.getLastName(), reservationFromApi.getSurname(), "Wrong Last name!");
        Assertions.assertEquals(flight.getSeatNr(), reservationFromApi.getSeat(), "Wrong Seat Nr!");
        //Another assertions here.... HW
    }
}
