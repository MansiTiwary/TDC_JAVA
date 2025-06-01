import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        if(Character.isLowerCase(c.charAt(0)))
            System.out.println("LowerCase");
        else
            System.out.println("UpperCase");
    }
}
