package BusReservation;
import java.util.ArrayList;
import java.util.Scanner;
public class BusDemo {
    public static void main(String[] args) {
        
        ArrayList<Bus> buses=new ArrayList<Bus>(); 
        ArrayList<Booking> bookings=new ArrayList<Booking>();
        buses.add(new Bus(1, true,2));
        buses.add(new Bus(2, false, 30));
        buses.add((new Bus(3, true, 40)));

        for(Bus b:buses){
            b.displayDetials();
        }
        int choice=1;
        System.out.println("Welcome to Bus Reservation");
        Scanner scn= new Scanner(System.in);

        while(choice==1){
            System.out.println("choose 1. for bus booking & choose 2. for exit");
            choice=scn.nextInt();
            if(choice==1){
                System.out.println("booking");
                Booking booking = new Booking();
                if(booking.isAvailable(bookings, buses)){
                    bookings.add(booking);
                }else{
                    System.out.println("booking is full try another bus or date");
                }
            }else{
                System.out.println("bus res is cancelled");
            }
        }
    }
}
