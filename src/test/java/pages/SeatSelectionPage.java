package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SeatSelectionPage {
    private final By SEAT = By.xpath(".//div[@class = 'seat']");
    private BaseFunc baseFunc;

    public SeatSelectionPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void selectSeat(int seatNr) {
        //Wait for seats to appear
        baseFunc.waitForElementsCountToBeAtLeast(SEAT, 15);
        //Get all seats
        List<WebElement> seats = baseFunc.findElements(SEAT);
        Assertions.assertFalse(seats.isEmpty(), "There is no seats at all!");
        //Find necessary seat
        //Select it
        boolean isSeatFound = false;  //flag is down
        for (WebElement seat : seats) {
            if (Integer.parseInt(seat.getText()) == seatNr) {   //== -> compare => true / false
                seat.click();
                isSeatFound = true; //flag is up
                break;
            }
        }

        Assertions.assertTrue(isSeatFound, "Seat Nr. " + seatNr + " is not found!");



        //----------- FOR -----------------
//        for (int i = 0; i < seats.size(); i++) {  // i = i + 1 => i++
//            System.out.println(seats.get(i).getText());
            //do something
//        }

        //------------FOR EACH-------------
//        for (WebElement seat : seats) {
//            System.out.println(seat.getText());
            //do something
//        }
    }
}
