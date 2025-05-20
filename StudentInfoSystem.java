import java.util.*;
class Student {
String name;
int Reg_no ;
int sub1,sub2,sub3;
int total;
float avg;
public void getInput() {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter student's name: ");
name = scanner.nextLine();
System.out.println("Enter student's Reg_no: ");
Reg_no = scanner.nextInt();
scanner.nextLine();
System.out.println("Enter student sub1: ");
sub1 = scanner.nextInt();
System.out.println("Enter student sub2: ");
sub2 = scanner.nextInt();
System.out.println("Enter student sub3: ");
sub3 = scanner.nextInt();
total=sub1+sub2+sub3;
avg=total/3;
}
public void displayInfo() {
System.out.println("\nStudent Information:");
System.out.println("Name: " + name);
System.out.println("Reg_no: " + Reg_no);
System.out.println("Enter student sub1: "+sub1);
System.out.println("Enter student sub2: "+sub2);
System.out.println("Enter student sub3: "+sub3);
System.out.println("total: "+total);
System.out.println("average: "+avg);
}
}
public class StudentInfoSystem {
public static void main(String[] args) {
Student student = new Student();
student.getInput();
student.displayInfo();


}
}