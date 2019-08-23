package 上机练习.多态;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("欢迎您来到汽车租赁公司！");
        System.out.println("请输入要租赁的天数：");
        int  days = in.nextInt();
        System.out.println("请输入要租赁的汽车类型（1、轿车2、客车）");
        switch (in.nextInt()){
            case 1:
                SaloonCar saloonCar =new SaloonCar();
                System.out.println("请输入要租赁的汽车品牌1、宝马2、别克");
                switch (in.nextInt()){
                    case 1:
                        saloonCar.brand="宝马";
                        saloonCar.rent=500;
                        break;
                    case 2:
                        saloonCar.brand="别克";
                        System.out.println("请输入您的汽车型号2、商务舱3、林荫大道");
                        switch (in.nextInt()){
                            case 1:
                                saloonCar.rent=600;
                                break;
                            case 2:
                                saloonCar.rent=300;
                                break;

                        }
                        System.out.println( saloonCar.calRent(days));

                        break;

                }


                break;

        }
        Bus bus = new Bus();

    }


}
