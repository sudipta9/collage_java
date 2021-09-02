public class accessAnotherClassObj {
    public static void main(String[] args) {
        anotherClass student = new anotherClass();

        System.out.println(student.USN);
        System.out.println(student.Name);
    }
}
class anotherClass{
    int USN = 65;
    String Name = "Sudipta";
}