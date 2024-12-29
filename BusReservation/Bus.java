package BusReservation;

public class Bus {
    private int BusNo;
    private boolean ac;
    private int capacity;

    Bus(int BusNo, boolean ac, int capacity){
        this.BusNo=BusNo;
        this.ac=ac;
        this.capacity=capacity;
    }

    public int getBus(){
        return BusNo;
    }
    public boolean getAc(){
        return ac;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setAc(boolean ac){
        this.ac=ac;
    }
    public void setCapacity(int capacity){
        this.capacity=capacity;
    }
    public void displayDetials(){
        System.out.println("BusNo = "+BusNo+" Ac = "+ac+" Capacity = "+capacity);
    }
}
