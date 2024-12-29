package BusReservation;

import java.util.*;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat; 
public class Booking {
    String passengername;
    int BusNO;
    Date date;

    Booking(){
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter your name:");
        passengername= scn.next();
        System.out.println("Enter bus no:");
        BusNO=scn.nextInt();
        System.out.println("Enter date like (dd-MM-yyyy)");
        String dateInput=scn.next();
        SimpleDateFormat dateFormate=new SimpleDateFormat("dd-MM-yyyy");

        try {
            date=dateFormate.parse(dateInput);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses){
        int capacity=0;
        for(Bus bus:buses){
            if(bus.getBus()==this.BusNO){
                capacity=bus.getCapacity();
            }            
        }
        int booked=0;
        for(Booking b:bookings){
            if(b.BusNO==this.BusNO && b.date.equals(this.date)){
                booked++;
            }
        }
        return booked<capacity?true:false;
    }
}
