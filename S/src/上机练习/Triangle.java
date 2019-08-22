package 上机练习;

public class Triangle extends  Count{
        private  double tall;
        private  double base;

    public double getTall() {
        return tall;
    }

    public void setTall(double tall) {
        this.tall = tall;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public  double countArea(){
            return tall*tall/2;
        }
}
