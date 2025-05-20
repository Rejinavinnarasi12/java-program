import java.util.Scanner;
class example1
{
   public static void main(String args[]) 
   {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    if(num%3 == 0 && num%5 == 0)
    {
        System.out.println("yes");
    
    }
    else{
        System.out.print("no");
    }
   }
}