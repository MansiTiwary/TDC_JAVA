import java.util.Scanner;
public class Area_Circle {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int r = sc.nextInt();
            float area = 3.1416f * r * r;
            System.out.printf("%.2f",area);
        }
    }
