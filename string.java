import java.util.Scanner;
class string{
    public static void main(String agrs[]){
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        if(a.equals(b))
        {
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}