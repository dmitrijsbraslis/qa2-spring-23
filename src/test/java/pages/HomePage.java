package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import requesters.TestRequester;

public class HomePage {
    private final By DEPARTURE_SELECT = By.id("afrom");
    private final By ARRIVAL_SELECT = By.id("bfrom");
    private final By GO_BTN = By.xpath(".//span[@class = 'gogogo']");

    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    private BaseFunc baseFunc;

    public HomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void selectDepartureAirport(String airport) {
        LOGGER.info("Selecting departure airport: " + airport);
        baseFunc.selectByValue(DEPARTURE_SELECT, airport);
    }

    public void selectArrivalAirport(String airport) {
        LOGGER.info("Selecting arrival airport: " + airport);
        baseFunc.selectByValue(ARRIVAL_SELECT, airport);
    }

    public void clickGoGoGoBtn() {
        LOGGER.info("Submitting airports");
        baseFunc.click(GO_BTN);
    }
}
