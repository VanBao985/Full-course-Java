package modifier;
public class Modifier {
  public static void main(String[] args) {
    Student  MyObj = new Student();
    System.out.println(MyObj.name);
    System.out.println(MyObj.age);
    System.out.println(MyObj.graduationYear);
    MyObj.study();
    
  }
}