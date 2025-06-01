import java.util.Scanner;

public class Even_Odd_T {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String res = (n%2==0)?"Even":"Odd";
        System.out.println(res);
    }
}
