import java.util.Scanner;

public class Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=90 && n<=100)
            System.out.println("A");
        else if(n>=75 && n<=89)
            System.out.println("B");
        else if(n>=50 && n<=74)
            System.out.println("C");
        else
            System.out.println("F");
    }
}
