package pages;

import model.ReservationInfo;
import org.openqa.selenium.By;

public class PassengerInfoPage {
    private final By FIRST_NAME = By.id("name");
    private final By LAST_NAME = By.id("surname");
    private final By DISCOUNT = By.id("discount");
    private final By ADULTS = By.id("adults");
    private final By CHILDREN = By.id("children");
    private final By BAG = By.id("bugs");
    private final By FLIGHT = By.id("flight");

    private BaseFunc baseFunc;

    public PassengerInfoPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void fillInPassengerInfo(ReservationInfo reservationInfo) {
        baseFunc.type(FIRST_NAME, reservationInfo.getFirstName());
        baseFunc.type(LAST_NAME, reservationInfo.getLastName());
        baseFunc.type(DISCOUNT, reservationInfo.getDiscount());
        baseFunc.type(ADULTS, reservationInfo.getPassengerCount());
        baseFunc.type(CHILDREN, reservationInfo.getChildCount());
        baseFunc.type(BAG, reservationInfo.getBagsCount());
        baseFunc.selectByText(FLIGHT, reservationInfo.getFlightDate());
    }

    public String getDepartureAirport() {
        String airport = "";
        //Finding element by locator
        //Getting text
        return airport;
    }
}
