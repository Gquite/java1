import org.junit.Test;

import java.util.Scanner;
public class StunentTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student1 s1=new Student1();
        System.out.print("请输入你的姓名：");
        s1.name= input.next();

        System.out.println("请输入您的年龄");
        s1.age=input.nextInt();

        if ( s1.setAge()){
            s1.Show();
        }

    }
    }



