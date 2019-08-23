package 上机练习.继承;

public class Trapezoid extends Count {
    private double upperBase;
    private double bottomBase;
    private double tall;

    public double getUpperBase() {
        return upperBase;
    }

    public void setUpperBase(double upperBase) {
        this.upperBase = upperBase;
    }

    public double getBottomBase() {
        return bottomBase;
    }

    public void setBottomBase(double bottomBase) {
        this.bottomBase = bottomBase;
    }

    public double getTall() {
        return tall;
    }

    public void setTall(double tall) {
        this.tall = tall;
    }

    public  double countArea(){
        return  (this.upperBase*this.bottomBase)+this.tall/2;
    }

}
