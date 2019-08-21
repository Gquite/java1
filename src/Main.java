import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        Seller seller = new Seller();
        seller.setName("小明");
        System.out.println("欢迎来到汽车店");
        System.out.println("请选择你要买的车辆品牌"+"1、凯越"+"\t"+"2、君威");
        switch (in.next()){
            case "1":
                System.out.println("请选择你要买的款式"+"1、越野车2、商务车");
                switch (in.next()){
                    case "1":
                        Excelle excelle =new Excelle("10001","越野车");
                        System.out.println( );

                }

        }
    }
}
