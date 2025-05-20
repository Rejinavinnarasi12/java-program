//print 1to10 num odd or even using for loop
import java.util.Scanner;
class forex3{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter num a:");
        int a = scan.nextInt();
        System.out.print("enter num b:");
        int b = scan.nextInt();
        for(int i=a; i<=b; i=i+1){
            if(i%2==0){
                System.out.println("even "+i);
            }
            else
            {
                System.out.println("odd "+i);
            }
            
        }

    }
}