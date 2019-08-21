public class Student2 {
    String name;
    int age;
    String sex;
    String major;
    public Student2 (String name,int age){
        this.name=name;
        this.age=age;
        this.sex="男";
        this.major="ACCP";
    }
    public Student2 (String name,String sex,int age,String major){
        this.name=name;
        this.age=age;
        this.sex=sex;
        this.major=major;
    }
    public   void  Show(){
        System.out.println("大家好我叫"+this.name+"今年"+this.age+this.sex+"专业是"+this.major);
    }
}

