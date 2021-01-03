package home_work_16;

public class Passenger {
    private String name;
    private String lastName;
    private long passport;

    public Passenger(String name, String lastName, long passport) {
        this.name = name;
        this.lastName = lastName;
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "PassengerInfo{" +
                "name=" + this.name +
                ", lastName=" + this.lastName +
                ", passport=" + this.passport +
                '}';
    }
}
