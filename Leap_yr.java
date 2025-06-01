import java.util.Scanner;

public class Leap_yr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        if(y%4==0)
            if(y%400==0 && y%100==0) {
                System.out.println("Not a Leap year");
            }
            else {
                System.out.println("Leap Year");
            }
        //System.out.println("Leap Year");
    }
}
