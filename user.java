import java.util.Scanner;
class user
{
  public static void main (String args[])
  {
    Scanner scan = new Scanner(System.in);
    String Name  = scan.nextLine();
    int age = scan.nextInt();
    scan.nextLine();
    String address = scan.nextLine();
    System.out.println("My name is:" + Name);
    System.out.println("My age is:"  + age);
    System.out.println("My address:" + address);
  }
}