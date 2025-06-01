import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        if(s2.compareTo(s1)==0)
            System.out.println("Same");
        else
            System.out.println("Different");
    }
}
