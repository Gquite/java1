public class Student1 {
    String name;
    int age;
    public boolean  setAge (){
        if (age<16){
            System.out.print("错误");
            return false;
        }
        return true;
    }
    public  void  Show(){
        System.out.println(name+age);
    }
}
