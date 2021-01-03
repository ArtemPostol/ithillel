package home_work_16;

public class FlightInfo {
    private int flightNumber;
    private String departure;
    private String destination;
    private double time;
    private static int cost;

    public int getCost() {
        return cost;
    }

    public  FlightInfo(int flightNumber, String departure, String destination, double time, int cost) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
        this.time = time;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "FlightInfo{" +
                "flightNumber=" + this.flightNumber +
                ", departure='" + this.departure + '\'' +
                ", destination=" + this.destination + '\'' +
                ", time=" + this.time +
                '}';
    }
}
