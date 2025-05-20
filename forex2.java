import java.util.Scanner;
class forex2{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number a:");
        int a = scan.nextInt();
        System.out.println("Enter number b:");
        int b = scan.nextInt();
        for(int i=a; i<=b; i=1+i)
        {
            System.out.println(i);
        }
    }
}