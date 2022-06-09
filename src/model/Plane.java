package model;

public class Plane {
   private String model;
   private String country;
   private int year;
   private long hours;
   private boolean isMilitary;
   private int weigth;
   private int wingspan;
   private int topSpeed;
   private int seats;
   private double cost;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public long getHours() {
        return hours;
    }

    public void setHours(long hours) {
        this.hours = hours;
    }

    public boolean isMilitary() {
        return isMilitary;
    }

    public void setMilitary(boolean military) {
        isMilitary = military;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void printInfo(){
        System.out.println("Model -" + model);
        System.out.println("Country -" + country);
        System.out.println("Year -" + year);
        System.out.println("Hours -" + hours);
        System.out.println("isMilitary -" + (isMilitary ? "yes" : "no"));
        System.out.println("Weigth -" + weigth);
        System.out.println("Wingspan -" + wingspan);
        System.out.println("topSpeed -" + topSpeed);
        System.out.println("Seats -" + seats);
        System.out.println("Cost -" + cost);
    }
}
