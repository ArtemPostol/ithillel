package home_work_16;

public class Ticket {
    protected int sitNumber;
    protected FlightInfo flightInfo;
    protected Passenger passenger;

    public Ticket(int sitNumber, FlightInfo flightInfo, Passenger passenger) {
        this.sitNumber = sitNumber;
        this.flightInfo = flightInfo;
        this.passenger = passenger;
    }
    public int getCost() {
        return flightInfo.getCost();
    }

    public int getSitNumber() {
        return sitNumber;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "sitNumber=" + getSitNumber() +
                ", flightInfo='" + flightInfo.toString() + '\'' +
                ", passengerInfo='" + passenger.toString() + '\'' +
                ", price=" + this.getCost() + '$' +
                '}';
    }
}
