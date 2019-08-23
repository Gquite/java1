package 上机练习.多态;

public final class SaloonCar extends Car {
    public  String  type;
    private String  no;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

  ;


    public int  calRent(int days){
        SaloonCar saloonCar = new SaloonCar();
        return days*saloonCar.rent;

    }



}
