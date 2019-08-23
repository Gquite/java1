package 上机练习.继承;

public class Circle extends Count {
    private  final double Pai=3.14;
    private  int r;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public  double  countArea  (){

        return Pai*(this.r*this.r);
    }
}
