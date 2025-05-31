import java.util.*;
public class Fahrenheit_celsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float f = sc.nextFloat();
        float c = (f-32)*5/9;
        System.out.printf("%.2f",c);
    }
}
