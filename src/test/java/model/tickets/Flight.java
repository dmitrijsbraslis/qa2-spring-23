package model.tickets;

public class Flight {
    private String departure;
    private String arrival;
    private String discount;
    private int passengersCount;
    private int childCount;
    private int luggageCount;
    private String flightDate;
    private int seatNr;

    public Flight(String departure, String arrival, String discount, int passengersCount, int childCount, int luggageCount, String flightDate, int seatNr) {
        this.departure = departure;
        this.arrival = arrival;
        this.discount = discount;
        this.passengersCount = passengersCount;
        this.childCount = childCount;
        this.luggageCount = luggageCount;
        this.flightDate = flightDate;
        this.seatNr = seatNr;
    }

    public Flight() {}

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public int getPassengersCount() {
        return passengersCount;
    }

    public void setPassengersCount(int passengersCount) {
        this.passengersCount = passengersCount;
    }

    public int getChildCount() {
        return childCount;
    }

    public void setChildCount(int childCount) {
        this.childCount = childCount;
    }

    public int getLuggageCount() {
        return luggageCount;
    }

    public void setLuggageCount(int luggageCount) {
        this.luggageCount = luggageCount;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    public int getSeatNr() {
        return seatNr;
    }

    public void setSeatNr(int seatNr) {
        this.seatNr = seatNr;
    }
}
