package service;

import model.Plane;

import java.util.Scanner;

public class PlaneService {

    public Plane create(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter model of plane");
        String model = scanner.next();
        System.out.println("Enter country");
        String country = scanner.next();
        System.out.println("Enter year");
        int year = scanner.nextInt();
        System.out.println("Enter hours");
        long hours = scanner.nextLong();
        System.out.println("Enter isMilitary true or false");
        boolean isMilitary = scanner.nextBoolean();
        System.out.println("Enter weigth");
        int weigth = scanner.nextInt();
        System.out.println("Enter wingspan");
        int wingspan = scanner.nextInt();
        System.out.println("Enter top speed");
        int topSpeed = scanner.nextInt();
        System.out.println("Enter seats");
        int seats = scanner.nextInt();
        System.out.println("Enter cost");
        double cost = scanner.nextDouble();
       Plane plane = new Plane();
       plane.setModel(model);
       plane.setCountry(country);
       plane.setYear(year);
       plane.setHours(hours);
       plane.setMilitary(isMilitary);
       plane.setWeigth(weigth);
       plane.setWingspan(wingspan);
       plane.setTopSpeed(topSpeed);
       plane.setSeats(seats);
       plane.setCost(cost);
       return plane;

    }
   public void task2 (Plane p1){
        if(p1.isMilitary()){
            System.out.println(p1.getCost() + p1.getTopSpeed());
        }else {
            System.out.println(p1.getModel() + p1.getCountry());
        }
   }

  public Plane task3 (Plane p1,Plane p2){
        if(p1.getYear() > p2.getYear()){
            return p1;
        } else if (p1.getYear() < p2.getYear()) {
            return p2;
        }else {
            return p1;
        }
  }


}
