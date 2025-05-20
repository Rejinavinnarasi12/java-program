import java.util.Scanner;
class ex5{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String clour = scan.nextLine();
        if(clour.equals("red"))
        {
            System.out.print("stop");
        }
        else if(clour.equals("yellow"))
        {
            System.out.print("get ready");
        }
        else if(clour.equals("green"))
        {
            System.out.print("go");
        }
    }
}