import java.util.Scanner;
class ex6{
    public static void main(String arrgs[]){

        Scanner scan = new Scanner(System.in);
        System.out.print("enter your salary: ");
        int salary = scan.nextInt();
        System.out.print("enterr your age: ");
        int age = scan.nextInt();
        if(salary>=20000 || age<=25)
        {
            System.out.println("eligible for loan");
            System.out.println("enter your loan amount");
            int loan = scan.nextInt();
            if(loan<=50000)
            {
                System.out.println("avaliable loan");
            
            }
            else{
                System.out.println("not avaliable loan");
            }
        }
        else{
            System.out.println("not eligible for loan");
        }
        }
    }
