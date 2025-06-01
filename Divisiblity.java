import java.util.Scanner;

public class Divisiblity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%5==0 && n%11==0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
