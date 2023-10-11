package pages;

import model.tickets.Flight;
import model.tickets.Passenger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class PassengerInfoPage {
    private final By FIRST_NAME = By.id("name");
    private final By LAST_NAME = By.id("surname");
    private final By DISCOUNT = By.id("discount");
    private final By ADULTS = By.id("adults");
    private final By CHILDREN = By.id("children");
    private final By BAG = By.id("bugs");
    private final By FLIGHT = By.id("flight");
    private final By FLIGHT_INFO = By.xpath(".//span[@class = 'bTxt']");
    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    private BaseFunc baseFunc;

    public PassengerInfoPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void fillInPassengerInfo(Flight flight, Passenger passenger) {
        LOGGER.info("Filling in passenger and flight info");
        baseFunc.type(FIRST_NAME, passenger.getFirstName());
        baseFunc.type(LAST_NAME, passenger.getLastName());
        baseFunc.type(DISCOUNT, flight.getDiscount());
        baseFunc.type(ADULTS, flight.getPassengersCount());
        baseFunc.type(CHILDREN, flight.getChildCount());
        baseFunc.type(BAG, flight.getLuggageCount());
        baseFunc.selectByText(FLIGHT, flight.getFlightDate());
    }

    public String getDepartureAirport() {
        LOGGER.info("Getting departure airport");
        return baseFunc.waitForNumbersOfElementsToBe(FLIGHT_INFO, 5).get(0).getText();
    }

    public String getArrivalAirport() {
        return baseFunc.waitForNumbersOfElementsToBe(FLIGHT_INFO, 5).get(1).getText();
    }
}
