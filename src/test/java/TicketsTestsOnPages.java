import model.ReservationInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.BaseFunc;
import pages.HomePage;
import pages.PassengerInfoPage;
import pages.SeatSelectionPage;

public class TicketsTestsOnPages {
    private final String URL = "qaguru.lv:8089/tickets";
    private final String DEPARTURE_AIRPORT = "RIX";
    private final String ARRIVAL_AIRPORT = "MEL";
    private int seatNr = 100500;
    private ReservationInfo info = new ReservationInfo("Dmitry", "Tester",
            "CCCCCC", 4, 1, 1, "11-05-2018");

    @Test
    public void successTicketsBookCheck() {
        BaseFunc baseFunc = new BaseFunc();
        baseFunc.openUrl(URL);

        HomePage homePage = new HomePage(baseFunc);
        homePage.selectDepartureAirport(DEPARTURE_AIRPORT);
        homePage.selectArrivalAirport(ARRIVAL_AIRPORT);
        homePage.clickGoGoGoBtn();

        PassengerInfoPage infoPage = new PassengerInfoPage(baseFunc);
        infoPage.fillInPassengerInfo(info);

        //....
        Assertions.assertEquals(DEPARTURE_AIRPORT, infoPage.getDepartureAirport(), "Error!");

        //....
        SeatSelectionPage seatSelectionPage = new SeatSelectionPage(baseFunc);
        seatSelectionPage.selectSeat(seatNr);
    }
}
