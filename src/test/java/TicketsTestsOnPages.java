import model.tickets.Flight;
import model.tickets.Passenger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.BaseFunc;
import pages.HomePage;
import pages.PassengerInfoPage;
import pages.SeatSelectionPage;

public class TicketsTestsOnPages {
    private final String URL = "qaguru.lv:8089/tickets";
    private Passenger passenger = new Passenger("Dmitry", "Tester");
    private Flight flight = new Flight("RIX", "MEL", "CCCCCC", 4, 1,
            1, "11-05-2018", 18);

    @Test
    public void successTicketsBookCheck() {
        BaseFunc baseFunc = new BaseFunc();
        baseFunc.openUrl(URL);

        HomePage homePage = new HomePage(baseFunc);
        homePage.selectDepartureAirport(flight.getDeparture());
        homePage.selectArrivalAirport(flight.getArrival());
        homePage.clickGoGoGoBtn();

        PassengerInfoPage infoPage = new PassengerInfoPage(baseFunc);
        infoPage.fillInPassengerInfo(flight, passenger);

        //....
        Assertions.assertEquals(flight.getDeparture(), infoPage.getDepartureAirport(), "Error!");

        //....
        SeatSelectionPage seatSelectionPage = new SeatSelectionPage(baseFunc);
        seatSelectionPage.selectSeat(flight.getSeatNr());
    }
}
