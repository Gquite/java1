package 上机练习.多态;

public final class Bus extends Car {

    private int  seatCount;

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }


    public int   calRent(int days){
        Bus bus = new Bus();
        return days*bus.rent;
    }
}
