import java.util.Scanner;
class array{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int score[] = new int[5];

        score[0] = scan.nextInt();
        score[1] = scan.nextInt();
        score[2] = scan.nextInt();
        score[3] = scan.nextInt();
        score[4] = scan.nextInt();
        {
            System.out.println(score[0]+score[1]+score[2]+score[3]+score[4]);
        }



    }
}