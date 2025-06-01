import java.util.Scanner;

public class College_Admission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("STUDENT NAME : ");
        String name = sc.nextLine();
        System.out.println("12TH% MARKS : ");
        double marks = sc.nextDouble();
        System.out.println("BRANCH APPLIED FOR :  (CSE/EC/ME)");
        String branch = sc.next();
        System.out.println("STUDENT CATEGORY :  (General, OBC, SC, ST) ");
        String category = sc.next();
        System.out.println("HAS EXTRA CURRICULAR ACTIVITIES :  (Yes / No) ");
        String extra = sc.next();
        System.out.println("FINANCIAL BACKGROUND :  (Poor / Average / Good)");
        String back = sc.next();

        int finalPer = 0;
        String status = "";
        String scholarship = "";
        if(extra.equalsIgnoreCase("Yes"))
            finalPer += 5;
        if(category.equalsIgnoreCase("OBC") || category.equalsIgnoreCase("SC") || category.equalsIgnoreCase("ST"))
            finalPer += 5;


        if(branch.equalsIgnoreCase("CSE")){
            if(finalPer>95){
                status = "APPROVED";
            }
            else if(finalPer==95){
                status = "WAITLISTED";
            }
            else {
                status = "REJECTED";
            }
        }
        else if(branch.equalsIgnoreCase("EC")){
            if(finalPer>85){
                status = "APPROVED";
            }
            else if(finalPer==85){
                status = "WAITLISTED";
            }
            else {
                status = "REJECTED";
            }
        }
        else if(branch.equalsIgnoreCase("ME")){
            if(finalPer>60){
                status = "APPROVED";
            }
            else if(finalPer==60){
                status = "WAITLISTED";
            }
            else {
                status = "REJECTED";
            }
        }
        else
        {
            System.out.println();
        }

        if(back.equalsIgnoreCase("POOR"))
            scholarship = "ELIGIBLE";
        else
            scholarship = "NOT ELIGIBLE";


        System.out.println("-----COLLEGE ADMISSION RESULT-----");
        System.out.println("NAME                            : " + name);
        System.out.println("APPLIED STREAM                  : " + branch);
        System.out.println("CATEGORY                        : " + category);
        System.out.println("12TH MARKS                      : " + marks);
        System.out.println("EXTRA CURRICULAR                : " + extra);
        System.out.println("FINANCIAL BACKGROUND            : " + back);
        System.out.println();
        System.out.println("FINAL SCORE AFTER ADJUSTMENTS   : " + (finalPer+marks));
        System.out.println("ADMISSION STATUS                : "+ status);
        System.out.println("SCHOLARSHIP STATUS              : " + scholarship);
        System.out.println("-----------------------------------------------");


    }
}
