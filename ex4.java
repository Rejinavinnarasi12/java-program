import java.util.Scanner;
class ex4{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int s1 = scan.nextInt();
        int s2 = scan.nextInt();
        int s3 = scan.nextInt();
        int s4 = scan.nextInt();
        int s5 = scan.nextInt();
        int total = s1+s2+s3+s4+s5;
        float avg = total/5;
        if(avg<35)
        {
            System.out.println("additional class is required");
        }
        else{
            System.out.println("very good");
        }
    }
}