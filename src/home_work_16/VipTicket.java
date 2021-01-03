package home_work_16;

public class VipTicket extends Ticket {
    private Baggage baggage;
    private Meal meal;

    public VipTicket(int sitNumber, FlightInfo flightInfo, Passenger passenger, Meal meal, Baggage baggage) {
        super(sitNumber, flightInfo, passenger);
        this.meal = meal;
        this.baggage = baggage;
    }

    @Override
    public int getCost() {
        return super.getCost() + meal.getPrice() + baggage.getFee();
    }

    @Override
    public String toString() {
        return
                "VipTicket{" +
                        "sitNumber=" + getSitNumber() +
                        ", meal='" + meal.toString() + '\'' +
                        ", baggage='" + baggage.toString() + '\'' +
                        ", price=" + this.getCost() + '$' +
                        '}';
    }
}
