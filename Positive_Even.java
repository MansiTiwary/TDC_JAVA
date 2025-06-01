import java.util.Scanner;

public class Positive_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0)
            if(n%2==0){
                System.out.println("Positive and Even");
            }
            else{
                System.out.println("Positive and Odd");
            }
        else
            if(n%2==0){
                System.out.println("Negative and Even");
            }
            else{
                System.out.println("Negative and Odd");
            }
    }
}
