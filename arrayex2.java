// get input 5 num using array and for
import java.util.Scanner;
class arrayex2{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int[] mark = new int[5];
        for(int i=0; i<=5-1; i=i+1)
        {
            mark[i] = scan.nextInt();
        }
        for(int i=0; i<=5-1; i=i+1)
        {
            System.out.println(mark[i]);
        }
    }
}